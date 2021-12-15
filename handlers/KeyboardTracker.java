package handlers;
import java.util.ArrayList;
public class KeyboardTracker
{
    public void addKeyboardWatcher(KeyboardWatcher k) //func to add widgets in registered widgets list
    {
        kws.add(k);
    }
    public void processEvent(char x)    //Keypress event
    {
        for(KeyboardWatcher k: kws)
        {
            k.onKbdEvent(x);
        }
    } 
    private ArrayList<KeyboardWatcher> kws = new ArrayList<KeyboardWatcher>(); //List to store registered widgets
}