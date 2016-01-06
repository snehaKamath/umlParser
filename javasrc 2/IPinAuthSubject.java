
public interface IPinAuthSubject
{

    public void registerObserver( IPinAuthObserver obj ) ;
    public void removeObserver( IPinAuthObserver obj ) ;
    public void notifyObserver( ) ;
    
}
