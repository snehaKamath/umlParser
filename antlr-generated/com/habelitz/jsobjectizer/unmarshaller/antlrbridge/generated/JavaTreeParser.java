// $ANTLR 3.5.2 /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g 2015-10-29 22:03:56

package com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * For more information see the head comment within the 'java.g' grammar file
 * that defines the input for this tree grammar.
 *
 * BSD licence
 * 
 * Copyright (c) 2007-2008 by HABELITZ Software Developments
 *
 * All rights reserved.
 * 
 * http://www.habelitz.com
 *
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY HABELITZ SOFTWARE DEVELOPMENTS ('HSD') ``AS IS'' 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL 'HSD' BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
@SuppressWarnings("all")
public class JavaTreeParser extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "AND_ASSIGN", 
		"ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", 
		"ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", 
		"ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", 
		"ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", 
		"ASSERT", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", 
		"BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CASE", "CAST_EXPR", "CATCH", 
		"CATCH_CLAUSE_LIST", "CHAR", "CHARACTER_LITERAL", "CLASS", "CLASS_CONSTRUCTOR_CALL", 
		"CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", 
		"COLON", "COMMA", "COMMENT", "CONSTRUCTOR_DECL", "CONTINUE", "DEC", "DECIMAL_LITERAL", 
		"DEFAULT", "DIV", "DIV_ASSIGN", "DO", "DOT", "DOTSTAR", "DOUBLE", "ELLIPSIS", 
		"ELSE", "ENUM", "ENUM_TOP_LEVEL_SCOPE", "EQUAL", "ESCAPE_SEQUENCE", "EXPONENT", 
		"EXPR", "EXTENDS", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FALSE", "FINAL", 
		"FINALLY", "FLOAT", "FLOATING_POINT_LITERAL", "FLOAT_TYPE_SUFFIX", "FOR", 
		"FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", 
		"FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FUNCTION_METHOD_DECL", 
		"GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "GREATER_OR_EQUAL", 
		"GREATER_THAN", "HEX_DIGIT", "HEX_LITERAL", "IDENT", "IF", "IMPLEMENTS", 
		"IMPLEMENTS_CLAUSE", "IMPORT", "INC", "INSTANCEOF", "INT", "INTEGER_TYPE_SUFFIX", 
		"INTERFACE", "INTERFACE_TOP_LEVEL_SCOPE", "JAVA_ID_PART", "JAVA_ID_START", 
		"JAVA_SOURCE", "LABELED_STATEMENT", "LBRACK", "LCURLY", "LESS_OR_EQUAL", 
		"LESS_THAN", "LINE_COMMENT", "LOCAL_MODIFIER_LIST", "LOGICAL_AND", "LOGICAL_NOT", 
		"LOGICAL_OR", "LONG", "LPAREN", "METHOD_CALL", "MINUS", "MINUS_ASSIGN", 
		"MOD", "MODIFIER_LIST", "MOD_ASSIGN", "NATIVE", "NEW", "NOT", "NOT_EQUAL", 
		"NULL", "OCTAL_ESCAPE", "OCTAL_LITERAL", "OR", "OR_ASSIGN", "PACKAGE", 
		"PARENTESIZED_EXPR", "PLUS", "PLUS_ASSIGN", "POST_DEC", "POST_INC", "PRE_DEC", 
		"PRE_INC", "PRIVATE", "PROTECTED", "PUBLIC", "QUALIFIED_TYPE_IDENT", "QUESTION", 
		"RBRACK", "RCURLY", "RETURN", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", 
		"SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "SHORT", "STAR", "STAR_ASSIGN", "STATIC", 
		"STATIC_ARRAY_CREATOR", "STRICTFP", "STRING_LITERAL", "SUPER", "SUPER_CONSTRUCTOR_CALL", 
		"SWITCH", "SWITCH_BLOCK_LABEL_LIST", "SYNCHRONIZED", "THIS", "THIS_CONSTRUCTOR_CALL", 
		"THROW", "THROWS", "THROWS_CLAUSE", "TRANSIENT", "TRUE", "TRY", "TYPE", 
		"UNARY_MINUS", "UNARY_PLUS", "UNICODE_ESCAPE", "VAR_DECLARATION", "VAR_DECLARATOR", 
		"VAR_DECLARATOR_LIST", "VOID", "VOID_METHOD_DECL", "VOLATILE", "WHILE", 
		"WS", "XOR", "XOR_ASSIGN"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int AND=5;
	public static final int AND_ASSIGN=6;
	public static final int ANNOTATION_INIT_ARRAY_ELEMENT=7;
	public static final int ANNOTATION_INIT_BLOCK=8;
	public static final int ANNOTATION_INIT_DEFAULT_KEY=9;
	public static final int ANNOTATION_INIT_KEY_LIST=10;
	public static final int ANNOTATION_LIST=11;
	public static final int ANNOTATION_METHOD_DECL=12;
	public static final int ANNOTATION_SCOPE=13;
	public static final int ANNOTATION_TOP_LEVEL_SCOPE=14;
	public static final int ARGUMENT_LIST=15;
	public static final int ARRAY_DECLARATOR=16;
	public static final int ARRAY_DECLARATOR_LIST=17;
	public static final int ARRAY_ELEMENT_ACCESS=18;
	public static final int ARRAY_INITIALIZER=19;
	public static final int ASSERT=20;
	public static final int ASSIGN=21;
	public static final int AT=22;
	public static final int BIT_SHIFT_RIGHT=23;
	public static final int BIT_SHIFT_RIGHT_ASSIGN=24;
	public static final int BLOCK_SCOPE=25;
	public static final int BOOLEAN=26;
	public static final int BREAK=27;
	public static final int BYTE=28;
	public static final int CASE=29;
	public static final int CAST_EXPR=30;
	public static final int CATCH=31;
	public static final int CATCH_CLAUSE_LIST=32;
	public static final int CHAR=33;
	public static final int CHARACTER_LITERAL=34;
	public static final int CLASS=35;
	public static final int CLASS_CONSTRUCTOR_CALL=36;
	public static final int CLASS_INSTANCE_INITIALIZER=37;
	public static final int CLASS_STATIC_INITIALIZER=38;
	public static final int CLASS_TOP_LEVEL_SCOPE=39;
	public static final int COLON=40;
	public static final int COMMA=41;
	public static final int COMMENT=42;
	public static final int CONSTRUCTOR_DECL=43;
	public static final int CONTINUE=44;
	public static final int DEC=45;
	public static final int DECIMAL_LITERAL=46;
	public static final int DEFAULT=47;
	public static final int DIV=48;
	public static final int DIV_ASSIGN=49;
	public static final int DO=50;
	public static final int DOT=51;
	public static final int DOTSTAR=52;
	public static final int DOUBLE=53;
	public static final int ELLIPSIS=54;
	public static final int ELSE=55;
	public static final int ENUM=56;
	public static final int ENUM_TOP_LEVEL_SCOPE=57;
	public static final int EQUAL=58;
	public static final int ESCAPE_SEQUENCE=59;
	public static final int EXPONENT=60;
	public static final int EXPR=61;
	public static final int EXTENDS=62;
	public static final int EXTENDS_BOUND_LIST=63;
	public static final int EXTENDS_CLAUSE=64;
	public static final int FALSE=65;
	public static final int FINAL=66;
	public static final int FINALLY=67;
	public static final int FLOAT=68;
	public static final int FLOATING_POINT_LITERAL=69;
	public static final int FLOAT_TYPE_SUFFIX=70;
	public static final int FOR=71;
	public static final int FORMAL_PARAM_LIST=72;
	public static final int FORMAL_PARAM_STD_DECL=73;
	public static final int FORMAL_PARAM_VARARG_DECL=74;
	public static final int FOR_CONDITION=75;
	public static final int FOR_EACH=76;
	public static final int FOR_INIT=77;
	public static final int FOR_UPDATE=78;
	public static final int FUNCTION_METHOD_DECL=79;
	public static final int GENERIC_TYPE_ARG_LIST=80;
	public static final int GENERIC_TYPE_PARAM_LIST=81;
	public static final int GREATER_OR_EQUAL=82;
	public static final int GREATER_THAN=83;
	public static final int HEX_DIGIT=84;
	public static final int HEX_LITERAL=85;
	public static final int IDENT=86;
	public static final int IF=87;
	public static final int IMPLEMENTS=88;
	public static final int IMPLEMENTS_CLAUSE=89;
	public static final int IMPORT=90;
	public static final int INC=91;
	public static final int INSTANCEOF=92;
	public static final int INT=93;
	public static final int INTEGER_TYPE_SUFFIX=94;
	public static final int INTERFACE=95;
	public static final int INTERFACE_TOP_LEVEL_SCOPE=96;
	public static final int JAVA_ID_PART=97;
	public static final int JAVA_ID_START=98;
	public static final int JAVA_SOURCE=99;
	public static final int LABELED_STATEMENT=100;
	public static final int LBRACK=101;
	public static final int LCURLY=102;
	public static final int LESS_OR_EQUAL=103;
	public static final int LESS_THAN=104;
	public static final int LINE_COMMENT=105;
	public static final int LOCAL_MODIFIER_LIST=106;
	public static final int LOGICAL_AND=107;
	public static final int LOGICAL_NOT=108;
	public static final int LOGICAL_OR=109;
	public static final int LONG=110;
	public static final int LPAREN=111;
	public static final int METHOD_CALL=112;
	public static final int MINUS=113;
	public static final int MINUS_ASSIGN=114;
	public static final int MOD=115;
	public static final int MODIFIER_LIST=116;
	public static final int MOD_ASSIGN=117;
	public static final int NATIVE=118;
	public static final int NEW=119;
	public static final int NOT=120;
	public static final int NOT_EQUAL=121;
	public static final int NULL=122;
	public static final int OCTAL_ESCAPE=123;
	public static final int OCTAL_LITERAL=124;
	public static final int OR=125;
	public static final int OR_ASSIGN=126;
	public static final int PACKAGE=127;
	public static final int PARENTESIZED_EXPR=128;
	public static final int PLUS=129;
	public static final int PLUS_ASSIGN=130;
	public static final int POST_DEC=131;
	public static final int POST_INC=132;
	public static final int PRE_DEC=133;
	public static final int PRE_INC=134;
	public static final int PRIVATE=135;
	public static final int PROTECTED=136;
	public static final int PUBLIC=137;
	public static final int QUALIFIED_TYPE_IDENT=138;
	public static final int QUESTION=139;
	public static final int RBRACK=140;
	public static final int RCURLY=141;
	public static final int RETURN=142;
	public static final int RPAREN=143;
	public static final int SEMI=144;
	public static final int SHIFT_LEFT=145;
	public static final int SHIFT_LEFT_ASSIGN=146;
	public static final int SHIFT_RIGHT=147;
	public static final int SHIFT_RIGHT_ASSIGN=148;
	public static final int SHORT=149;
	public static final int STAR=150;
	public static final int STAR_ASSIGN=151;
	public static final int STATIC=152;
	public static final int STATIC_ARRAY_CREATOR=153;
	public static final int STRICTFP=154;
	public static final int STRING_LITERAL=155;
	public static final int SUPER=156;
	public static final int SUPER_CONSTRUCTOR_CALL=157;
	public static final int SWITCH=158;
	public static final int SWITCH_BLOCK_LABEL_LIST=159;
	public static final int SYNCHRONIZED=160;
	public static final int THIS=161;
	public static final int THIS_CONSTRUCTOR_CALL=162;
	public static final int THROW=163;
	public static final int THROWS=164;
	public static final int THROWS_CLAUSE=165;
	public static final int TRANSIENT=166;
	public static final int TRUE=167;
	public static final int TRY=168;
	public static final int TYPE=169;
	public static final int UNARY_MINUS=170;
	public static final int UNARY_PLUS=171;
	public static final int UNICODE_ESCAPE=172;
	public static final int VAR_DECLARATION=173;
	public static final int VAR_DECLARATOR=174;
	public static final int VAR_DECLARATOR_LIST=175;
	public static final int VOID=176;
	public static final int VOID_METHOD_DECL=177;
	public static final int VOLATILE=178;
	public static final int WHILE=179;
	public static final int WS=180;
	public static final int XOR=181;
	public static final int XOR_ASSIGN=182;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public JavaTreeParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[288+1];


	}

	@Override public String[] getTokenNames() { return JavaTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g"; }


	    
	    boolean mMessageCollectionEnabled = false;
	    private boolean mHasErrors = false;
	    List<String> mMessages;

	    /**
	     *  Switches error message collection on or of.
	     *
	     *  The standard destination for parser error messages is <code>System.err</code>.
	     *  However, if <code>true</code> gets passed to this method this default
	     *  behaviour will be switched off and all error messages will be collected
	     *  instead of written to anywhere.
	     *
	     *  The default value is <code>false</code>.
	     *
	     *  @param pNewState  <code>true</code> if error messages should be collected.
	     */
	    public void enableErrorMessageCollection(boolean pNewState) {
	        mMessageCollectionEnabled = pNewState;
	        if (mMessages == null && mMessageCollectionEnabled) {
	            mMessages = new ArrayList<String>();
	        }
	    }
	    
	    /**
	     *  Collects an error message or passes the error message to <code>
	     *  super.emitErrorMessage(...)</code>.
	     *
	     *  The actual behaviour depends on whether collecting error messages
	     *  has been enabled or not.
	     *
	     *  @param pMessage  The error message.
	     */
	     @Override
	    public void emitErrorMessage(String pMessage) {
	        if (mMessageCollectionEnabled) {
	            mMessages.add(pMessage);
	        } else {
	            super.emitErrorMessage(pMessage);
	        }
	    }
	    
	    /**
	     *  Returns collected error messages.
	     *
	     *  @return  A list holding collected error messages or <code>null</code> if
	     *           collecting error messages hasn't been enabled. Of course, this
	     *           list may be empty if no error message has been emited.
	     */
	    public List<String> getMessages() {
	        return mMessages;
	    }
	    
	    /**
	     *  Tells if parsing a Java source has caused any error messages.
	     *
	     *  @return  <code>true</code> if parsing a Java source has caused at least one error message.
	     */
	    public boolean hasErrors() {
	        return mHasErrors;
	    }



	// $ANTLR start "javaSource"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:116:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) ;
	public final void javaSource() throws RecognitionException {
		int javaSource_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
			{
			match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource90); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_annotationList_in_javaSource92);
			annotationList();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:38: ( packageDeclaration )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PACKAGE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:38: packageDeclaration
					{
					pushFollow(FOLLOW_packageDeclaration_in_javaSource94);
					packageDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:58: ( importDeclaration )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:58: importDeclaration
					{
					pushFollow(FOLLOW_importDeclaration_in_javaSource97);
					importDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:77: ( typeDeclaration )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:117:77: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_javaSource100);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, javaSource_StartIndex); }

		}
	}
	// $ANTLR end "javaSource"



	// $ANTLR start "packageDeclaration"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:119:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:120:5: ( ^( PACKAGE qualifiedIdentifier ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:120:9: ^( PACKAGE qualifiedIdentifier )
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration121); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration123);
			qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "packageDeclaration"



	// $ANTLR start "importDeclaration"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:123:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:124:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:124:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration150); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:124:18: ( STATIC )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STATIC) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:124:18: STATIC
					{
					match(input,STATIC,FOLLOW_STATIC_in_importDeclaration152); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration155);
			qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:124:46: ( DOTSTAR )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOTSTAR) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:124:46: DOTSTAR
					{
					match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration157); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "importDeclaration"



	// $ANTLR start "typeDeclaration"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:127:1: typeDeclaration : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
			int alt12=4;
			switch ( input.LA(1) ) {
			case CLASS:
				{
				alt12=1;
				}
				break;
			case INTERFACE:
				{
				alt12=2;
				}
				break;
			case ENUM:
				{
				alt12=3;
				}
				break;
			case AT:
				{
				alt12=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
					{
					match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration183); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_typeDeclaration185);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration187); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:36: ( genericTypeParameterList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:36: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration189);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:62: ( extendsClause )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXTENDS_CLAUSE) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:62: extendsClause
							{
							pushFollow(FOLLOW_extendsClause_in_typeDeclaration192);
							extendsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:77: ( implementsClause )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:128:77: implementsClause
							{
							pushFollow(FOLLOW_implementsClause_in_typeDeclaration195);
							implementsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration198);
					classTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:129:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
					{
					match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration210); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_typeDeclaration212);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration214); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:129:40: ( genericTypeParameterList )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:129:40: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration216);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:129:66: ( extendsClause )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXTENDS_CLAUSE) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:129:66: extendsClause
							{
							pushFollow(FOLLOW_extendsClause_in_typeDeclaration219);
							extendsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration222);
					interfaceTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:130:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
					{
					match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration234); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_typeDeclaration236);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration238); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:130:35: ( implementsClause )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:130:35: implementsClause
							{
							pushFollow(FOLLOW_implementsClause_in_typeDeclaration240);
							implementsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration243);
					enumTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:131:9: ^( AT modifierList IDENT annotationTopLevelScope )
					{
					match(input,AT,FOLLOW_AT_in_typeDeclaration255); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_typeDeclaration257);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration259); if (state.failed) return;
					pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration261);
					annotationTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "typeDeclaration"



	// $ANTLR start "extendsClause"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:133:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
	public final void extendsClause() throws RecognitionException {
		int extendsClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:135:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:135:9: ^( EXTENDS_CLAUSE ( type )+ )
			{
			match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause297); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:135:26: ( type )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==TYPE) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:135:26: type
					{
					pushFollow(FOLLOW_type_in_extendsClause299);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, extendsClause_StartIndex); }

		}
	}
	// $ANTLR end "extendsClause"



	// $ANTLR start "implementsClause"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:138:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
	public final void implementsClause() throws RecognitionException {
		int implementsClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:139:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:139:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
			{
			match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause328); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:139:29: ( type )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==TYPE) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:139:29: type
					{
					pushFollow(FOLLOW_type_in_implementsClause330);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, implementsClause_StartIndex); }

		}
	}
	// $ANTLR end "implementsClause"



	// $ANTLR start "genericTypeParameterList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:142:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
	public final void genericTypeParameterList() throws RecognitionException {
		int genericTypeParameterList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:143:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:143:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
			{
			match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList360); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:143:35: ( genericTypeParameter )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==IDENT) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:143:35: genericTypeParameter
					{
					pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList362);
					genericTypeParameter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, genericTypeParameterList_StartIndex); }

		}
	}
	// $ANTLR end "genericTypeParameterList"



	// $ANTLR start "genericTypeParameter"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:145:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
	public final void genericTypeParameter() throws RecognitionException {
		int genericTypeParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:146:5: ( ^( IDENT ( bound )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:146:9: ^( IDENT ( bound )? )
			{
			match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter383); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:146:17: ( bound )?
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
					alt16=1;
				}
				switch (alt16) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:146:17: bound
						{
						pushFollow(FOLLOW_bound_in_genericTypeParameter385);
						bound();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, genericTypeParameter_StartIndex); }

		}
	}
	// $ANTLR end "genericTypeParameter"



	// $ANTLR start "bound"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:149:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
	public final void bound() throws RecognitionException {
		int bound_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:150:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:150:9: ^( EXTENDS_BOUND_LIST ( type )+ )
			{
			match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound415); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:150:30: ( type )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==TYPE) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:150:30: type
					{
					pushFollow(FOLLOW_type_in_bound417);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, bound_StartIndex); }

		}
	}
	// $ANTLR end "bound"



	// $ANTLR start "enumTopLevelScope"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:152:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
	public final void enumTopLevelScope() throws RecognitionException {
		int enumTopLevelScope_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:153:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:153:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
			{
			match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope438); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:153:32: ( enumConstant )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==IDENT) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:153:32: enumConstant
					{
					pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope440);
					enumConstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:153:46: ( classTopLevelScope )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:153:46: classTopLevelScope
					{
					pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope443);
					classTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, enumTopLevelScope_StartIndex); }

		}
	}
	// $ANTLR end "enumTopLevelScope"



	// $ANTLR start "enumConstant"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:156:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
	public final void enumConstant() throws RecognitionException {
		int enumConstant_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:157:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:157:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
			{
			match(input,IDENT,FOLLOW_IDENT_in_enumConstant469); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_annotationList_in_enumConstant471);
			annotationList();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:157:32: ( arguments )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ARGUMENT_LIST) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:157:32: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant473);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:157:43: ( classTopLevelScope )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:157:43: classTopLevelScope
					{
					pushFollow(FOLLOW_classTopLevelScope_in_enumConstant476);
					classTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, enumConstant_StartIndex); }

		}
	}
	// $ANTLR end "enumConstant"



	// $ANTLR start "classTopLevelScope"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:161:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) ;
	public final void classTopLevelScope() throws RecognitionException {
		int classTopLevelScope_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:162:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:162:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* )
			{
			match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope507); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:162:33: ( classScopeDeclarations )*
				loop22:
				while (true) {
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==AT||LA22_0==CLASS||(LA22_0 >= CLASS_INSTANCE_INITIALIZER && LA22_0 <= CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==ENUM||LA22_0==FUNCTION_METHOD_DECL||LA22_0==INTERFACE||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
						alt22=1;
					}

					switch (alt22) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:162:33: classScopeDeclarations
						{
						pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope509);
						classScopeDeclarations();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop22;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, classTopLevelScope_StartIndex); }

		}
	}
	// $ANTLR end "classTopLevelScope"



	// $ANTLR start "classScopeDeclarations"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:165:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
	public final void classScopeDeclarations() throws RecognitionException {
		int classScopeDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:166:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
			int alt32=7;
			switch ( input.LA(1) ) {
			case CLASS_INSTANCE_INITIALIZER:
				{
				alt32=1;
				}
				break;
			case CLASS_STATIC_INITIALIZER:
				{
				alt32=2;
				}
				break;
			case FUNCTION_METHOD_DECL:
				{
				alt32=3;
				}
				break;
			case VOID_METHOD_DECL:
				{
				alt32=4;
				}
				break;
			case VAR_DECLARATION:
				{
				alt32=5;
				}
				break;
			case CONSTRUCTOR_DECL:
				{
				alt32=6;
				}
				break;
			case AT:
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt32=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:166:9: ^( CLASS_INSTANCE_INITIALIZER block )
					{
					match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations535); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_block_in_classScopeDeclarations537);
					block();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:167:9: ^( CLASS_STATIC_INITIALIZER block )
					{
					match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations549); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_block_in_classScopeDeclarations551);
					block();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
					{
					match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations563); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_classScopeDeclarations565);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:45: ( genericTypeParameterList )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:45: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations567);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_type_in_classScopeDeclarations570);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations572); if (state.failed) return;
					pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations574);
					formalParameterList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:102: ( arrayDeclaratorList )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ARRAY_DECLARATOR_LIST) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:102: arrayDeclaratorList
							{
							pushFollow(FOLLOW_arrayDeclaratorList_in_classScopeDeclarations576);
							arrayDeclaratorList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:123: ( throwsClause )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==THROWS_CLAUSE) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:123: throwsClause
							{
							pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations579);
							throwsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:137: ( block )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==BLOCK_SCOPE) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:168:137: block
							{
							pushFollow(FOLLOW_block_in_classScopeDeclarations582);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
					{
					match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations595); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_classScopeDeclarations597);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:41: ( genericTypeParameterList )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:41: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations599);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations602); if (state.failed) return;
					pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations604);
					formalParameterList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:93: ( throwsClause )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==THROWS_CLAUSE) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:93: throwsClause
							{
							pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations606);
							throwsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:107: ( block )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==BLOCK_SCOPE) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:169:107: block
							{
							pushFollow(FOLLOW_block_in_classScopeDeclarations609);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 5 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:170:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
					{
					match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations622); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_classScopeDeclarations624);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_classScopeDeclarations626);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations628);
					variableDeclaratorList();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 6 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:171:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
					{
					match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations640); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_classScopeDeclarations642);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:171:41: ( genericTypeParameterList )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:171:41: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations644);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations647);
					formalParameterList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:171:87: ( throwsClause )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==THROWS_CLAUSE) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:171:87: throwsClause
							{
							pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations649);
							throwsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_block_in_classScopeDeclarations652);
					block();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 7 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:172:9: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations663);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, classScopeDeclarations_StartIndex); }

		}
	}
	// $ANTLR end "classScopeDeclarations"



	// $ANTLR start "interfaceTopLevelScope"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:175:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
	public final void interfaceTopLevelScope() throws RecognitionException {
		int interfaceTopLevelScope_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:176:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:176:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
			{
			match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope687); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:176:37: ( interfaceScopeDeclarations )*
				loop33:
				while (true) {
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==FUNCTION_METHOD_DECL||LA33_0==INTERFACE||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
						alt33=1;
					}

					switch (alt33) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:176:37: interfaceScopeDeclarations
						{
						pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope689);
						interfaceScopeDeclarations();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop33;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, interfaceTopLevelScope_StartIndex); }

		}
	}
	// $ANTLR end "interfaceTopLevelScope"



	// $ANTLR start "interfaceScopeDeclarations"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:179:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
	public final void interfaceScopeDeclarations() throws RecognitionException {
		int interfaceScopeDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
			int alt39=4;
			switch ( input.LA(1) ) {
			case FUNCTION_METHOD_DECL:
				{
				alt39=1;
				}
				break;
			case VOID_METHOD_DECL:
				{
				alt39=2;
				}
				break;
			case VAR_DECLARATION:
				{
				alt39=3;
				}
				break;
			case AT:
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt39=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
					{
					match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations715); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations717);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:45: ( genericTypeParameterList )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:45: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations719);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_type_in_interfaceScopeDeclarations722);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations724); if (state.failed) return;
					pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations726);
					formalParameterList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:102: ( arrayDeclaratorList )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==ARRAY_DECLARATOR_LIST) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:102: arrayDeclaratorList
							{
							pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations728);
							arrayDeclaratorList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:123: ( throwsClause )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==THROWS_CLAUSE) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:180:123: throwsClause
							{
							pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations731);
							throwsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:181:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
					{
					match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations744); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations746);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:181:41: ( genericTypeParameterList )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==GENERIC_TYPE_PARAM_LIST) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:181:41: genericTypeParameterList
							{
							pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations748);
							genericTypeParameterList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations751); if (state.failed) return;
					pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations753);
					formalParameterList();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:181:93: ( throwsClause )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==THROWS_CLAUSE) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:181:93: throwsClause
							{
							pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations755);
							throwsClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:185:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
					{
					match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations846); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations848);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_interfaceScopeDeclarations850);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations852);
					variableDeclaratorList();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:186:9: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations863);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, interfaceScopeDeclarations_StartIndex); }

		}
	}
	// $ANTLR end "interfaceScopeDeclarations"



	// $ANTLR start "variableDeclaratorList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:189:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
	public final void variableDeclaratorList() throws RecognitionException {
		int variableDeclaratorList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:190:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:190:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
			{
			match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList883); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:190:31: ( variableDeclarator )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==VAR_DECLARATOR) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:190:31: variableDeclarator
					{
					pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList885);
					variableDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, variableDeclaratorList_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclaratorList"



	// $ANTLR start "variableDeclarator"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:193:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
	public final void variableDeclarator() throws RecognitionException {
		int variableDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:194:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:194:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
			{
			match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator907); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator909);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:194:47: ( variableInitializer )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==ARRAY_INITIALIZER||LA41_0==EXPR) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:194:47: variableInitializer
					{
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator911);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, variableDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclarator"



	// $ANTLR start "variableDeclaratorId"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:197:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
	public final void variableDeclaratorId() throws RecognitionException {
		int variableDeclaratorId_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:198:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:198:9: ^( IDENT ( arrayDeclaratorList )? )
			{
			match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId937); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:198:17: ( arrayDeclaratorList )?
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==ARRAY_DECLARATOR_LIST) ) {
					alt42=1;
				}
				switch (alt42) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:198:17: arrayDeclaratorList
						{
						pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId939);
						arrayDeclaratorList();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, variableDeclaratorId_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclaratorId"



	// $ANTLR start "variableInitializer"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:201:1: variableInitializer : ( arrayInitializer | expression );
	public final void variableInitializer() throws RecognitionException {
		int variableInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:202:5: ( arrayInitializer | expression )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==ARRAY_INITIALIZER) ) {
				alt43=1;
			}
			else if ( (LA43_0==EXPR) ) {
				alt43=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:202:9: arrayInitializer
					{
					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer960);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:203:9: expression
					{
					pushFollow(FOLLOW_expression_in_variableInitializer970);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, variableInitializer_StartIndex); }

		}
	}
	// $ANTLR end "variableInitializer"



	// $ANTLR start "arrayDeclarator"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:206:1: arrayDeclarator : LBRACK RBRACK ;
	public final void arrayDeclarator() throws RecognitionException {
		int arrayDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:207:5: ( LBRACK RBRACK )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:207:9: LBRACK RBRACK
			{
			match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator989); if (state.failed) return;
			match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator991); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, arrayDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "arrayDeclarator"



	// $ANTLR start "arrayDeclaratorList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:210:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
	public final void arrayDeclaratorList() throws RecognitionException {
		int arrayDeclaratorList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:211:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:211:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
			{
			match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1011); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:211:33: ( ARRAY_DECLARATOR )*
				loop44:
				while (true) {
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==ARRAY_DECLARATOR) ) {
						alt44=1;
					}

					switch (alt44) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:211:33: ARRAY_DECLARATOR
						{
						match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1013); if (state.failed) return;
						}
						break;

					default :
						break loop44;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, arrayDeclaratorList_StartIndex); }

		}
	}
	// $ANTLR end "arrayDeclaratorList"



	// $ANTLR start "arrayInitializer"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:214:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
	public final void arrayInitializer() throws RecognitionException {
		int arrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:215:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:215:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
			{
			match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1041); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:215:29: ( variableInitializer )*
				loop45:
				while (true) {
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
						alt45=1;
					}

					switch (alt45) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:215:29: variableInitializer
						{
						pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1043);
						variableInitializer();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop45;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, arrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "arrayInitializer"



	// $ANTLR start "throwsClause"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:218:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
	public final void throwsClause() throws RecognitionException {
		int throwsClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:219:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:219:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
			{
			match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1065); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:219:25: ( qualifiedIdentifier )+
			int cnt46=0;
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==DOT||LA46_0==IDENT) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:219:25: qualifiedIdentifier
					{
					pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1067);
					qualifiedIdentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt46 >= 1 ) break loop46;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(46, input);
					throw eee;
				}
				cnt46++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, throwsClause_StartIndex); }

		}
	}
	// $ANTLR end "throwsClause"



	// $ANTLR start "modifierList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:222:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
	public final void modifierList() throws RecognitionException {
		int modifierList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:223:5: ( ^( MODIFIER_LIST ( modifier )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:223:9: ^( MODIFIER_LIST ( modifier )* )
			{
			match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1089); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:223:25: ( modifier )*
				loop47:
				while (true) {
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==ABSTRACT||LA47_0==AT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0 >= PRIVATE && LA47_0 <= PUBLIC)||LA47_0==STATIC||LA47_0==STRICTFP||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
						alt47=1;
					}

					switch (alt47) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:223:25: modifier
						{
						pushFollow(FOLLOW_modifier_in_modifierList1091);
						modifier();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop47;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, modifierList_StartIndex); }

		}
	}
	// $ANTLR end "modifierList"



	// $ANTLR start "modifier"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:226:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
	public final void modifier() throws RecognitionException {
		int modifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:227:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
			int alt48=11;
			switch ( input.LA(1) ) {
			case PUBLIC:
				{
				alt48=1;
				}
				break;
			case PROTECTED:
				{
				alt48=2;
				}
				break;
			case PRIVATE:
				{
				alt48=3;
				}
				break;
			case STATIC:
				{
				alt48=4;
				}
				break;
			case ABSTRACT:
				{
				alt48=5;
				}
				break;
			case NATIVE:
				{
				alt48=6;
				}
				break;
			case SYNCHRONIZED:
				{
				alt48=7;
				}
				break;
			case TRANSIENT:
				{
				alt48=8;
				}
				break;
			case VOLATILE:
				{
				alt48=9;
				}
				break;
			case STRICTFP:
				{
				alt48=10;
				}
				break;
			case AT:
			case FINAL:
				{
				alt48=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:227:9: PUBLIC
					{
					match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1112); if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:228:9: PROTECTED
					{
					match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1122); if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:229:9: PRIVATE
					{
					match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1132); if (state.failed) return;
					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:230:9: STATIC
					{
					match(input,STATIC,FOLLOW_STATIC_in_modifier1142); if (state.failed) return;
					}
					break;
				case 5 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:231:9: ABSTRACT
					{
					match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1152); if (state.failed) return;
					}
					break;
				case 6 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:232:9: NATIVE
					{
					match(input,NATIVE,FOLLOW_NATIVE_in_modifier1162); if (state.failed) return;
					}
					break;
				case 7 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:233:9: SYNCHRONIZED
					{
					match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1172); if (state.failed) return;
					}
					break;
				case 8 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:234:9: TRANSIENT
					{
					match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1182); if (state.failed) return;
					}
					break;
				case 9 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:235:9: VOLATILE
					{
					match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1192); if (state.failed) return;
					}
					break;
				case 10 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:236:9: STRICTFP
					{
					match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1202); if (state.failed) return;
					}
					break;
				case 11 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:237:9: localModifier
					{
					pushFollow(FOLLOW_localModifier_in_modifier1212);
					localModifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, modifier_StartIndex); }

		}
	}
	// $ANTLR end "modifier"



	// $ANTLR start "localModifierList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:240:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
	public final void localModifierList() throws RecognitionException {
		int localModifierList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:241:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:241:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
			{
			match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1232); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:241:31: ( localModifier )*
				loop49:
				while (true) {
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==AT||LA49_0==FINAL) ) {
						alt49=1;
					}

					switch (alt49) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:241:31: localModifier
						{
						pushFollow(FOLLOW_localModifier_in_localModifierList1234);
						localModifier();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop49;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, localModifierList_StartIndex); }

		}
	}
	// $ANTLR end "localModifierList"



	// $ANTLR start "localModifier"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:244:1: localModifier : ( FINAL | annotation );
	public final void localModifier() throws RecognitionException {
		int localModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:245:5: ( FINAL | annotation )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==FINAL) ) {
				alt50=1;
			}
			else if ( (LA50_0==AT) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:245:9: FINAL
					{
					match(input,FINAL,FOLLOW_FINAL_in_localModifier1255); if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:246:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_localModifier1265);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, localModifier_StartIndex); }

		}
	}
	// $ANTLR end "localModifier"



	// $ANTLR start "type"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:249:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
	public final void type() throws RecognitionException {
		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
			{
			match(input,TYPE,FOLLOW_TYPE_in_type1285); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:16: ( primitiveType | qualifiedTypeIdent )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==BOOLEAN||LA51_0==BYTE||LA51_0==CHAR||LA51_0==DOUBLE||LA51_0==FLOAT||LA51_0==INT||LA51_0==LONG||LA51_0==SHORT) ) {
				alt51=1;
			}
			else if ( (LA51_0==QUALIFIED_TYPE_IDENT) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:17: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_type1288);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:33: qualifiedTypeIdent
					{
					pushFollow(FOLLOW_qualifiedTypeIdent_in_type1292);
					qualifiedTypeIdent();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:53: ( arrayDeclaratorList )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:250:53: arrayDeclaratorList
					{
					pushFollow(FOLLOW_arrayDeclaratorList_in_type1295);
					arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, type_StartIndex); }

		}
	}
	// $ANTLR end "type"



	// $ANTLR start "qualifiedTypeIdent"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:253:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
	public final void qualifiedTypeIdent() throws RecognitionException {
		int qualifiedTypeIdent_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:254:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:254:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
			{
			match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1317); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:254:32: ( typeIdent )+
			int cnt53=0;
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==IDENT) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:254:32: typeIdent
					{
					pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1319);
					typeIdent();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(53, input);
					throw eee;
				}
				cnt53++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, qualifiedTypeIdent_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedTypeIdent"



	// $ANTLR start "typeIdent"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:257:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
	public final void typeIdent() throws RecognitionException {
		int typeIdent_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:258:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:258:9: ^( IDENT ( genericTypeArgumentList )? )
			{
			match(input,IDENT,FOLLOW_IDENT_in_typeIdent1342); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:258:17: ( genericTypeArgumentList )?
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
					alt54=1;
				}
				switch (alt54) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:258:17: genericTypeArgumentList
						{
						pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1344);
						genericTypeArgumentList();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, typeIdent_StartIndex); }

		}
	}
	// $ANTLR end "typeIdent"



	// $ANTLR start "primitiveType"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:261:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
	public final void primitiveType() throws RecognitionException {
		int primitiveType_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:262:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:
			{
			if ( input.LA(1)==BOOLEAN||input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, primitiveType_StartIndex); }

		}
	}
	// $ANTLR end "primitiveType"



	// $ANTLR start "genericTypeArgumentList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:272:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
	public final void genericTypeArgumentList() throws RecognitionException {
		int genericTypeArgumentList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:273:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:273:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
			{
			match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1455); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:273:33: ( genericTypeArgument )+
			int cnt55=0;
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==QUESTION||LA55_0==TYPE) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:273:33: genericTypeArgument
					{
					pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1457);
					genericTypeArgument();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt55 >= 1 ) break loop55;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(55, input);
					throw eee;
				}
				cnt55++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, genericTypeArgumentList_StartIndex); }

		}
	}
	// $ANTLR end "genericTypeArgumentList"



	// $ANTLR start "genericTypeArgument"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:276:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
	public final void genericTypeArgument() throws RecognitionException {
		int genericTypeArgument_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:277:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==TYPE) ) {
				alt57=1;
			}
			else if ( (LA57_0==QUESTION) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:277:9: type
					{
					pushFollow(FOLLOW_type_in_genericTypeArgument1482);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:278:9: ^( QUESTION ( genericWildcardBoundType )? )
					{
					match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1493); if (state.failed) return;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:278:20: ( genericWildcardBoundType )?
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==EXTENDS||LA56_0==SUPER) ) {
							alt56=1;
						}
						switch (alt56) {
							case 1 :
								// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:278:20: genericWildcardBoundType
								{
								pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1495);
								genericWildcardBoundType();
								state._fsp--;
								if (state.failed) return;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, genericTypeArgument_StartIndex); }

		}
	}
	// $ANTLR end "genericTypeArgument"



	// $ANTLR start "genericWildcardBoundType"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:281:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
	public final void genericWildcardBoundType() throws RecognitionException {
		int genericWildcardBoundType_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:282:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==EXTENDS) ) {
				alt58=1;
			}
			else if ( (LA58_0==SUPER) ) {
				alt58=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:282:9: ^( EXTENDS type )
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1635); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_type_in_genericWildcardBoundType1637);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:283:9: ^( SUPER type )
					{
					match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1649); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_type_in_genericWildcardBoundType1651);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, genericWildcardBoundType_StartIndex); }

		}
	}
	// $ANTLR end "genericWildcardBoundType"



	// $ANTLR start "formalParameterList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:286:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
	public final void formalParameterList() throws RecognitionException {
		int formalParameterList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:287:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:287:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
			{
			match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1672); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:287:29: ( formalParameterStandardDecl )*
				loop59:
				while (true) {
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==FORMAL_PARAM_STD_DECL) ) {
						alt59=1;
					}

					switch (alt59) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:287:29: formalParameterStandardDecl
						{
						pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1674);
						formalParameterStandardDecl();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop59;
					}
				}

				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:287:58: ( formalParameterVarargDecl )?
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==FORMAL_PARAM_VARARG_DECL) ) {
					alt60=1;
				}
				switch (alt60) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:287:58: formalParameterVarargDecl
						{
						pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1677);
						formalParameterVarargDecl();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, formalParameterList_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterList"



	// $ANTLR start "formalParameterStandardDecl"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:290:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
	public final void formalParameterStandardDecl() throws RecognitionException {
		int formalParameterStandardDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:291:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:291:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
			{
			match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1704); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1706);
			localModifierList();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameterStandardDecl1708);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1710);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, formalParameterStandardDecl_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterStandardDecl"



	// $ANTLR start "formalParameterVarargDecl"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:294:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
	public final void formalParameterVarargDecl() throws RecognitionException {
		int formalParameterVarargDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:295:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:295:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
			{
			match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1735); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1737);
			localModifierList();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameterVarargDecl1739);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1741);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, formalParameterVarargDecl_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterVarargDecl"



	// $ANTLR start "qualifiedIdentifier"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:298:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
	public final void qualifiedIdentifier() throws RecognitionException {
		int qualifiedIdentifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:299:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==IDENT) ) {
				alt61=1;
			}
			else if ( (LA61_0==DOT) ) {
				alt61=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:299:9: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1765); if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:300:9: ^( DOT qualifiedIdentifier IDENT )
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1776); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1778);
					qualifiedIdentifier();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1780); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, qualifiedIdentifier_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedIdentifier"



	// $ANTLR start "annotationList"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:305:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
	public final void annotationList() throws RecognitionException {
		int annotationList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:306:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:306:9: ^( ANNOTATION_LIST ( annotation )* )
			{
			match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1807); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:306:27: ( annotation )*
				loop62:
				while (true) {
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==AT) ) {
						alt62=1;
					}

					switch (alt62) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:306:27: annotation
						{
						pushFollow(FOLLOW_annotation_in_annotationList1809);
						annotation();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop62;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, annotationList_StartIndex); }

		}
	}
	// $ANTLR end "annotationList"



	// $ANTLR start "annotation"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:309:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
	public final void annotation() throws RecognitionException {
		int annotation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:310:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:310:9: ^( AT qualifiedIdentifier ( annotationInit )? )
			{
			match(input,AT,FOLLOW_AT_in_annotation1831); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedIdentifier_in_annotation1833);
			qualifiedIdentifier();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:310:34: ( annotationInit )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==ANNOTATION_INIT_BLOCK) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:310:34: annotationInit
					{
					pushFollow(FOLLOW_annotationInit_in_annotation1835);
					annotationInit();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, annotation_StartIndex); }

		}
	}
	// $ANTLR end "annotation"



	// $ANTLR start "annotationInit"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:313:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
	public final void annotationInit() throws RecognitionException {
		int annotationInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:314:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:314:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
			{
			match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1861); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_annotationInitializers_in_annotationInit1863);
			annotationInitializers();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, annotationInit_StartIndex); }

		}
	}
	// $ANTLR end "annotationInit"



	// $ANTLR start "annotationInitializers"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:317:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
	public final void annotationInitializers() throws RecognitionException {
		int annotationInitializers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:318:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==ANNOTATION_INIT_KEY_LIST) ) {
				alt65=1;
			}
			else if ( (LA65_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
				alt65=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:318:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
					{
					match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1884); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:318:36: ( annotationInitializer )+
					int cnt64=0;
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==IDENT) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:318:36: annotationInitializer
							{
							pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers1886);
							annotationInitializer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt64 >= 1 ) break loop64;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(64, input);
							throw eee;
						}
						cnt64++;
					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:319:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
					{
					match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1899); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers1901);
					annotationElementValue();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, annotationInitializers_StartIndex); }

		}
	}
	// $ANTLR end "annotationInitializers"



	// $ANTLR start "annotationInitializer"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:322:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
	public final void annotationInitializer() throws RecognitionException {
		int annotationInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:323:5: ( ^( IDENT annotationElementValue ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:323:9: ^( IDENT annotationElementValue )
			{
			match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer1926); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer1928);
			annotationElementValue();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, annotationInitializer_StartIndex); }

		}
	}
	// $ANTLR end "annotationInitializer"



	// $ANTLR start "annotationElementValue"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:326:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
	public final void annotationElementValue() throws RecognitionException {
		int annotationElementValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:327:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
			int alt67=3;
			switch ( input.LA(1) ) {
			case ANNOTATION_INIT_ARRAY_ELEMENT:
				{
				alt67=1;
				}
				break;
			case AT:
				{
				alt67=2;
				}
				break;
			case EXPR:
				{
				alt67=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:327:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
					{
					match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1953); if (state.failed) return;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:327:41: ( annotationElementValue )*
						loop66:
						while (true) {
							int alt66=2;
							int LA66_0 = input.LA(1);
							if ( (LA66_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA66_0==AT||LA66_0==EXPR) ) {
								alt66=1;
							}

							switch (alt66) {
							case 1 :
								// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:327:41: annotationElementValue
								{
								pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue1955);
								annotationElementValue();
								state._fsp--;
								if (state.failed) return;
								}
								break;

							default :
								break loop66;
							}
						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:328:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotationElementValue1967);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:329:9: expression
					{
					pushFollow(FOLLOW_expression_in_annotationElementValue1977);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, annotationElementValue_StartIndex); }

		}
	}
	// $ANTLR end "annotationElementValue"



	// $ANTLR start "annotationTopLevelScope"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:332:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
	public final void annotationTopLevelScope() throws RecognitionException {
		int annotationTopLevelScope_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:333:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:333:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
			{
			match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2001); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:333:38: ( annotationScopeDeclarations )*
				loop68:
				while (true) {
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==ANNOTATION_METHOD_DECL||LA68_0==AT||LA68_0==CLASS||LA68_0==ENUM||LA68_0==INTERFACE||LA68_0==VAR_DECLARATION) ) {
						alt68=1;
					}

					switch (alt68) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:333:38: annotationScopeDeclarations
						{
						pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2003);
						annotationScopeDeclarations();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop68;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, annotationTopLevelScope_StartIndex); }

		}
	}
	// $ANTLR end "annotationTopLevelScope"



	// $ANTLR start "annotationScopeDeclarations"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:336:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
	public final void annotationScopeDeclarations() throws RecognitionException {
		int annotationScopeDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:337:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
			int alt70=3;
			switch ( input.LA(1) ) {
			case ANNOTATION_METHOD_DECL:
				{
				alt70=1;
				}
				break;
			case VAR_DECLARATION:
				{
				alt70=2;
				}
				break;
			case AT:
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt70=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:337:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
					{
					match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2029); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2031);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_annotationScopeDeclarations2033);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2035); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:337:58: ( annotationDefaultValue )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==DEFAULT) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:337:58: annotationDefaultValue
							{
							pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2037);
							annotationDefaultValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:338:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
					{
					match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2050); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2052);
					modifierList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_annotationScopeDeclarations2054);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2056);
					variableDeclaratorList();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:339:9: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2067);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, annotationScopeDeclarations_StartIndex); }

		}
	}
	// $ANTLR end "annotationScopeDeclarations"



	// $ANTLR start "annotationDefaultValue"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:342:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
	public final void annotationDefaultValue() throws RecognitionException {
		int annotationDefaultValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:343:5: ( ^( DEFAULT annotationElementValue ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:343:9: ^( DEFAULT annotationElementValue )
			{
			match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2091); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2093);
			annotationElementValue();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, annotationDefaultValue_StartIndex); }

		}
	}
	// $ANTLR end "annotationDefaultValue"



	// $ANTLR start "block"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:348:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
	public final void block() throws RecognitionException {
		int block_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:349:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:349:9: ^( BLOCK_SCOPE ( blockStatement )* )
			{
			match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2116); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:349:23: ( blockStatement )*
				loop71:
				while (true) {
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==ASSERT||LA71_0==AT||LA71_0==BLOCK_SCOPE||LA71_0==BREAK||LA71_0==CLASS||LA71_0==CONTINUE||LA71_0==DO||LA71_0==ENUM||LA71_0==EXPR||LA71_0==FOR||LA71_0==FOR_EACH||LA71_0==IF||LA71_0==INTERFACE||LA71_0==LABELED_STATEMENT||LA71_0==RETURN||LA71_0==SEMI||LA71_0==SWITCH||LA71_0==SYNCHRONIZED||LA71_0==THROW||LA71_0==TRY||LA71_0==VAR_DECLARATION||LA71_0==WHILE) ) {
						alt71=1;
					}

					switch (alt71) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:349:23: blockStatement
						{
						pushFollow(FOLLOW_blockStatement_in_block2118);
						blockStatement();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop71;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, block_StartIndex); }

		}
	}
	// $ANTLR end "block"



	// $ANTLR start "blockStatement"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:352:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
	public final void blockStatement() throws RecognitionException {
		int blockStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:353:5: ( localVariableDeclaration | typeDeclaration | statement )
			int alt72=3;
			switch ( input.LA(1) ) {
			case VAR_DECLARATION:
				{
				alt72=1;
				}
				break;
			case AT:
			case CLASS:
			case ENUM:
			case INTERFACE:
				{
				alt72=2;
				}
				break;
			case ASSERT:
			case BLOCK_SCOPE:
			case BREAK:
			case CONTINUE:
			case DO:
			case EXPR:
			case FOR:
			case FOR_EACH:
			case IF:
			case LABELED_STATEMENT:
			case RETURN:
			case SEMI:
			case SWITCH:
			case SYNCHRONIZED:
			case THROW:
			case TRY:
			case WHILE:
				{
				alt72=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:353:9: localVariableDeclaration
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2143);
					localVariableDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:354:9: typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_blockStatement2153);
					typeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:355:9: statement
					{
					pushFollow(FOLLOW_statement_in_blockStatement2163);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, blockStatement_StartIndex); }

		}
	}
	// $ANTLR end "blockStatement"



	// $ANTLR start "localVariableDeclaration"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:358:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
	public final void localVariableDeclaration() throws RecognitionException {
		int localVariableDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:359:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:359:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
			{
			match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2187); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2189);
			localModifierList();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_localVariableDeclaration2191);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2193);
			variableDeclaratorList();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, localVariableDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "localVariableDeclaration"



	// $ANTLR start "statement"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:363:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:364:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
			int alt80=17;
			switch ( input.LA(1) ) {
			case BLOCK_SCOPE:
				{
				alt80=1;
				}
				break;
			case ASSERT:
				{
				alt80=2;
				}
				break;
			case IF:
				{
				alt80=3;
				}
				break;
			case FOR:
				{
				alt80=4;
				}
				break;
			case FOR_EACH:
				{
				alt80=5;
				}
				break;
			case WHILE:
				{
				alt80=6;
				}
				break;
			case DO:
				{
				alt80=7;
				}
				break;
			case TRY:
				{
				alt80=8;
				}
				break;
			case SWITCH:
				{
				alt80=9;
				}
				break;
			case SYNCHRONIZED:
				{
				alt80=10;
				}
				break;
			case RETURN:
				{
				alt80=11;
				}
				break;
			case THROW:
				{
				alt80=12;
				}
				break;
			case BREAK:
				{
				alt80=13;
				}
				break;
			case CONTINUE:
				{
				alt80=14;
				}
				break;
			case LABELED_STATEMENT:
				{
				alt80=15;
				}
				break;
			case EXPR:
				{
				alt80=16;
				}
				break;
			case SEMI:
				{
				alt80=17;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:364:9: block
					{
					pushFollow(FOLLOW_block_in_statement2226);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:365:9: ^( ASSERT expression ( expression )? )
					{
					match(input,ASSERT,FOLLOW_ASSERT_in_statement2237); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement2239);
					expression();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:365:29: ( expression )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==EXPR) ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:365:29: expression
							{
							pushFollow(FOLLOW_expression_in_statement2241);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:366:9: ^( IF parenthesizedExpression statement ( statement )? )
					{
					match(input,IF,FOLLOW_IF_in_statement2254); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_parenthesizedExpression_in_statement2256);
					parenthesizedExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement2258);
					statement();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:366:48: ( statement )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==ASSERT||LA74_0==BLOCK_SCOPE||LA74_0==BREAK||LA74_0==CONTINUE||LA74_0==DO||LA74_0==EXPR||LA74_0==FOR||LA74_0==FOR_EACH||LA74_0==IF||LA74_0==LABELED_STATEMENT||LA74_0==RETURN||LA74_0==SEMI||LA74_0==SWITCH||LA74_0==SYNCHRONIZED||LA74_0==THROW||LA74_0==TRY||LA74_0==WHILE) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:366:48: statement
							{
							pushFollow(FOLLOW_statement_in_statement2260);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:367:9: ^( FOR forInit forCondition forUpdater statement )
					{
					match(input,FOR,FOLLOW_FOR_in_statement2273); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_forInit_in_statement2275);
					forInit();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_forCondition_in_statement2277);
					forCondition();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_forUpdater_in_statement2279);
					forUpdater();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement2281);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 5 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:368:9: ^( FOR_EACH localModifierList type IDENT expression statement )
					{
					match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2293); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_localModifierList_in_statement2295);
					localModifierList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_statement2297);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_statement2299); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement2301);
					expression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement2303);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 6 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:369:9: ^( WHILE parenthesizedExpression statement )
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement2316); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_parenthesizedExpression_in_statement2318);
					parenthesizedExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement2320);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 7 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:370:9: ^( DO statement parenthesizedExpression )
					{
					match(input,DO,FOLLOW_DO_in_statement2332); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement2334);
					statement();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_parenthesizedExpression_in_statement2336);
					parenthesizedExpression();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 8 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:371:9: ^( TRY block ( catches )? ( block )? )
					{
					match(input,TRY,FOLLOW_TRY_in_statement2348); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement2350);
					block();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:371:21: ( catches )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==CATCH_CLAUSE_LIST) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:371:21: catches
							{
							pushFollow(FOLLOW_catches_in_statement2352);
							catches();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:371:30: ( block )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==BLOCK_SCOPE) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:371:30: block
							{
							pushFollow(FOLLOW_block_in_statement2355);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 9 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:372:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement2370); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_parenthesizedExpression_in_statement2372);
					parenthesizedExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_switchBlockLabels_in_statement2374);
					switchBlockLabels();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 10 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:373:9: ^( SYNCHRONIZED parenthesizedExpression block )
					{
					match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2386); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_parenthesizedExpression_in_statement2388);
					parenthesizedExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement2390);
					block();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 11 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:374:9: ^( RETURN ( expression )? )
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement2402); if (state.failed) return;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:374:18: ( expression )?
						int alt77=2;
						int LA77_0 = input.LA(1);
						if ( (LA77_0==EXPR) ) {
							alt77=1;
						}
						switch (alt77) {
							case 1 :
								// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:374:18: expression
								{
								pushFollow(FOLLOW_expression_in_statement2404);
								expression();
								state._fsp--;
								if (state.failed) return;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					}
					break;
				case 12 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:375:9: ^( THROW expression )
					{
					match(input,THROW,FOLLOW_THROW_in_statement2417); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement2419);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 13 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:376:9: ^( BREAK ( IDENT )? )
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement2431); if (state.failed) return;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:376:17: ( IDENT )?
						int alt78=2;
						int LA78_0 = input.LA(1);
						if ( (LA78_0==IDENT) ) {
							alt78=1;
						}
						switch (alt78) {
							case 1 :
								// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:376:17: IDENT
								{
								match(input,IDENT,FOLLOW_IDENT_in_statement2433); if (state.failed) return;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					}
					break;
				case 14 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:377:9: ^( CONTINUE ( IDENT )? )
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2446); if (state.failed) return;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return;
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:377:20: ( IDENT )?
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==IDENT) ) {
							alt79=1;
						}
						switch (alt79) {
							case 1 :
								// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:377:20: IDENT
								{
								match(input,IDENT,FOLLOW_IDENT_in_statement2448); if (state.failed) return;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return;
					}

					}
					break;
				case 15 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:378:9: ^( LABELED_STATEMENT IDENT statement )
					{
					match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2461); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,IDENT,FOLLOW_IDENT_in_statement2463); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement2465);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 16 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:379:9: expression
					{
					pushFollow(FOLLOW_expression_in_statement2476);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 17 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:380:9: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_statement2486); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "catches"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:383:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
	public final void catches() throws RecognitionException {
		int catches_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:384:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:384:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
			{
			match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2515); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:384:29: ( catchClause )+
			int cnt81=0;
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==CATCH) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:384:29: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches2517);
					catchClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt81 >= 1 ) break loop81;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(81, input);
					throw eee;
				}
				cnt81++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, catches_StartIndex); }

		}
	}
	// $ANTLR end "catches"



	// $ANTLR start "catchClause"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:387:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
	public final void catchClause() throws RecognitionException {
		int catchClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:388:5: ( ^( CATCH formalParameterStandardDecl block ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:388:9: ^( CATCH formalParameterStandardDecl block )
			{
			match(input,CATCH,FOLLOW_CATCH_in_catchClause2543); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2545);
			formalParameterStandardDecl();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_block_in_catchClause2547);
			block();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, catchClause_StartIndex); }

		}
	}
	// $ANTLR end "catchClause"



	// $ANTLR start "switchBlockLabels"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:391:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
	public final void switchBlockLabels() throws RecognitionException {
		int switchBlockLabels_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
			{
			match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2568); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:35: ( switchCaseLabel )*
				loop82:
				while (true) {
					int alt82=2;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==CASE) ) {
						int LA82_2 = input.LA(2);
						if ( (synpred125_JavaTreeParser()) ) {
							alt82=1;
						}

					}

					switch (alt82) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:35: switchCaseLabel
						{
						pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2570);
						switchCaseLabel();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop82;
					}
				}

				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:52: ( switchDefaultLabel )?
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==DEFAULT) ) {
					alt83=1;
				}
				switch (alt83) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:52: switchDefaultLabel
						{
						pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2573);
						switchDefaultLabel();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:72: ( switchCaseLabel )*
				loop84:
				while (true) {
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==CASE) ) {
						alt84=1;
					}

					switch (alt84) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:72: switchCaseLabel
						{
						pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2576);
						switchCaseLabel();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop84;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, switchBlockLabels_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockLabels"



	// $ANTLR start "switchCaseLabel"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:395:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
	public final void switchCaseLabel() throws RecognitionException {
		int switchCaseLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:396:5: ( ^( CASE expression ( blockStatement )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:396:9: ^( CASE expression ( blockStatement )* )
			{
			match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2606); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_switchCaseLabel2608);
			expression();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:396:27: ( blockStatement )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==ASSERT||LA85_0==AT||LA85_0==BLOCK_SCOPE||LA85_0==BREAK||LA85_0==CLASS||LA85_0==CONTINUE||LA85_0==DO||LA85_0==ENUM||LA85_0==EXPR||LA85_0==FOR||LA85_0==FOR_EACH||LA85_0==IF||LA85_0==INTERFACE||LA85_0==LABELED_STATEMENT||LA85_0==RETURN||LA85_0==SEMI||LA85_0==SWITCH||LA85_0==SYNCHRONIZED||LA85_0==THROW||LA85_0==TRY||LA85_0==VAR_DECLARATION||LA85_0==WHILE) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:396:27: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2610);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop85;
				}
			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, switchCaseLabel_StartIndex); }

		}
	}
	// $ANTLR end "switchCaseLabel"



	// $ANTLR start "switchDefaultLabel"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:399:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
	public final void switchDefaultLabel() throws RecognitionException {
		int switchDefaultLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:400:5: ( ^( DEFAULT ( blockStatement )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:400:9: ^( DEFAULT ( blockStatement )* )
			{
			match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2636); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:400:19: ( blockStatement )*
				loop86:
				while (true) {
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==ASSERT||LA86_0==AT||LA86_0==BLOCK_SCOPE||LA86_0==BREAK||LA86_0==CLASS||LA86_0==CONTINUE||LA86_0==DO||LA86_0==ENUM||LA86_0==EXPR||LA86_0==FOR||LA86_0==FOR_EACH||LA86_0==IF||LA86_0==INTERFACE||LA86_0==LABELED_STATEMENT||LA86_0==RETURN||LA86_0==SEMI||LA86_0==SWITCH||LA86_0==SYNCHRONIZED||LA86_0==THROW||LA86_0==TRY||LA86_0==VAR_DECLARATION||LA86_0==WHILE) ) {
						alt86=1;
					}

					switch (alt86) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:400:19: blockStatement
						{
						pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2638);
						blockStatement();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop86;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, switchDefaultLabel_StartIndex); }

		}
	}
	// $ANTLR end "switchDefaultLabel"



	// $ANTLR start "forInit"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:403:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
	public final void forInit() throws RecognitionException {
		int forInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
			{
			match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2664); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:20: ( localVariableDeclaration | ( expression )* )?
				int alt88=3;
				switch ( input.LA(1) ) {
					case VAR_DECLARATION:
						{
						alt88=1;
						}
						break;
					case EXPR:
						{
						alt88=2;
						}
						break;
					case UP:
						{
						int LA88_3 = input.LA(2);
						if ( (synpred132_JavaTreeParser()) ) {
							alt88=2;
						}
						}
						break;
				}
				switch (alt88) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:21: localVariableDeclaration
						{
						pushFollow(FOLLOW_localVariableDeclaration_in_forInit2667);
						localVariableDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;
					case 2 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: ( expression )*
						{
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: ( expression )*
						loop87:
						while (true) {
							int alt87=2;
							int LA87_0 = input.LA(1);
							if ( (LA87_0==EXPR) ) {
								alt87=1;
							}

							switch (alt87) {
							case 1 :
								// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: expression
								{
								pushFollow(FOLLOW_expression_in_forInit2671);
								expression();
								state._fsp--;
								if (state.failed) return;
								}
								break;

							default :
								break loop87;
							}
						}

						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, forInit_StartIndex); }

		}
	}
	// $ANTLR end "forInit"



	// $ANTLR start "forCondition"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:407:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
	public final void forCondition() throws RecognitionException {
		int forCondition_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:408:5: ( ^( FOR_CONDITION ( expression )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:408:9: ^( FOR_CONDITION ( expression )? )
			{
			match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2699); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:408:25: ( expression )?
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==EXPR) ) {
					alt89=1;
				}
				switch (alt89) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:408:25: expression
						{
						pushFollow(FOLLOW_expression_in_forCondition2701);
						expression();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, forCondition_StartIndex); }

		}
	}
	// $ANTLR end "forCondition"



	// $ANTLR start "forUpdater"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:411:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
	public final void forUpdater() throws RecognitionException {
		int forUpdater_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:412:5: ( ^( FOR_UPDATE ( expression )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:412:9: ^( FOR_UPDATE ( expression )* )
			{
			match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2727); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:412:22: ( expression )*
				loop90:
				while (true) {
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==EXPR) ) {
						alt90=1;
					}

					switch (alt90) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:412:22: expression
						{
						pushFollow(FOLLOW_expression_in_forUpdater2729);
						expression();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop90;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, forUpdater_StartIndex); }

		}
	}
	// $ANTLR end "forUpdater"



	// $ANTLR start "parenthesizedExpression"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:417:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
	public final void parenthesizedExpression() throws RecognitionException {
		int parenthesizedExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:418:5: ( ^( PARENTESIZED_EXPR expression ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:418:9: ^( PARENTESIZED_EXPR expression )
			{
			match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2757); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_parenthesizedExpression2759);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, parenthesizedExpression_StartIndex); }

		}
	}
	// $ANTLR end "parenthesizedExpression"



	// $ANTLR start "expression"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:421:1: expression : ^( EXPR expr ) ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:422:5: ( ^( EXPR expr ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:422:9: ^( EXPR expr )
			{
			match(input,EXPR,FOLLOW_EXPR_in_expression2784); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_expression2786);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "expr"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:425:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
	public final void expr() throws RecognitionException {
		int expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:426:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
			int alt91=43;
			switch ( input.LA(1) ) {
			case ASSIGN:
				{
				alt91=1;
				}
				break;
			case PLUS_ASSIGN:
				{
				alt91=2;
				}
				break;
			case MINUS_ASSIGN:
				{
				alt91=3;
				}
				break;
			case STAR_ASSIGN:
				{
				alt91=4;
				}
				break;
			case DIV_ASSIGN:
				{
				alt91=5;
				}
				break;
			case AND_ASSIGN:
				{
				alt91=6;
				}
				break;
			case OR_ASSIGN:
				{
				alt91=7;
				}
				break;
			case XOR_ASSIGN:
				{
				alt91=8;
				}
				break;
			case MOD_ASSIGN:
				{
				alt91=9;
				}
				break;
			case BIT_SHIFT_RIGHT_ASSIGN:
				{
				alt91=10;
				}
				break;
			case SHIFT_RIGHT_ASSIGN:
				{
				alt91=11;
				}
				break;
			case SHIFT_LEFT_ASSIGN:
				{
				alt91=12;
				}
				break;
			case QUESTION:
				{
				alt91=13;
				}
				break;
			case LOGICAL_OR:
				{
				alt91=14;
				}
				break;
			case LOGICAL_AND:
				{
				alt91=15;
				}
				break;
			case OR:
				{
				alt91=16;
				}
				break;
			case XOR:
				{
				alt91=17;
				}
				break;
			case AND:
				{
				alt91=18;
				}
				break;
			case EQUAL:
				{
				alt91=19;
				}
				break;
			case NOT_EQUAL:
				{
				alt91=20;
				}
				break;
			case INSTANCEOF:
				{
				alt91=21;
				}
				break;
			case LESS_OR_EQUAL:
				{
				alt91=22;
				}
				break;
			case GREATER_OR_EQUAL:
				{
				alt91=23;
				}
				break;
			case BIT_SHIFT_RIGHT:
				{
				alt91=24;
				}
				break;
			case SHIFT_RIGHT:
				{
				alt91=25;
				}
				break;
			case GREATER_THAN:
				{
				alt91=26;
				}
				break;
			case SHIFT_LEFT:
				{
				alt91=27;
				}
				break;
			case LESS_THAN:
				{
				alt91=28;
				}
				break;
			case PLUS:
				{
				alt91=29;
				}
				break;
			case MINUS:
				{
				alt91=30;
				}
				break;
			case STAR:
				{
				alt91=31;
				}
				break;
			case DIV:
				{
				alt91=32;
				}
				break;
			case MOD:
				{
				alt91=33;
				}
				break;
			case UNARY_PLUS:
				{
				alt91=34;
				}
				break;
			case UNARY_MINUS:
				{
				alt91=35;
				}
				break;
			case PRE_INC:
				{
				alt91=36;
				}
				break;
			case PRE_DEC:
				{
				alt91=37;
				}
				break;
			case POST_INC:
				{
				alt91=38;
				}
				break;
			case POST_DEC:
				{
				alt91=39;
				}
				break;
			case NOT:
				{
				alt91=40;
				}
				break;
			case LOGICAL_NOT:
				{
				alt91=41;
				}
				break;
			case CAST_EXPR:
				{
				alt91=42;
				}
				break;
			case ARRAY_DECLARATOR:
			case ARRAY_ELEMENT_ACCESS:
			case CHARACTER_LITERAL:
			case CLASS_CONSTRUCTOR_CALL:
			case DECIMAL_LITERAL:
			case DOT:
			case FALSE:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENT:
			case METHOD_CALL:
			case NULL:
			case OCTAL_LITERAL:
			case PARENTESIZED_EXPR:
			case STATIC_ARRAY_CREATOR:
			case STRING_LITERAL:
			case SUPER:
			case SUPER_CONSTRUCTOR_CALL:
			case THIS:
			case THIS_CONSTRUCTOR_CALL:
			case TRUE:
				{
				alt91=43;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:426:9: ^( ASSIGN expr expr )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr2807); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2809);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2811);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:427:9: ^( PLUS_ASSIGN expr expr )
					{
					match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr2823); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2825);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2827);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:428:9: ^( MINUS_ASSIGN expr expr )
					{
					match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr2839); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2841);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2843);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:429:9: ^( STAR_ASSIGN expr expr )
					{
					match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr2855); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2857);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2859);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 5 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:430:9: ^( DIV_ASSIGN expr expr )
					{
					match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr2871); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2873);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2875);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 6 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:431:9: ^( AND_ASSIGN expr expr )
					{
					match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr2887); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2889);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2891);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 7 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:432:9: ^( OR_ASSIGN expr expr )
					{
					match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr2903); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2905);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2907);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 8 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:433:9: ^( XOR_ASSIGN expr expr )
					{
					match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr2919); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2921);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2923);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 9 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:434:9: ^( MOD_ASSIGN expr expr )
					{
					match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr2935); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2937);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2939);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 10 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:435:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
					{
					match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr2951); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2953);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2955);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 11 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:436:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
					{
					match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr2967); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2969);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2971);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 12 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:437:9: ^( SHIFT_LEFT_ASSIGN expr expr )
					{
					match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr2983); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2985);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr2987);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 13 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:438:9: ^( QUESTION expr expr expr )
					{
					match(input,QUESTION,FOLLOW_QUESTION_in_expr2999); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3001);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3003);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3005);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 14 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:439:9: ^( LOGICAL_OR expr expr )
					{
					match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3017); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3019);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3021);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 15 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:440:9: ^( LOGICAL_AND expr expr )
					{
					match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3033); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3035);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3037);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 16 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:441:9: ^( OR expr expr )
					{
					match(input,OR,FOLLOW_OR_in_expr3049); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3051);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3053);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 17 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:442:9: ^( XOR expr expr )
					{
					match(input,XOR,FOLLOW_XOR_in_expr3065); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3067);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3069);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 18 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:443:9: ^( AND expr expr )
					{
					match(input,AND,FOLLOW_AND_in_expr3081); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3083);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3085);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 19 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:444:9: ^( EQUAL expr expr )
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_expr3097); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3099);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3101);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 20 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:445:9: ^( NOT_EQUAL expr expr )
					{
					match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3113); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3115);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3117);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 21 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:446:9: ^( INSTANCEOF expr type )
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3129); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3131);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_expr3133);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 22 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:447:9: ^( LESS_OR_EQUAL expr expr )
					{
					match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3145); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3147);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3149);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 23 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:448:9: ^( GREATER_OR_EQUAL expr expr )
					{
					match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3161); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3163);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3165);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 24 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:449:9: ^( BIT_SHIFT_RIGHT expr expr )
					{
					match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3177); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3179);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3181);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 25 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:450:9: ^( SHIFT_RIGHT expr expr )
					{
					match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3193); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3195);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3197);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 26 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:451:9: ^( GREATER_THAN expr expr )
					{
					match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3209); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3211);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3213);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 27 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:452:9: ^( SHIFT_LEFT expr expr )
					{
					match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3225); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3227);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3229);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 28 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:453:9: ^( LESS_THAN expr expr )
					{
					match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3241); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3243);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3245);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 29 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:454:9: ^( PLUS expr expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr3257); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3259);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3261);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 30 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:455:9: ^( MINUS expr expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr3273); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3275);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3277);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 31 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:456:9: ^( STAR expr expr )
					{
					match(input,STAR,FOLLOW_STAR_in_expr3289); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3291);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3293);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 32 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:457:9: ^( DIV expr expr )
					{
					match(input,DIV,FOLLOW_DIV_in_expr3305); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3307);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3309);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 33 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:458:9: ^( MOD expr expr )
					{
					match(input,MOD,FOLLOW_MOD_in_expr3321); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3323);
					expr();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3325);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 34 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:459:9: ^( UNARY_PLUS expr )
					{
					match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3337); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3339);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 35 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:460:9: ^( UNARY_MINUS expr )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3351); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3353);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 36 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:461:9: ^( PRE_INC expr )
					{
					match(input,PRE_INC,FOLLOW_PRE_INC_in_expr3365); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3367);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 37 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:462:9: ^( PRE_DEC expr )
					{
					match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr3379); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3381);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 38 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:463:9: ^( POST_INC expr )
					{
					match(input,POST_INC,FOLLOW_POST_INC_in_expr3393); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3395);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 39 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:464:9: ^( POST_DEC expr )
					{
					match(input,POST_DEC,FOLLOW_POST_DEC_in_expr3407); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3409);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 40 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:465:9: ^( NOT expr )
					{
					match(input,NOT,FOLLOW_NOT_in_expr3421); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3423);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 41 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:466:9: ^( LOGICAL_NOT expr )
					{
					match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3435); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3437);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 42 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:467:9: ^( CAST_EXPR type expr )
					{
					match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3449); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_type_in_expr3451);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_expr3453);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 43 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:468:9: primaryExpression
					{
					pushFollow(FOLLOW_primaryExpression_in_expr3464);
					primaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, expr_StartIndex); }

		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "primaryExpression"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:471:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
	public final void primaryExpression() throws RecognitionException {
		int primaryExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:472:5: ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
			int alt95=11;
			switch ( input.LA(1) ) {
			case DOT:
				{
				alt95=1;
				}
				break;
			case PARENTESIZED_EXPR:
				{
				alt95=2;
				}
				break;
			case IDENT:
				{
				alt95=3;
				}
				break;
			case METHOD_CALL:
				{
				alt95=4;
				}
				break;
			case SUPER_CONSTRUCTOR_CALL:
			case THIS_CONSTRUCTOR_CALL:
				{
				alt95=5;
				}
				break;
			case ARRAY_ELEMENT_ACCESS:
				{
				alt95=6;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FALSE:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case NULL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
			case TRUE:
				{
				alt95=7;
				}
				break;
			case CLASS_CONSTRUCTOR_CALL:
			case STATIC_ARRAY_CREATOR:
				{
				alt95=8;
				}
				break;
			case THIS:
				{
				alt95=9;
				}
				break;
			case ARRAY_DECLARATOR:
				{
				alt95=10;
				}
				break;
			case SUPER:
				{
				alt95=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:472:9: ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
					{
					match(input,DOT,FOLLOW_DOT_in_primaryExpression3490); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:473:13: ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
					int alt93=3;
					switch ( input.LA(1) ) {
					case ARRAY_DECLARATOR:
					case ARRAY_ELEMENT_ACCESS:
					case CHARACTER_LITERAL:
					case CLASS_CONSTRUCTOR_CALL:
					case DECIMAL_LITERAL:
					case DOT:
					case FALSE:
					case FLOATING_POINT_LITERAL:
					case HEX_LITERAL:
					case IDENT:
					case METHOD_CALL:
					case NULL:
					case OCTAL_LITERAL:
					case PARENTESIZED_EXPR:
					case STATIC_ARRAY_CREATOR:
					case STRING_LITERAL:
					case SUPER:
					case SUPER_CONSTRUCTOR_CALL:
					case THIS:
					case THIS_CONSTRUCTOR_CALL:
					case TRUE:
						{
						alt93=1;
						}
						break;
					case BOOLEAN:
					case BYTE:
					case CHAR:
					case DOUBLE:
					case FLOAT:
					case INT:
					case LONG:
					case SHORT:
						{
						alt93=2;
						}
						break;
					case VOID:
						{
						alt93=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 93, 0, input);
						throw nvae;
					}
					switch (alt93) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:473:17: primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
							{
							pushFollow(FOLLOW_primaryExpression_in_primaryExpression3508);
							primaryExpression();
							state._fsp--;
							if (state.failed) return;
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:474:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
							int alt92=5;
							switch ( input.LA(1) ) {
							case IDENT:
								{
								alt92=1;
								}
								break;
							case THIS:
								{
								alt92=2;
								}
								break;
							case SUPER:
								{
								alt92=3;
								}
								break;
							case CLASS_CONSTRUCTOR_CALL:
								{
								alt92=4;
								}
								break;
							case CLASS:
								{
								alt92=5;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 92, 0, input);
								throw nvae;
							}
							switch (alt92) {
								case 1 :
									// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:474:21: IDENT
									{
									match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3530); if (state.failed) return;
									}
									break;
								case 2 :
									// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:475:21: THIS
									{
									match(input,THIS,FOLLOW_THIS_in_primaryExpression3552); if (state.failed) return;
									}
									break;
								case 3 :
									// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:476:21: SUPER
									{
									match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3574); if (state.failed) return;
									}
									break;
								case 4 :
									// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:477:21: innerNewExpression
									{
									pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3596);
									innerNewExpression();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 5 :
									// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:478:21: CLASS
									{
									match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3618); if (state.failed) return;
									}
									break;

							}

							}
							break;
						case 2 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:480:17: primitiveType CLASS
							{
							pushFollow(FOLLOW_primitiveType_in_primaryExpression3654);
							primitiveType();
							state._fsp--;
							if (state.failed) return;
							match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3656); if (state.failed) return;
							}
							break;
						case 3 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:481:17: VOID CLASS
							{
							match(input,VOID,FOLLOW_VOID_in_primaryExpression3674); if (state.failed) return;
							match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3676); if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:484:9: parenthesizedExpression
					{
					pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression3710);
					parenthesizedExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:485:9: IDENT
					{
					match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3720); if (state.failed) return;
					}
					break;
				case 4 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:486:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
					{
					match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression3731); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_primaryExpression_in_primaryExpression3733);
					primaryExpression();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:486:41: ( genericTypeArgumentList )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:486:41: genericTypeArgumentList
							{
							pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression3735);
							genericTypeArgumentList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_arguments_in_primaryExpression3738);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 5 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:487:9: explicitConstructorCall
					{
					pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression3749);
					explicitConstructorCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:488:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
					{
					match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3760); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_primaryExpression_in_primaryExpression3762);
					primaryExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_in_primaryExpression3764);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 7 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:489:9: literal
					{
					pushFollow(FOLLOW_literal_in_primaryExpression3775);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:490:9: newExpression
					{
					pushFollow(FOLLOW_newExpression_in_primaryExpression3785);
					newExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:491:9: THIS
					{
					match(input,THIS,FOLLOW_THIS_in_primaryExpression3795); if (state.failed) return;
					}
					break;
				case 10 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:492:9: arrayTypeDeclarator
					{
					pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression3805);
					arrayTypeDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:493:9: SUPER
					{
					match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3815); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, primaryExpression_StartIndex); }

		}
	}
	// $ANTLR end "primaryExpression"



	// $ANTLR start "explicitConstructorCall"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:496:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
	public final void explicitConstructorCall() throws RecognitionException {
		int explicitConstructorCall_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:497:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==THIS_CONSTRUCTOR_CALL) ) {
				alt99=1;
			}
			else if ( (LA99_0==SUPER_CONSTRUCTOR_CALL) ) {
				alt99=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}

			switch (alt99) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:497:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
					{
					match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall3839); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:497:33: ( genericTypeArgumentList )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:497:33: genericTypeArgumentList
							{
							pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3841);
							genericTypeArgumentList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_arguments_in_explicitConstructorCall3844);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:498:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
					{
					match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall3856); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:498:34: ( primaryExpression )?
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==ARRAY_DECLARATOR||LA97_0==ARRAY_ELEMENT_ACCESS||LA97_0==CHARACTER_LITERAL||LA97_0==CLASS_CONSTRUCTOR_CALL||LA97_0==DECIMAL_LITERAL||LA97_0==DOT||LA97_0==FALSE||LA97_0==FLOATING_POINT_LITERAL||(LA97_0 >= HEX_LITERAL && LA97_0 <= IDENT)||LA97_0==METHOD_CALL||LA97_0==NULL||LA97_0==OCTAL_LITERAL||LA97_0==PARENTESIZED_EXPR||LA97_0==STATIC_ARRAY_CREATOR||(LA97_0 >= STRING_LITERAL && LA97_0 <= SUPER_CONSTRUCTOR_CALL)||(LA97_0 >= THIS && LA97_0 <= THIS_CONSTRUCTOR_CALL)||LA97_0==TRUE) ) {
						alt97=1;
					}
					switch (alt97) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:498:34: primaryExpression
							{
							pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall3858);
							primaryExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:498:53: ( genericTypeArgumentList )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:498:53: genericTypeArgumentList
							{
							pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3861);
							genericTypeArgumentList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_arguments_in_explicitConstructorCall3864);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, explicitConstructorCall_StartIndex); }

		}
	}
	// $ANTLR end "explicitConstructorCall"



	// $ANTLR start "arrayTypeDeclarator"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:501:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
	public final void arrayTypeDeclarator() throws RecognitionException {
		int arrayTypeDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:502:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:502:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
			{
			match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator3885); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:502:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
			int alt100=3;
			switch ( input.LA(1) ) {
			case ARRAY_DECLARATOR:
				{
				alt100=1;
				}
				break;
			case DOT:
			case IDENT:
				{
				alt100=2;
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				alt100=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}
			switch (alt100) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:502:29: arrayTypeDeclarator
					{
					pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator3888);
					arrayTypeDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:502:51: qualifiedIdentifier
					{
					pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator3892);
					qualifiedIdentifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:502:73: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator3896);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, arrayTypeDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "arrayTypeDeclarator"



	// $ANTLR start "newExpression"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:505:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
	public final void newExpression() throws RecognitionException {
		int newExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:506:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==STATIC_ARRAY_CREATOR) ) {
				alt105=1;
			}
			else if ( (LA105_0==CLASS_CONSTRUCTOR_CALL) ) {
				alt105=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:506:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
					{
					match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression3920); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:507:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==BOOLEAN||LA102_0==BYTE||LA102_0==CHAR||LA102_0==DOUBLE||LA102_0==FLOAT||LA102_0==INT||LA102_0==LONG||LA102_0==SHORT) ) {
						alt102=1;
					}
					else if ( (LA102_0==GENERIC_TYPE_ARG_LIST||LA102_0==QUALIFIED_TYPE_IDENT) ) {
						alt102=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 102, 0, input);
						throw nvae;
					}

					switch (alt102) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:507:17: primitiveType newArrayConstruction
							{
							pushFollow(FOLLOW_primitiveType_in_newExpression3938);
							primitiveType();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_newArrayConstruction_in_newExpression3940);
							newArrayConstruction();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:508:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
							{
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:508:17: ( genericTypeArgumentList )?
							int alt101=2;
							int LA101_0 = input.LA(1);
							if ( (LA101_0==GENERIC_TYPE_ARG_LIST) ) {
								alt101=1;
							}
							switch (alt101) {
								case 1 :
									// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:508:17: genericTypeArgumentList
									{
									pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression3958);
									genericTypeArgumentList();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression3961);
							qualifiedTypeIdent();
							state._fsp--;
							if (state.failed) return;
							pushFollow(FOLLOW_newArrayConstruction_in_newExpression3963);
							newArrayConstruction();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:511:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
					{
					match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression3998); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:511:34: ( genericTypeArgumentList )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:511:34: genericTypeArgumentList
							{
							pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4000);
							genericTypeArgumentList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4003);
					qualifiedTypeIdent();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_newExpression4005);
					arguments();
					state._fsp--;
					if (state.failed) return;
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:511:88: ( classTopLevelScope )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==CLASS_TOP_LEVEL_SCOPE) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:511:88: classTopLevelScope
							{
							pushFollow(FOLLOW_classTopLevelScope_in_newExpression4007);
							classTopLevelScope();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, newExpression_StartIndex); }

		}
	}
	// $ANTLR end "newExpression"



	// $ANTLR start "innerNewExpression"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:514:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
	public final void innerNewExpression() throws RecognitionException {
		int innerNewExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:515:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:515:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
			{
			match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4030); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:515:34: ( genericTypeArgumentList )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==GENERIC_TYPE_ARG_LIST) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:515:34: genericTypeArgumentList
					{
					pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4032);
					genericTypeArgumentList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4035); if (state.failed) return;
			pushFollow(FOLLOW_arguments_in_innerNewExpression4037);
			arguments();
			state._fsp--;
			if (state.failed) return;
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:515:75: ( classTopLevelScope )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==CLASS_TOP_LEVEL_SCOPE) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:515:75: classTopLevelScope
					{
					pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4039);
					classTopLevelScope();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, innerNewExpression_StartIndex); }

		}
	}
	// $ANTLR end "innerNewExpression"



	// $ANTLR start "newArrayConstruction"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:518:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
	public final void newArrayConstruction() throws RecognitionException {
		int newArrayConstruction_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:519:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==ARRAY_DECLARATOR_LIST) ) {
				alt110=1;
			}
			else if ( (LA110_0==EXPR) ) {
				alt110=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:519:9: arrayDeclaratorList arrayInitializer
					{
					pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4064);
					arrayDeclaratorList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4066);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:520:9: ( expression )+ ( arrayDeclaratorList )?
					{
					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:520:9: ( expression )+
					int cnt108=0;
					loop108:
					while (true) {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==EXPR) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:520:9: expression
							{
							pushFollow(FOLLOW_expression_in_newArrayConstruction4076);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt108 >= 1 ) break loop108;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(108, input);
							throw eee;
						}
						cnt108++;
					}

					// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:520:21: ( arrayDeclaratorList )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==ARRAY_DECLARATOR_LIST) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:520:21: arrayDeclaratorList
							{
							pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4079);
							arrayDeclaratorList();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, newArrayConstruction_StartIndex); }

		}
	}
	// $ANTLR end "newArrayConstruction"



	// $ANTLR start "arguments"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:523:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:524:5: ( ^( ARGUMENT_LIST ( expression )* ) )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:524:9: ^( ARGUMENT_LIST ( expression )* )
			{
			match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4100); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:524:25: ( expression )*
				loop111:
				while (true) {
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==EXPR) ) {
						alt111=1;
					}

					switch (alt111) {
					case 1 :
						// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:524:25: expression
						{
						pushFollow(FOLLOW_expression_in_arguments4102);
						expression();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop111;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"



	// $ANTLR start "literal"
	// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:527:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
	public final void literal() throws RecognitionException {
		int literal_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return; }

			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:528:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
			// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:
			{
			if ( input.LA(1)==CHARACTER_LITERAL||input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FALSE||input.LA(1)==FLOATING_POINT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==NULL||input.LA(1)==OCTAL_LITERAL||input.LA(1)==STRING_LITERAL||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, literal_StartIndex); }

		}
	}
	// $ANTLR end "literal"

	// $ANTLR start synpred125_JavaTreeParser
	public final void synpred125_JavaTreeParser_fragment() throws RecognitionException {
		// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:35: ( switchCaseLabel )
		// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:392:35: switchCaseLabel
		{
		pushFollow(FOLLOW_switchCaseLabel_in_synpred125_JavaTreeParser2570);
		switchCaseLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred125_JavaTreeParser

	// $ANTLR start synpred132_JavaTreeParser
	public final void synpred132_JavaTreeParser_fragment() throws RecognitionException {
		// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: ( ( expression )* )
		// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: ( expression )*
		{
		// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: ( expression )*
		loop142:
		while (true) {
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==EXPR) ) {
				alt142=1;
			}

			switch (alt142) {
			case 1 :
				// /Users/snehakamath/Documents/workspaceantlr/UML_Parser/src/JavaTreeParser.g:404:48: expression
				{
				pushFollow(FOLLOW_expression_in_synpred132_JavaTreeParser2671);
				expression();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop142;
			}
		}

		}

	}
	// $ANTLR end synpred132_JavaTreeParser

	// Delegated rules

	public final boolean synpred132_JavaTreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred132_JavaTreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred125_JavaTreeParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred125_JavaTreeParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource90 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationList_in_javaSource92 = new BitSet(new long[]{0x0100000800400008L,0x8000000084000000L});
	public static final BitSet FOLLOW_packageDeclaration_in_javaSource94 = new BitSet(new long[]{0x0100000800400008L,0x0000000084000000L});
	public static final BitSet FOLLOW_importDeclaration_in_javaSource97 = new BitSet(new long[]{0x0100000800400008L,0x0000000084000000L});
	public static final BitSet FOLLOW_typeDeclaration_in_javaSource100 = new BitSet(new long[]{0x0100000800400008L,0x0000000080000000L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration123 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IMPORT_in_importDeclaration150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATIC_in_importDeclaration152 = new BitSet(new long[]{0x0008000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration155 = new BitSet(new long[]{0x0010000000000008L});
	public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_in_typeDeclaration183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_typeDeclaration185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_typeDeclaration187 = new BitSet(new long[]{0x0000008000000000L,0x0000000002020001L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration189 = new BitSet(new long[]{0x0000008000000000L,0x0000000002000001L});
	public static final BitSet FOLLOW_extendsClause_in_typeDeclaration192 = new BitSet(new long[]{0x0000008000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_implementsClause_in_typeDeclaration195 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration198 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_typeDeclaration212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_typeDeclaration214 = new BitSet(new long[]{0x0000000000000000L,0x0000000100020001L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration216 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000001L});
	public static final BitSet FOLLOW_extendsClause_in_typeDeclaration219 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ENUM_in_typeDeclaration234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_typeDeclaration236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_typeDeclaration238 = new BitSet(new long[]{0x0200000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_implementsClause_in_typeDeclaration240 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_in_typeDeclaration255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_typeDeclaration257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_typeDeclaration259 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause297 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_extendsClause299 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_implementsClause330 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList362 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_genericTypeParameter383 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bound_in_genericTypeParameter385 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_bound417 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope440 = new BitSet(new long[]{0x0000008000000008L,0x0000000000400000L});
	public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope443 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENT_in_enumConstant469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationList_in_enumConstant471 = new BitSet(new long[]{0x0000008000008008L});
	public static final BitSet FOLLOW_arguments_in_enumConstant473 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope507 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope509 = new BitSet(new long[]{0x0100086800400008L,0x0000000080008000L,0x0002200000000000L});
	public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations551 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000020000000000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_classScopeDeclarations570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations574 = new BitSet(new long[]{0x0000000002020008L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_classScopeDeclarations576 = new BitSet(new long[]{0x0000000002000008L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations579 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations582 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations604 = new BitSet(new long[]{0x0000000002000008L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations606 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations609 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_classScopeDeclarations626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations628 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations647 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations649 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_block_in_classScopeDeclarations652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope689 = new BitSet(new long[]{0x0100000800400008L,0x0000000080008000L,0x0002200000000000L});
	public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations715 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000020000000000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations726 = new BitSet(new long[]{0x0000000000020008L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations728 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations744 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000420000L});
	public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations753 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations755 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations846 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations852 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList885 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator909 = new BitSet(new long[]{0x2000000000080008L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId937 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId939 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1013 = new BitSet(new long[]{0x0000000000010008L});
	public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1043 = new BitSet(new long[]{0x2000000000080008L});
	public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1065 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1067 = new BitSet(new long[]{0x0008000000000008L,0x0000000000400000L});
	public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifier_in_modifierList1091 = new BitSet(new long[]{0x0000000000400018L,0x0040000000000004L,0x0004004105000380L});
	public static final BitSet FOLLOW_PUBLIC_in_modifier1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_modifier1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_modifier1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_modifier1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_modifier1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIVE_in_modifier1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSIENT_in_modifier1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_modifier1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTFP_in_modifier1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localModifier_in_modifier1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_localModifier_in_localModifierList1234 = new BitSet(new long[]{0x0000000000400008L,0x0000000000000004L});
	public static final BitSet FOLLOW_FINAL_in_localModifier1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_localModifier1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type1285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primitiveType_in_type1288 = new BitSet(new long[]{0x0000000000020008L});
	public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1292 = new BitSet(new long[]{0x0000000000020008L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_type1295 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1317 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1319 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_typeIdent1342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1344 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1455 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1457 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000020000000800L});
	public static final BitSet FOLLOW_type_in_genericTypeArgument1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1495 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_genericWildcardBoundType1637 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_genericWildcardBoundType1651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1674 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000600L});
	public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1735 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1741 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotation_in_annotationList1809 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_AT_in_annotation1831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation1833 = new BitSet(new long[]{0x0000000000000108L});
	public static final BitSet FOLLOW_annotationInit_in_annotation1835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationInitializers_in_annotationInit1863 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1884 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers1886 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
	public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers1901 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENT_in_annotationInitializer1926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer1928 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1953 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue1955 = new BitSet(new long[]{0x2000000000400088L});
	public static final BitSet FOLLOW_annotation_in_annotationElementValue1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_annotationElementValue1977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2001 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2003 = new BitSet(new long[]{0x0100000800401008L,0x0000000080000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2035 = new BitSet(new long[]{0x0000800000000008L});
	public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2056 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2091 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2093 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_blockStatement_in_block2118 = new BitSet(new long[]{0x210410080A500008L,0x0000001080801080L,0x0008210940014000L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement2163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_statement2226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement2237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement2239 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_expression_in_statement2241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_statement2254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement2256 = new BitSet(new long[]{0x200410000A100000L,0x0000001000801080L,0x0008010940014000L});
	public static final BitSet FOLLOW_statement_in_statement2258 = new BitSet(new long[]{0x200410000A100008L,0x0000001000801080L,0x0008010940014000L});
	public static final BitSet FOLLOW_statement_in_statement2260 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_in_statement2273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forInit_in_statement2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_forCondition_in_statement2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_forUpdater_in_statement2279 = new BitSet(new long[]{0x200410000A100000L,0x0000001000801080L,0x0008010940014000L});
	public static final BitSet FOLLOW_statement_in_statement2281 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_EACH_in_statement2293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_localModifierList_in_statement2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_statement2297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_statement2299 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_expression_in_statement2301 = new BitSet(new long[]{0x200410000A100000L,0x0000001000801080L,0x0008010940014000L});
	public static final BitSet FOLLOW_statement_in_statement2303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_in_statement2316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement2318 = new BitSet(new long[]{0x200410000A100000L,0x0000001000801080L,0x0008010940014000L});
	public static final BitSet FOLLOW_statement_in_statement2320 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_statement2332 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statement2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement2336 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRY_in_statement2348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_statement2350 = new BitSet(new long[]{0x0000000102000008L});
	public static final BitSet FOLLOW_catches_in_statement2352 = new BitSet(new long[]{0x0000000002000008L});
	public static final BitSet FOLLOW_block_in_statement2355 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWITCH_in_statement2370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_switchBlockLabels_in_statement2374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_statement2388 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_block_in_statement2390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_in_statement2402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement2404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THROW_in_statement2417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_statement2419 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BREAK_in_statement2431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement2433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONTINUE_in_statement2446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement2448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_statement2463 = new BitSet(new long[]{0x200410000A100000L,0x0000001000801080L,0x0008010940014000L});
	public static final BitSet FOLLOW_statement_in_statement2465 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_statement2476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_statement2486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_catchClause_in_catches2517 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_CATCH_in_catchClause2543 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2545 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_block_in_catchClause2547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2568 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2570 = new BitSet(new long[]{0x0000800020000008L});
	public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2573 = new BitSet(new long[]{0x0000000020000008L});
	public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2576 = new BitSet(new long[]{0x0000000020000008L});
	public static final BitSet FOLLOW_CASE_in_switchCaseLabel2606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_switchCaseLabel2608 = new BitSet(new long[]{0x210410080A500008L,0x0000001080801080L,0x0008210940014000L});
	public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2610 = new BitSet(new long[]{0x210410080A500008L,0x0000001080801080L,0x0008210940014000L});
	public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2638 = new BitSet(new long[]{0x210410080A500008L,0x0000001080801080L,0x0008210940014000L});
	public static final BitSet FOLLOW_FOR_INIT_in_forInit2664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_forInit2671 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forCondition2701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forUpdater2729 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2757 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_parenthesizedExpression2759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_in_expression2784 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expression2786 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_expr2807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2809 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr2823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2825 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr2839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2841 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAR_ASSIGN_in_expr2855 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2857 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2859 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_ASSIGN_in_expr2871 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2873 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_ASSIGN_in_expr2887 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2889 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_ASSIGN_in_expr2903 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2905 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2907 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_XOR_ASSIGN_in_expr2919 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2921 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2923 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_ASSIGN_in_expr2935 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2937 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2939 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr2951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2953 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2955 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr2967 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2969 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2971 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr2983 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2985 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr2987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUESTION_in_expr2999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3001 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3003 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3005 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_OR_in_expr3017 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3019 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3021 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_AND_in_expr3033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3035 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr3049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3051 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_XOR_in_expr3065 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3067 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3069 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_expr3081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3083 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3085 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUAL_in_expr3097 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3099 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3101 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_EQUAL_in_expr3113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3115 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3117 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSTANCEOF_in_expr3129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_type_in_expr3133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3147 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3163 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3165 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3179 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3181 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3195 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATER_THAN_in_expr3209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3211 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3227 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESS_THAN_in_expr3241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3243 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3245 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr3257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3259 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr3273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3275 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAR_in_expr3289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3291 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr3305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3307 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_expr3321 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3323 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_expr3337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_expr3351 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRE_INC_in_expr3365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRE_DEC_in_expr3379 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POST_INC_in_expr3393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3395 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POST_DEC_in_expr3407 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr3421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr3437 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CAST_EXPR_in_expr3449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_expr3451 = new BitSet(new long[]{0x040B401441A50060L,0x772F3980106C0022L,0x00600C863ADE087FL});
	public static final BitSet FOLLOW_expr_in_expr3453 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primaryExpression_in_expr3464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_primaryExpression3490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3508 = new BitSet(new long[]{0x0000001800000000L,0x0000000000400000L,0x0000000210000000L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression3530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THIS_in_primaryExpression3552 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUPER_in_primaryExpression3574 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3596 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_in_primaryExpression3618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveType_in_primaryExpression3654 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CLASS_in_primaryExpression3656 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VOID_in_primaryExpression3674 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CLASS_in_primaryExpression3676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression3710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_primaryExpression3720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression3731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3733 = new BitSet(new long[]{0x0000000000008000L,0x0000000000010000L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression3735 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_arguments_in_primaryExpression3738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression3749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3762 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_expression_in_primaryExpression3764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_literal_in_primaryExpression3775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newExpression_in_primaryExpression3785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primaryExpression3795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_primaryExpression3815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall3839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3841 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorCall3844 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall3856 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall3858 = new BitSet(new long[]{0x0000000000008000L,0x0000000000010000L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3861 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorCall3864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator3885 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator3888 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator3892 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator3896 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression3920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primitiveType_in_newExpression3938 = new BitSet(new long[]{0x2000000000020000L});
	public static final BitSet FOLLOW_newArrayConstruction_in_newExpression3940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression3958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression3961 = new BitSet(new long[]{0x2000000000020000L});
	public static final BitSet FOLLOW_newArrayConstruction_in_newExpression3963 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression3998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4003 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_arguments_in_newExpression4005 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4030 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IDENT_in_innerNewExpression4035 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_arguments_in_innerNewExpression4037 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4039 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4064 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_newArrayConstruction4076 = new BitSet(new long[]{0x2000000000020002L});
	public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arguments4102 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_switchCaseLabel_in_synpred125_JavaTreeParser2570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred132_JavaTreeParser2671 = new BitSet(new long[]{0x2000000000000002L});
}
