package widgets;
public class Widget 
{
    public Widget(int wd,int ht)
    {
        height = ht;
        width = wd;
    }
    public void setPos(int a,int b) //sets positions(x,y) of widgets;
    {
        x = a;
        y = b;
    }
    //get functions
    public int getX(){return x;}
    public int getY(){return y;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
     
    private int x,y,height,width;
}
