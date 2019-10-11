import javax.swing.*;
import java.awt.*;
public abstract class Birds {
    public static int num=0;
    public  Birds(){
        num = num+1;
        //System.out.println("РЇ РїС‚РёС†Р° РЅРѕРјРµСЂ "+num);
    }
    //public fly(){
    //  System.out.println("РЇ Р»РµС‡Сѓ");
    //}
    protected   static int x = 50;
    protected   static int y = 50;
    protected int size = 30;
    protected Color color = Color.black;
    protected   static int xin = 50;
    protected   static int yin = 50;
    protected int sizein = 10;
    protected Color colorin = Color.black;

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);
        y = y +20;
        g.setColor(colorin);
        g.fillOval(xin,yin,sizein,sizein);
        yin = yin+20;
    }
}