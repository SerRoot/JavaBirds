import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Flock extends Birds {
   public int pengnum = 0;
   public int macnum = 0;
   public  int vornum = 0;
   public int mxmin = 400;
   public int mxmax = 0;
   public  int mymin = 400;
   public int mymax = 0;
   public  int vxmin = 400;
   public  int vxmax = 0;
   public int vymin = 400;
   public  int vymax = 0;
   public int pymin = 400;
   public int pymax = 0;
   public  int pxmin = 400;
   public  int pxmax = 0;

    //Flock f1 = new Flock();
    private ArrayList<Birds> f = new ArrayList<>();


    public Flock() {
        int n = 0;
        while (n == 0 || n == 1 || n == 2) {
            Scanner l = new Scanner(System.in);
            n = l.nextInt();
            Random random = new Random();
            x = (random.nextInt(401))-200;
            xin = x+15;
            y = (random.nextInt(401))-200;
            yin = y+15;
            if (n == 0) {
                f.add(new Macaw());
                macnum = macnum + 1;
                if(xin >=  mxmax){
                    mxmax = xin;
                }
                if(xin <=  mxmin){
                    mxmin = xin;
                }
                if(yin >=  mymax){
                    mymax = yin;
                }
                if(yin <=  mymin){
                    mymin = yin;
                }
            }
            if (n == 1) {
                f.add(new Penguin());
                pengnum = pengnum + 1;
                if(xin >=  pxmax){
                    pxmax = xin;
                }
                if(xin <=  pxmin){
                    pxmin = xin;
                }
                if(yin >=  pymax){
                    pymax = yin;
                }
                if(yin <=  pymin){
                    pymin = yin;
                }
            }
            if (n == 2) {
                f.add(new Vorobey());
                vornum = vornum + 1;
                if(xin >=  vxmax){
                    vxmax = xin;
                }
                if(xin <=  vxmin){
                    vxmin = xin;
                }
                if(yin >=  vymax){
                    vymax = yin;
                }
                if(yin <=  vymin){
                    vymin = yin;
                }
            }
        }
        if (pengnum > macnum && macnum != 0) {
            System.out.println("Попугаи улетают, пингвины сидят на ветке и обсуждают, как оттуда слезть");
        }
        if (pengnum < macnum && pengnum != 0) {
            System.out.println("Пингвины убегают, попугаи сидят на ветке и радуются жизни");
        }
        if (pengnum == macnum && pengnum != 0 && macnum != 0) {
            System.out.println("Пингвины начинают драться с попугаями");
            Random random = new Random();
            int fight = random.nextInt(2);
            if (fight == 0) {
                System.out.println("Пингвины побеждают, попугаи улетают");
            }
            if (fight == 1) {
                System.out.println("Попугаи побеждают, пингвины убегают");
            }
        }
        if (pengnum == 0 && macnum == 1) {
            System.out.println("Пингвинов нет, попугай в одиночестве сидит на ветке и поет песню Славы - Одиночество");
        }
        if (macnum == 0 && pengnum == 1) {
            System.out.println("Попугаев нет, пингвин сидит один одинешенек на ветке, не знает, как он туда забрался и поет Hello Darkness My old friend");
        }
        if (pengnum == 0 && macnum == 0) {
            System.out.println("В стае вообще никого нет");
        }
        if (pengnum == 0 && macnum > 1) {
            System.out.println("Пингвинов нет, попугаи  сидят на ветке");
        }
        if (macnum == 0 && pengnum > 1) {
            System.out.println("Попугаев нет, пингвины сидят на ветке и не понимают, как они туда залезли");
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
            color = color.green;
        g.drawLine(mxmin, mymin, mxmin, mymax);
        g.drawLine(mxmin, mymax, mxmax, mymax);
        g.drawLine(mxmax,mymax,mxmax,mymin);
        g.drawLine(mxmin, mymin, mxmax, mymin);
        color = color.blue;
        g.drawLine(pxmin, pymin, pxmin, pymax);
        g.drawLine(pxmin, pymax, pxmax, pymax);
        g.drawLine(pxmax,pymax,pxmax,pymin);
        g.drawLine(pxmin, pymin, pxmax, pymin);
        color = color.yellow;
        g.drawLine(vxmin, vymin, vxmin, vymax);
        g.drawLine(vxmin, vymax, vxmax, vymax);
        g.drawLine(vxmax,vymax,vxmax,vymin);
        g.drawLine(vxmin, vymin, vxmax, vymin);
    }
    public void geolocation(int i){
        for(int t =0; t<=i;t++) {
                if ((f.get(i).x)-15 > 15  || (f.get(i).x)-15 < 170 || (f.get(i).x)-30 > f.get(t).x || f.get(i).x < f.get(t).x || (f.get(i).y)-15 > 15  || (f.get(i).y)-15 < 170 || (f.get(i).y)-30 > f.get(t).y || f.get(i).y < f.get(t).y) {
                    Random random = new Random();
                    f.get(i).x = (random.nextInt(401))-180;
                    xin = x+10;
                    f.get(i).y = (random.nextInt(401))-180;
                    yin = y+10;
                }
        }
    }
}
