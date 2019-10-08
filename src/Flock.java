import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Flock extends Birds {
    int pengnum = 0;
    int macnum = 0;
    int sparrow = 0;

    //Flock f1 = new Flock();
    private ArrayList<Birds> f = new ArrayList<>();

    public Flock() {
        int n = 0;
        while (n == 0 || n == 1 || n == 3) {
            Scanner l = new Scanner(System.in);
            n = l.nextInt();
            if (n == 0) {
                f.add(new Macaw());
                macnum += 1;
            }
            if (n == 1) {
                f.add(new Penguin());
                pengnum += 1;
            }
            if (n == 3) {
                f.add(new Sparrow());
                sparrow += 1;
            }
        }
    }
        public void draw(Graphics g){
                for (int i = 0; i < f.size(); i=i+1) {
                    f.get(i).draw(g);
                    System.out.println("ХХАа");
                }
        }
}





