
/**
 * Write a description of interface ITouchEventHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ITouchEventHandler
{

    public void touch(int x, int y);
    public void setNext( ITouchEventHandler next) ;
}
