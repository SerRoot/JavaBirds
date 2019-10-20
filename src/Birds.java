import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Date;
public abstract class Birds{
    public int width = 700;
    public int height = 700;
    public static int num=0;
    public  Birds(){
        num = num+1;
    }
    protected void time(){
        Date time = new Date();
        if (time.getHours() <= 12 && time.getHours() > 4) {
            System.out.println("Утро");
        }
        else if (time.getHours() > 13 && time.getHours() <= 17){
            System.out.println("День");
        }
        else if (time.getHours() > 18 && time.getHours() <= 22){
            System.out.println("Ночь");
        }
        else  {
            System.out.println("Вечер");
        }
    }
    Random random = new Random();
    protected int x = (random.nextInt(width-45)) - (width/2-8);
    protected int y = (random.nextInt(height-68)) - (height/2-30);
    protected int size = 30;
    protected Color color = Color.black;
    protected int xin = x+10;
    protected int yin = y+10;
    protected int sizein = 10;
    protected Color colorin = Color.black;

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);
        g.setColor(colorin);
        g.fillOval(xin,yin,sizein,sizein);
    }
}