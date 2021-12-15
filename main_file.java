import handlers.KeyboardTracker;
import handlers.MouseTracker;
import java.util.*;
import widgets.*;
public class main_file {
    void control()
    {
        Panel panel = new Panel(600, 800);
        Button button = new Button(200, 100, 250, 100);
        Label label = new Label(200, 100, 50, 500);
        TextBox textbox = new TextBox(400, 200, 100, 300);
        MouseTracker mt = new MouseTracker();
        KeyboardTracker kt = new KeyboardTracker();
        kt.addKeyboardWatcher(textbox);
        mt.addMouseWatcher(button);
        mt.addMouseWatcher(textbox);
        Scanner in = new Scanner(System.in);
        //input loop
        while(true)
        {
            String ss = in.nextLine();
            if(Objects.equals(ss.charAt(0),'M') && Objects.equals(ss.charAt(4),'T'))
            {
                String [] s = new String[3];
                s = ss.split(" ");
                mt.processEvent(Integer.parseInt(s[1]),Integer.parseInt(s[2]),false);
            }
            else if(Objects.equals(ss.charAt(0), 'M'))
            {
                mt.processEvent(-1,-1,true);
            }
            else if(Objects.equals(ss.charAt(0), 'K'))
            {
                String [] s = new String[3];
                s = ss.split(" ");
                kt.processEvent(s[1].charAt(0));
            }
            else break;		
        }
    }
    public static void main(String[] args)
    {
        main_file M = new main_file();
        M.control();
    }
}