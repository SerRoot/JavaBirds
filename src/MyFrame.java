import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    int check;
    private Flock f;

    public MyFrame(Flock birds) {

        this.f = birds;

        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("я не знаю почему оно рисует в 2 раза болше птиц чем надо");

    }
    @Override
    public void paint(Graphics g){
        check = check+1;
        if (check == 1) {
            f.draw(g);
        }
 //g.setColor(new Color(123, 156, 0, 73));
 //g.drawLine(50, 50, 100, 100);
 //g.setColor(new Color(245, 44, 13));
 //g.fillOval(100, 100, 20, 20);

    }

}