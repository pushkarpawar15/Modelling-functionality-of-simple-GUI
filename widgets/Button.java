package widgets;
import handlers.MouseWatcher;
public class Button extends Widget implements MouseWatcher
{
    public Button(int w,int h,int x_pos,int y_pos)//constructor
    {
        super(w, h);
        super.setPos(x_pos, y_pos);
    }
    public void onClick() //check if click is on button and then prints point w.r.t button
    {
        int left=super.getX(),right=super.getX()+super.getWidth(),up=super.getHeight()+super.getY(),down=super.getY(),ansX =(mx-super.getX()),ansY=(my-super.getY());
        if(left<=mx && mx<=right && down<=my && my<=up) System.out.println("Selected point: "+ansX+" "+ansY);
    }
    public void moveTo(int a,int b) //adjusts mouse pointer location
    {
        mx = a;
        my = b;
    }
    private int mx,my;
}
