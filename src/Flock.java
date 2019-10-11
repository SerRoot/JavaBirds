import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Flock extends Birds {
    int pengnum = 0;
    int macnum = 0;
    int vornum = 0;
    //Flock f1 = new Flock();
    private ArrayList<Birds> f = new ArrayList<>();


    public Flock() {
        int n = 1;
        while (n == 1 || n == 2 || n == 3) {
            Scanner l = new Scanner(System.in);
            n = l.nextInt();
            Random random = new Random();
            x = (random.nextInt(401))-200;
            xin = x+15;
            y = (random.nextInt(401))-200;
            yin = y+15;
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
        g.translate(200,200);
        g.drawLine(0, 200,0, -200);
        g.drawLine(200, 0,-200, 0);
        for (int i = 0; i < f.size(); i++) {
            geolocation(i);
            f.get(i).draw(g);
        }
    }
    public void geolocation(int i){
        for(int t =0; t<=i;t++) {
            if ((f.get(i).x)-15 > 15  || (f.get(i).x)-15 < 185 || (f.get(i).x)-30 > f.get(t).x || f.get(i).x < f.get(t).x || (f.get(i).y)-15 > 15  || (f.get(i).y)-15 < 185 || (f.get(i).y)-30 > f.get(t).y || f.get(i).y < f.get(t).y) {
                Random random = new Random();
                f.get(i).x = (random.nextInt(401))-200;
                xin = x+10;
                f.get(i).y = (random.nextInt(401))-200;
                yin = y+10;
            }
        }
    }
}



