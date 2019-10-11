import java.awt.*;
import java.util.Random;
public class Macaw extends Birds {
        private String name;
        //public Macaw(){
         //   num = num+1;
          //  System.out.println("Я попугай номер "+num);
        //}
        public void random(){
            Random random = new Random();
            int i = random.nextInt(6);

            if (i == 0){
                name = "Пыжик";
            }
            if (i == 1){
                name = "Чижик";
            }
            if (i == 2){
                name = "Петя";
            }
            if (i == 3){
                name = "Пупа";
            }
            if (i == 4){
                name = "Епистафий";
            }
            if (i == 5){
                name = "Лупа";
            }
        }
        public Macaw(){
            random();
            num = num+1;
            //System.out.println("Я попугай номер "+num);
            System.out.println("Добрый день, Меня зовут "+name+" и я попугай");
            time();
            color = Color.green;
            colorin = Color.green;
            size = 30;
        }
         //public void speak(){
           // System.out.println("Меня зовут "+this.name);
         //}
         //public void setName(String name){
           // this.name = name;
         //}
         //public String getName(){
            //return this.name;
         //}
         //public void dialog(Macaw name) {
            // System.out.println("Привет, " + name.getName());
         //}
            // public void answer( name){
             //    System.out.print("Здравствуй, "+name.getName());
               //  System.out.print(", ");
            //}
       //  public void dialog(Penguin d){
         //   System.out.println("Ненавижу пингвинов");
         //}

    }
