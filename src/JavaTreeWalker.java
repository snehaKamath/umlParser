import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeWizard;

import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaLexer;
import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaParser;
import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaTreeParser;

import java.lang.reflect.Method;

public class JavaTreeWalker {
  // class name of each input java file in the test input folder
  String className;
  // Maintain an arraylist of private variables
  ArrayList<String> privateVariables = new ArrayList<String>();
  // Maintain an arraylist of private variables to be replaced as public incase
  // there is a public getter and setter method for it.
  ArrayList<String> replacePrivateVariables = new ArrayList<String>();
  // Maintain an arraylist of getter setter methods to show private variables as
  // public in the uml diagram.
  ArrayList<String> replaceGetterSetter = new ArrayList<String>();
  // Maintain a list of references to be shown as associations.
  ArrayList<String> referenceList = new ArrayList<String>();
 //Maintain a hashtable as dependencies dealing with interfaces.
  Hashtable<String, String> dependencies = new Hashtable<String, String>();
  // Maintain a table of unique references to avoid duplicate association lines.
  ArrayList<String> uniqueReferences = new ArrayList<String>();

  // Open the uml diagram image in the browser
  public void openURL(String url) {
    String osName = System.getProperty("os.name");

    try {
      if (osName.startsWith("Mac OS")) {
        Runtime runtime = Runtime.getRuntime();
        String[] args = { "osascript", "-e", "open location \"" + url + "\"" };
        try {
          Process process = runtime.exec(args);
        } catch (IOException e) {
          // do what you want with this
        }
      } else if (osName.startsWith("Windows")) {
        System.out.println("Windows");
        Runtime.getRuntime()
            .exec("rundll32 url.dll,FileProtocolHandler " + url);
      } else { // assume Unix or Linux
        String[] browsers = { "firefox", "chrome" };
        String browser = null;
        for (int count = 0; count < browsers.length && browser == null; count++) {
          if (Runtime.getRuntime().exec(
              new String[] { "which", browsers[count] }).waitFor() == 0) {
            browser = browsers[count];
          }
        }
        if (browser == null) {
          throw new Exception("Could not find web browser");
        } else {
          Runtime.getRuntime().exec(new String[] { browser, url });
        }
      }
    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());

    }
  }

  // method to return the abstract syntax tree of the input java class file.
  public String getAST(String fileName) { // filename is the test .java file
    ANTLRFileStream input = null;
    try {
      input = new ANTLRFileStream(fileName);
    } catch (IOException e) {

      e.printStackTrace();
    }

    JavaLexer lexer = new JavaLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    JavaParser parser = new JavaParser(tokens);

    JavaParser.javaSource_return r = null;
    try {
      r = parser.javaSource();
    } catch (RecognitionException e) {

      e.printStackTrace();
    }

    CommonTree t = (CommonTree) r.getTree();

    String AST = t.toStringTree();

    return AST;

  }

  // method which returns all the class names in the java file.
  public void getAllClasses(String tree) {

    // Regex to match and extract the classnames/interfaces in the abstract
    // syntax tree.
    String class_pattern = "[(]{1}(class|interface) [(]?MODIFIER_LIST\\s*[a-z]*[)]? ([a-zA-Z_]+[A-Za-z0-9_]*)";

    Pattern class_declaration = Pattern.compile(class_pattern);
    Matcher m1 = class_declaration.matcher(tree);
    if (m1.find()) {
      String type = m1.group(1);

      this.className = m1.group(2);

      if (type.matches("interface"))
        this.referenceList.add(this.className);
    }

  }

  public String getClass(String tree) {

    String yuml_class = null;
    String yuml_class1 = "";
    String class_pattern = "[(]{1}(class|interface) [(]?MODIFIER_LIST\\s*[a-z]*[)]? ([a-zA-Z_]+[A-Za-z0-9_]*)";

    Pattern class_declaration = Pattern.compile(class_pattern);
    Matcher m1 = class_declaration.matcher(tree);
    if (m1.find()) {
      String type = m1.group(1);

      this.className = m1.group(2);

      if (type.matches("class"))
        yuml_class1 = "[" + this.className + "|";
      else if (type.matches("interface")) {
        this.referenceList.add(this.className);
        yuml_class = "Ç" + this.className + "È";
        yuml_class1 = "[" + yuml_class + "";

      }

    }

    return yuml_class1;
  }

  // method to get all the instance variables. Does not include references.
  // Handled seperately later in the code.
  public String getVariables(String tree) {

    String yuml_variables = "";
    // regex to match and extract variables in the AST.
    String getVariables_regex = "[(]VAR_DECLARATION [(]?MODIFIER_LIST\\s*(private|public|\\s*)[)]? \\(TYPE\\s*(\\(QUALIFIED_TYPE_IDENT)?\\s*(String|int|boolean|char|float|double|long int)\\)* [(]VAR_DECLARATOR_LIST [(]VAR_DECLARATOR ([a-zA-Z_]*[a-zA-Z0-9_]+)[)]{2,3}\\s*";
    Pattern getVariables_pattern = Pattern.compile(getVariables_regex);
    Matcher m5 = getVariables_pattern.matcher(tree);

    while (m5.find()) { // find next match

      String modifier = m5.group(1);

      if (modifier.equals("private")) {

        String var_name = m5.group(4);

        String type = m5.group(3);
        this.privateVariables.add(var_name);
        yuml_variables += "-" + var_name + ":" + type + ";";
      }

      if (modifier.equals("public")) {

        String var_name = m5.group(4);

        String type = m5.group(3);

        yuml_variables += "+" + var_name + ":" + type + ";";
      }

    }
    return yuml_variables;
  }

  // method to get all the array variables. Does not include references. Handled
  // seperately later in the code.
  public String getArrays(String tree) {

    String yuml_arrays = "";
    // regex to match and extract arrays in the AST.
    String getArray_regex = "[(]VAR_DECLARATION [(]MODIFIER_LIST (public|private|\\s*)[)] [(]TYPE ([a-zA-Z_]*[A-Za-z0-9_]*) [(]ARRAY_DECLARATOR_LIST ARRAY_DECLARATOR[)]{2} [(]VAR_DECLARATOR_LIST [(]VAR_DECLARATOR ([A-Za-z_]+[a-zA-Z0-9_]*)[)]{2,3}";
    Pattern getArray_pattern = Pattern.compile(getArray_regex);
    Matcher m7 = getArray_pattern.matcher(tree);

    while (m7.find()) {

      String match = m7.group();

      String getArrDecs_regex = "[(]VAR_DECLARATION [(]MODIFIER_LIST (public|private|\\s*)[)] [(]TYPE ([a-zA-Z_]*[A-Za-z0-9_]*) [(]ARRAY_DECLARATOR_LIST ARRAY_DECLARATOR[)]{2} [(]VAR_DECLARATOR_LIST [(]VAR_DECLARATOR ([A-Za-z_]+[a-zA-Z0-9_]*)[)]{2,3}";
      Pattern getArrDecs_pattern = Pattern.compile(getArrDecs_regex);
      Matcher m8 = getArrDecs_pattern.matcher(match);

      while (m8.find()) {

        String modifier = m8.group(1);

        if (modifier.equals("private")) {

          String array_name = m8.group(3);

          String type = m8.group(2);

          yuml_arrays += "-" + array_name + ":" + type + "(*)" + ";";

        }

        if (modifier.equals("public")) {

          String array_name = m8.group(3);

          String type = m8.group(2);

          yuml_arrays += "+" + array_name + ":" + type + "(*)" + ";";

        }

      }

    }
    return yuml_arrays;
  }

  // method to check for getter and setter methods for private variables.
  public void getterSetterMethod(String tree) {
    // regex to match and extract getter setter methods.
    String getterMethod_regex = "\\(FUNCTION_METHOD_DECL \\(MODIFIER_LIST public\\s*(?:abstract|static)?\\s*\\) \\(TYPE (?:\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]+[A-Za-z0-9_]*)\\)*\\s*([A-Za-z_]*[a-zA-Z0-9_]+)\\s*FORMAL_PARAM_LIST\\s*\\(BLOCK_SCOPE \\(return \\(EXPR\\s*\\(*\\s*(?:\\.\\s*this)?\\s*([a-zA-Z_]+[a-zA-Z_0-9]*)\\)*";
    Pattern getterMethod_pattern = Pattern.compile(getterMethod_regex);
    Matcher m21 = getterMethod_pattern.matcher(tree);
    while (m21.find()) {
      String var_returned = m21.group(3);
      if (this.privateVariables.contains(var_returned)) {
        this.replacePrivateVariables.add(var_returned);
        String getMethod = m21.group(2);
        String method = getMethod.substring(3);
        String setMethod = "set" + method;
        this.replaceGetterSetter.add(getMethod);
        this.replaceGetterSetter.add(setMethod);
      }

    }

  }

  // method to get constructors which take no parameters.
  public String getConstructor_withoutParam(String tree) {

    String constructor_withoutParam = "";
    // regex to match and extract constructors which take no parameters.
    String const_withoutParam_regex = "CONSTRUCTOR_DECL\\s*\\(MODIFIER_LIST public\\s*(?:abstract|static)?\\s*\\) FORMAL_PARAM_LIST";
    Pattern const_withoutParam_declaration = Pattern
        .compile(const_withoutParam_regex);
    Matcher m18 = const_withoutParam_declaration.matcher(tree);
    if (m18.find()) {
      constructor_withoutParam = "+" + this.className + "();";
    }
    return constructor_withoutParam;
  }

  // method to get constructors which take parameters.
  public String getConstructor_withParam(String tree) {

    String constructor_withParam = "";
    // regex to match and extract constructors which take parameters.
    String const_withParam_regex = "\\(CONSTRUCTOR_DECL \\(MODIFIER_LIST public\\s*(?:abstract|static)?\\s*\\)\\s*\\(FORMAL_PARAM_LIST (\\s*\\(FORMAL_PARAM_STD_DECL LOCAL_MODIFIER_LIST \\(TYPE (\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]*[A-Za-z0-9_]+)\\)* ([a-zA-Z_]*[A-Za-z0-9_]+)\\)*)*";
    Pattern const_withParam_declaration = Pattern
        .compile(const_withParam_regex);
    Matcher m19 = const_withParam_declaration.matcher(tree);

    while (m19.find()) {
      String functionName = this.className;
      constructor_withParam += "+" + functionName + "(";
      String match = m19.group();
      String constWithParam_methods_regex = "\\(FORMAL_PARAM_STD_DECL LOCAL_MODIFIER_LIST \\(TYPE (\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]*[A-Za-z0-9_]+)\\)* ([a-zA-Z_]*[A-Za-z0-9_]+)\\)*";
      Pattern constWithParam_method_declarations = Pattern
          .compile(constWithParam_methods_regex);
      Matcher m20 = constWithParam_method_declarations.matcher(match);

      while (m20.find()) {

        String type = m20.group(2);
        String varName = m20.group(3);
        if (this.referenceList.contains(type)) {

          this.dependencies.put(this.className, type);

        }

        constructor_withParam += varName + ":" + type + ";";

      }

      constructor_withParam += ");";

    }

    return constructor_withParam;
  }

  // method to get methods which take void parameters and return nothing.
  public String getMethod_voidReturn_voidParam(String tree) {
    String method_noReturn_noParams = "";
    // regex to extract function name.
    String void_method_regex = "VOID_METHOD_DECL\\s*\\(MODIFIER_LIST\\s*(?:public)?\\s*(?:abstract|static)?\\s*\\) ([a-zA-Z_]+[A-Za-z_0-9]*) FORMAL_PARAM_LIST";
    Pattern void_method_declaration = Pattern.compile(void_method_regex);
    Matcher m12 = void_method_declaration.matcher(tree);
    while (m12.find()) {

      String func_name = m12.group(1);

      method_noReturn_noParams += "+" + func_name + "();";
    }
    return method_noReturn_noParams;
  }

  // method to ectract all the methods which do not return anything but take
  // parameters.
  public String getMethod_voidReturn_withParam(String tree) {

    String method_noReturn_withParam = "";

    String voidWithParam_method_regex = "\\(VOID_METHOD_DECL \\(MODIFIER_LIST (public\\s*(?:abstract|static)?)\\s*\\) ([A-Za-z_]*[a-zA-Z0-9_]+) \\(FORMAL_PARAM_LIST (\\s*\\(FORMAL_PARAM_STD_DECL LOCAL_MODIFIER_LIST \\(TYPE (\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]*[A-Za-z0-9_]+)\\)* ([a-zA-Z_]*[A-Za-z0-9_]+)\\)*)*";
    Pattern voidWithParam_method_declaration = Pattern
        .compile(voidWithParam_method_regex);
    Matcher m13 = voidWithParam_method_declaration.matcher(tree);
    while (m13.find()) {

      String function_name = m13.group(2);

      method_noReturn_withParam += "+" + function_name + "(";

      String match = m13.group();
      String voidWithParam_methods_regex = "\\(FORMAL_PARAM_STD_DECL LOCAL_MODIFIER_LIST \\(TYPE (\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]*[A-Za-z0-9_]+)\\)* ([a-zA-Z_]*[A-Za-z0-9_]+)\\)*";
      Pattern voidWithParam_method_declarations = Pattern
          .compile(voidWithParam_methods_regex);
      Matcher m14 = voidWithParam_method_declarations.matcher(match);

      while (m14.find()) {

        String type = m14.group(2);
        String varName = m14.group(3);

        if (this.referenceList.contains(type)) {

          this.dependencies.put(this.className, type);

        }
        method_noReturn_withParam += varName + ":" + type + ";";

      }

      method_noReturn_withParam += "):void;";

    }
    return method_noReturn_withParam;
  }

  // method to extract all the methods which return values and take parameters.
  public String getMethod_return_withParams(String tree) {
    String method_return_withParam = "";
    String return_methods_regex = "\\(FUNCTION_METHOD_DECL \\(MODIFIER_LIST public\\s*(?:abstract|static)?\\s*\\) \\(TYPE (?:\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]+[A-Za-z0-9_]*)\\)*\\s*([A-Za-z_]*[a-zA-Z0-9_]+) \\(FORMAL_PARAM_LIST (\\s*\\(FORMAL_PARAM_STD_DECL LOCAL_MODIFIER_LIST \\(TYPE (\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]*[A-Za-z0-9_]+)\\)* ([a-zA-Z_]*[A-Za-z0-9_]+)\\)*)*";
    Pattern return_methods_declaration = Pattern.compile(return_methods_regex);
    Matcher m15 = return_methods_declaration.matcher(tree);

    while (m15.find()) {
      String return_type = m15.group(1);
      String method_name = m15.group(2);

      method_return_withParam += "+" + method_name + "(";

      String match = m15.group();

      String return_method_details = "\\(FUNCTION_METHOD_DECL \\(MODIFIER_LIST public\\s*(?:abstract|static)?\\s*\\) \\(TYPE (?:\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]+[A-Za-z0-9_]*)\\)\\s*([A-Za-z_]*[a-zA-Z0-9_]+) \\(FORMAL_PARAM_LIST (\\s*\\(FORMAL_PARAM_STD_DECL LOCAL_MODIFIER_LIST \\(TYPE (\\(QUALIFIED_TYPE_IDENT)*\\s*([a-zA-Z_]*[A-Za-z0-9_]+)\\)* ([a-zA-Z_]*[A-Za-z0-9_]+)\\)*)*";
      Pattern return_method_pattern = Pattern.compile(return_method_details);
      Matcher m16 = return_method_pattern.matcher(match);

      while (m16.find()) {

        System.out.println("m16:" + m16.group());

        String type = m16.group(1);
        String param = m16.group(2);

        if (this.referenceList.contains(type)) {

          dependencies.put(this.className, type);
        }

        method_return_withParam += param + ":" + type + ";";

      }
      method_return_withParam += "):" + return_type + ";";

    }
    return method_return_withParam;

  }

  // method to extract all the methods which return values but do not take
  // parameters.
  public String getMethod_return_withoutParams(String tree) {

    String method_return_withoutParams = "";
    String return_noParams_regex = "\\(FUNCTION_METHOD_DECL \\(MODIFIER_LIST (?:public)?\\s*(?:abstract|static)?\\s*\\)\\s*\\(TYPE\\s*(\\(QUALIFIED_TYPE_IDENT)?\\s*([a-zA-Z_]+[a-zA-Z0-9_]*)\\)*\\s*([a-zA-Z_]+[A-Za-z0-9_]*)\\s* FORMAL_PARAM_LIST";
    Pattern return_noParams_pattern = Pattern.compile(return_noParams_regex);
    Matcher m17 = return_noParams_pattern.matcher(tree);
    while (m17.find()) {

      String return_type = m17.group(2);
      String function_name = m17.group(3);

      method_return_withoutParams += "+" + function_name + "()" + ":"
          + return_type + ";";

    }
    return method_return_withoutParams;
  }

  // methods which returns all the references made in the java class.
  public String references(String tree) {
    System.out.println("unique references:" + this.uniqueReferences);
    int flag = 0;
    String references = "";
    String reference_regex = "[(]VAR_DECLARATION [(]MODIFIER_LIST (public|private|\\s*)[)] [(]TYPE [(]QUALIFIED_TYPE_IDENT ([A-Za-z_]+[A-Za-z0-9_]*)[)]* [(]VAR_DECLARATOR_LIST [(]VAR_DECLARATOR ([a-zA-Z_]+[A-Za-z0-9_]*)[)]*";
    Pattern reference_declaration = Pattern.compile(reference_regex);
    Matcher m11 = reference_declaration.matcher(tree);
    while (m11.find()) {

      if (this.uniqueReferences.contains(m11.group(2) + ":" + this.className)) {
        flag = 1;
      }

      if ((!m11.group(2).matches("String"))
          && (!this.referenceList.contains(m11.group(2))) && flag == 0) {

        references = ",[" + this.className + "]-" + m11.group(3) + "["
            + m11.group(2) + "];,";
        this.uniqueReferences.add(this.className + ":" + m11.group(2));
      }

    }
    return references;
  }

  // method to extract all references made as collections. To demonstrate
  // multiplicity.
  public String collectionRef(String tree) {
    String collectionRef = "";
    int flag = 0;
    String getCollection_regex = "[(]VAR_DECLARATION [(]MODIFIER_LIST (public|private|\\s*)[)] [(]TYPE [(]QUALIFIED_TYPE_IDENT [(]Collection [(]GENERIC_TYPE_ARG_LIST [(]TYPE [(]QUALIFIED_TYPE_IDENT ([A-Za-z_]+[A-Za-z0-9_]*)[)]* [(]VAR_DECLARATOR_LIST [(]VAR_DECLARATOR ([a-zA-Z_]+[A-Za-z0-9_]*)[)]*";
    Pattern getCollection_pattern = Pattern.compile(getCollection_regex);
    Matcher m9 = getCollection_pattern.matcher(tree);

    while (m9.find()) {

      String match = m9.group();

      String getCollectionDecs_regex = "[(]VAR_DECLARATION [(]MODIFIER_LIST (public|private|\\s*)[)] [(]TYPE [(]QUALIFIED_TYPE_IDENT [(]Collection [(]GENERIC_TYPE_ARG_LIST [(]TYPE [(]QUALIFIED_TYPE_IDENT ([A-Za-z_]+[A-Za-z0-9_]*)[)]* [(]VAR_DECLARATOR_LIST [(]VAR_DECLARATOR ([a-zA-Z_]+[A-Za-z0-9_]*)[)]*\\s*";
      Pattern getCollectionsDecs_pattern = Pattern
          .compile(getCollectionDecs_regex);
      Matcher m10 = getCollectionsDecs_pattern.matcher(match);

      while (m10.find()) {

        String modifier = m10.group(1);

        if (modifier.equals("private")) {

          String collection_name = m10.group(3);

          String type = m10.group(2);

          if (this.uniqueReferences.contains(type + ":" + this.className)) {
            flag = 1;
          }
          if (this.referenceList.contains(type) && flag == 0) {

            collectionRef += ",[" + this.className + "]-" + collection_name
                + "*[Ç" + type + "È];,";
            this.uniqueReferences.add(this.className + ":" + type);
          } else {

            if (flag == 0) {

              collectionRef += ",[" + this.className + "]-" + collection_name
                  + "*[" + type + "];,";
              this.uniqueReferences.add(this.className + ":" + type);
            }
          }
        }

      }

    }
    return collectionRef;
  }

  // method to extract all subclasses in the java file
  public String inheritedClasses(String tree) {

    String inheritedClasses = null;
    String parent_pattern = "[(]{1}EXTENDS_CLAUSE [(]TYPE [(]?QUALIFIED_TYPE_IDENT ([a-zA-Z_]+[A-Za-z0-9_]*)";
    Pattern parentclass_declaration = Pattern.compile(parent_pattern);
    Matcher m2 = parentclass_declaration.matcher(tree);
    if (m2.find()) {
      String parentClassName = m2.group(1);

      inheritedClasses = ",[" + parentClassName + "]^-[" + className + "],";

    }
    return inheritedClasses;
  }

  // method to extract all interfaces in the java file.
  public String interfaces(String tree) {

    String interfaces = "";
    String interface_pattern = "[(]{1}IMPLEMENTS_CLAUSE ([(]TYPE [(]?QUALIFIED_TYPE_IDENT ([a-zA-Z_]+[a-zA-Z0-9_]*)[)]{2}\\s*)*";
    Pattern interface_declaration = Pattern.compile(interface_pattern);
    Matcher m3 = interface_declaration.matcher(tree);
    if (m3.find()) {
      String interface_dec = m3.group(0);

      String getInterfaces_regex = "TYPE [(]QUALIFIED_TYPE_IDENT ([a-zA-Z_]+[a-zA-Z0-9_]*)[)]";
      Pattern getInterfaces_pattern = Pattern.compile(getInterfaces_regex);
      Matcher m4 = getInterfaces_pattern.matcher(interface_dec);
      while (m4.find()) {
        for (int i = 1; i <= m4.groupCount(); i++) {

          interfaces += "[Ç" + m4.group(i) + "È]^-.-[" + className + "],";

        }
      }

    }
    return interfaces;
  }

  // main methods which builds the inout to the yuml.
  public static void main(String args[]) {

    JavaTreeWalker umlParser = new JavaTreeWalker();
    // start with an empty string.
    String yuml_input = " ";
    // input folder name
    File dir0 = new File("./javasrc 2");
    File[] directoryListing0 = dir0.listFiles();
    if (directoryListing0 != null) {
      for (File file : directoryListing0) {
        if (file.toString().endsWith(".java")) {

          String tree = umlParser.getAST(file.getAbsolutePath());

          umlParser.getAllClasses(tree);

        }

      }
    }

    // input folder name
    File dir = new File("./javasrc 2");
    File[] directoryListing = dir.listFiles();
    if (directoryListing != null) {
      for (File file : directoryListing) {
        if (file.toString().endsWith(".java")) {

          String tree = umlParser.getAST(file.getAbsolutePath());
          System.out.println(tree);
          String yuml_class = umlParser.getClass(tree);

          yuml_input += yuml_class;

          String yuml_variables = umlParser.getVariables(tree);

          yuml_input += yuml_variables;

          String yuml_arrays = umlParser.getArrays(tree);

          yuml_input += yuml_arrays;

          yuml_input += "|";

          String constructor_withoutParam = umlParser
              .getConstructor_withoutParam(tree);
          if (constructor_withoutParam != null) {
            yuml_input += constructor_withoutParam;
          }

          String constructor_withParam = umlParser
              .getConstructor_withParam(tree);
          if (constructor_withParam != null) {
            yuml_input += constructor_withParam;
          }

          String method_voidReturn_voidParams = umlParser
              .getMethod_voidReturn_voidParam(tree);
          if (method_voidReturn_voidParams != null) {
            yuml_input += method_voidReturn_voidParams;
          }

          String method_voidReturn_withParams = umlParser
              .getMethod_voidReturn_withParam(tree);

          if (method_voidReturn_withParams != null) {
            yuml_input += method_voidReturn_withParams;
          }

          String method_return_withParams = umlParser
              .getMethod_return_withParams(tree);
          if (method_return_withParams != null) {
            yuml_input += method_return_withParams;
          }

          String method_return_withoutParams = umlParser
              .getMethod_return_withoutParams(tree);
          if (method_return_withoutParams != null) {
            yuml_input += method_return_withoutParams;
          }

          yuml_input += "],";

          umlParser.getterSetterMethod(tree);
          ArrayList<String> replacePrivateVariables = umlParser.replacePrivateVariables;
          for (String privateVar : replacePrivateVariables) {

            yuml_input.replaceAll("-" + privateVar, "+" + privateVar);

            yuml_input = Pattern.compile("-" + privateVar).matcher(yuml_input)
                .replaceAll("+" + privateVar);

          }

          for (String getSet : umlParser.replaceGetterSetter) {
            Pattern pattern = Pattern
                .compile("\\+"
                    + getSet
                    + "\\((([a-zA-Z_]+[a-zA-Z0-9]*):([a-zA-Z_]+[a-zA-Z0-9]*);*)*\\)(:([a-zA-Z_]+[a-zA-Z0-9]*))*");
           
            Matcher matcher = pattern.matcher(yuml_input);
            while (matcher.find()) {
              yuml_input = matcher.replaceAll("");
              
            }

          }

        }
      }
    }

    String yuml_input1 = "";

    for (File file : directoryListing) {
      if (file.toString().endsWith(".java")) {
        

        String tree = umlParser.getAST(file.getAbsolutePath());
        String yuml_class = umlParser.getClass(tree);

        String references = umlParser.references(tree);
        if (references != null) {
          yuml_input1 += references;
        }

        String collections = umlParser.collectionRef(tree);
        if (collections != null) {
          yuml_input1 += collections;
        }

        String inheritedClasses = umlParser.inheritedClasses(tree);
        if (inheritedClasses != null) {
          yuml_input1 += inheritedClasses;
        }

        String interfaces = umlParser.interfaces(tree);
        if (interfaces != null) {
          yuml_input1 += interfaces;
        }

      }

    }

    String yuml_input_uses = "";
    Enumeration<String> e = umlParser.dependencies.keys();

    while (e.hasMoreElements()) {
      String key = e.nextElement();
    
      if (!umlParser.referenceList.contains(key))
        yuml_input_uses += "[" + key + "]" + "uses-.->[Ç"
            + umlParser.dependencies.get(key) + "È],";

    }

    System.out.println("****FINAL OUTPUT****");
    System.out.println(yuml_input + yuml_input1 + yuml_input_uses);
    String final_input = yuml_input + yuml_input1 + yuml_input_uses;
    umlParser.openURL("http://yuml.me/diagram/scruffy/class/Class Diagram,"
        + final_input);
  }
}
