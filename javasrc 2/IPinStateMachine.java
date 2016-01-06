

public interface IPinStateMachine
{
    public void backspace() ;
    public void number( String digit ) ;
    public void validPin() ;
    public void invalidPin() ;

    public void setStateNoPinDigits() ;
    public void setStateOnePinDigit( String digit ) ;
    public void setStateTwoPinDigits( String digit ) ;
    public void setStateThreePinDigits( String digit ) ;
    public void setStateFourPinDigits( String digit ) ;
}
