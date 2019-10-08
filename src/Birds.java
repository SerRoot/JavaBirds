import javax.swing.*;
import java.awt.*;
public abstract class Birds {
    public static int num=0;
    public  Birds(){
       num = num+1;
        //System.out.println("Я птица номер "+num);
    }
    //public fly(){
      //  System.out.println("Я лечу");
    //}
    protected static int x ;
    protected static int y ;
    protected int size = 7;
    protected Color color = Color.black;
    public void draw(Graphics g){
       g.setColor(color);
       g.fillOval(x,y,size,size);
       y += 20;
       x += 20;
       g.drawLine(0,200,400,200);
       g.drawLine(200,0,200,400);

    }
}
