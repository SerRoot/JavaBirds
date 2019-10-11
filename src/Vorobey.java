import java.awt.*;
import java.util.Random;

public class Vorobey extends Birds{
    private String name;
    public void random(){
        Random random = new Random();
        int i = random.nextInt(6);
        if  (i == 0){
            name = "Воробей";
        }
        if (i == 1){
            name = "Воробион";
        }
        if (i == 2){
            name = "Воробилла";
        }
        if (i == 3){
            name = "Ворбил";
        }
        if (i == 4){
            name = "Воробушек";
        }
        if (i == 5){
            name = "Ворубушко";
        }
    }
    public Vorobey(){
        random();
        size = 30;
        color = color.yellow;
        colorin = color.yellow;
        System.out.println("Привет, Меня зовут "+name+" и я воробей");
        time();
    }
}
