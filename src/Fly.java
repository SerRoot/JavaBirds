import java.util.ArrayList;

public class Fly {
    public static void main(String[] args) {
        //Macaw n1 = new Macaw();
        //Macaw n2 = new Macaw();
        //Birds vorobey = new Birds();
        //vorobey.fly();
        //Macaw b = new Macaw();
        //Macaw c = new Macaw("Петя");
        //b.speak();
        //c.speak();
        //c.setName("Клепа");
        //c.speak();
        //System.out.println(c.getName());
        //c.dialog(b);
        // c.speak();
        // b.answer(c);
        // b.speak();
        //Penguin d = new Penguin();
        //d.fly();
        //c.dialog(d);
        //Birds[] f = new Birds[3]; // номера ячеек 0 1 2
        //f[0] = new Macaw("Чижик");
        //f[1] = new Macaw("Пыжик");
        //f[2] = new Penguin();
        //for(int i = 0; i<f.length; i=i+1){
        //   f[i].fly();
        //}
        //ArrayList<Birds> f = new ArrayList<>();
        //f.add(new Macaw("Чижик"));
        //f.add(new Macaw("Пыжик"));
        //f.add(new Penguin());
        //for (int i = 0; i<f.size(); i = i+1 ){
        //   f.get(i).fly();
        //}
        Flock f1 = new Flock();
       MyFrame w = new MyFrame(f1);
        }
}