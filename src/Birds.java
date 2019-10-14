import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public abstract class Birds {
    public static int num=0;
    public  Birds(){
        num = num+1;
    }
    protected void time(){
        Date time = new Date();
        if (time.getHours() <= 16 && time.getHours() > 8){
            System.out.println("День");
        }
        else if (time.getHours() > 16 && time.getHours() <= 23){
            System.out.println("Вечер");
        }
        else  {
            System.out.println("ночь");
        }
    }
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

