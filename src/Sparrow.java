import java.awt.*;
public class Sparrow extends Birds {
    public Sparrow(){
        color = Color.red;
        size = 9;
        System.out.println("Приветствую, я воробей");
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size+20);
        y += 20;
        x += 20;
    }
}

