import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Flock extends Birds {
    int pengnum = 0;
    int macnum = 0;
    int vornum = 0;
    private ArrayList<Birds> f = new ArrayList<>();

    public Flock() {
        int n = 1;
        while (n == 1 || n == 2 || n == 3) {
            Scanner l = new Scanner(System.in);
            n = l.nextInt();
            if (n == 1) {
                f.add(new Macaw());
                macnum = macnum + 1;
            }
            if (n == 2) {
                f.add(new Penguin());
                pengnum = pengnum + 1;
            }
            if (n == 3) {
                f.add(new Vorobey());
                vornum = vornum + 1;

            }
        }
    }
    public void draw(Graphics g) {
        //g.clearRect(0 0);
        g.translate(width/2,height/2);
        g.drawLine(0, width/2,0, -(width/2));
        g.drawLine(height/2, 0,-height/2, 0);
        for (int i = 0; i < f.size(); i++) {
            geolocation(i);
            f.get(i).draw(g);
            System.out.println(f.get(i).xin + " " + f.get(i).yin);
        }
        g.setColor(Color.green);
        squaredraw(Macaw.xmin, Macaw.ymin, Macaw.xmax, Macaw.ymax, g);
        g.setColor(Color.blue);
        squaredraw(Penguin.xmin, Penguin.ymin, Penguin.xmax, Penguin.ymax, g);
        g.setColor(Color.yellow);
        squaredraw(Vorobey.xmin, Vorobey.ymin, Vorobey.xmax, Vorobey.ymax, g);
    }
    public void geolocation(int i){
        for(int t =0; t<i;t++) {
            if (f.get(i).x == f.get(t).x  &&  f.get(i).y == f.get(t).y ) {
                Random random = new Random();
                f.get(i).x = (random.nextInt(width-45)) - (width/2-8);
                f.get(i).xin = f.get(i).x + 10;
                f.get(i).y = (random.nextInt(height-68)) - (height/2-30);
                f.get(i).yin = f.get(i).y + 10;
            }
        }
    }
    public void squaredraw(int xmin, int ymin, int xmax, int ymax, Graphics g){
        g.drawLine(xmin, ymin, xmin, ymax);
        g.drawLine(xmin, ymax, xmax, ymax);
        g.drawLine(xmax, ymax, xmax, ymin);
        g.drawLine(xmax, ymin, xmin, ymin);
    }
}