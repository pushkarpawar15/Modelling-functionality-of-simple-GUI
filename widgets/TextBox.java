package widgets;
import handlers.MouseWatcher;
import handlers.KeyboardWatcher;
public class TextBox extends Widget implements KeyboardWatcher,MouseWatcher
{
    public TextBox(int w,int h,int x_pos,int y_pos)
    {
        super(w, h);
        this.setPos(x_pos, y_pos);
    }
    public void onKbdEvent(char x) //Keypressed event 
    {
        int left=super.getX(),right=super.getX()+super.getWidth(),up=super.getHeight()+super.getY(),down=super.getY();
        if(left<=mx && mx<=right && down<=my && my<=up)
        {
            data = data + x;
            System.out.println(data);
        }
    }
    public void moveTo(int a,int b) //adjusts mouse pointer location
    {
        mx = a;
        my = b;
    }
    public void onClick(){}; //no click function for click on textbox

    private String data = "";
    private int mx,my;
}