import java.awt.*;
import java.util.Random;

public class Penguin extends Birds {
    private String name;
    static int xmin = 300;
    static int xmax = -300;
    static int ymin = 300;
    static int ymax = -300;
    public Penguin(){
        //System.out.println("РЇ РїРёРЅРіРІРёРЅ");
        if(xin>xmax){
            xmax = xin+7;
        }
        if(xin<xmin){
            xmin = xin+7;
        }
        if(yin>ymax){
            ymax = yin+7;
        }
        if(yin<ymin){
            ymin = yin+7;
        }
        System.out.println("Привет я пингвин");
        color = Color.blue;
        size = 30;
        time();
    }
}