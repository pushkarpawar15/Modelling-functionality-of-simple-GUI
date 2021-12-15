package widgets;
public class Label extends Widget
{
    public Label(int w,int h,int x_pos,int y_pos)
    {
        super(w, h);
        super.setPos(x_pos, y_pos);
        textData = "";
    }
    private String textData;
}