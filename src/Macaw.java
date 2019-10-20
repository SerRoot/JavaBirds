import java.awt.*;
import java.util.Random;
public class Macaw extends Birds {
    private String name;
    static int xmin = 300;
    static int xmax = -300;
    static int ymin = 300;
    static int ymax = -300;

    public Macaw(){
        num = num+1;
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
        System.out.println("Привет я попугай");
        color = Color.green;
        colorin = Color.green;
        size = 30;
        time();
    }
}