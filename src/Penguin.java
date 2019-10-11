import java.awt.*;
import java.util.Random;

public class Penguin extends Birds {
    private String name;
    public void random() {
        Random random = new Random();
        int i = random.nextInt(6);

        if (i == 0) {
            name = "Пинг";
        }
        if (i == 1) {
            name = "Понг";
        }
        if (i == 2) {
            name = "Фонарик";
        }
        if (i == 3) {
            name = "Биба";
        }
        if (i == 4) {
            name = "Боба";
        }
        if (i == 5) {
            name = "Гвинпин";
        }
    }
    public Penguin(){
        //System.out.println("Я пингвин");
        random();
        System.out.println("Приветствую, Меня зовут "+name+" и я пингвин");
        time();
        color = Color.blue;
        size = 30;
    }
    //@Override
   // public void fly(){
     //   System.out.println("Я не умею летать!");
    //}

}
