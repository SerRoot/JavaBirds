import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private Flock f;
    int check = 0;
    Birds ttt = new Flock();
    public int width = ttt.width;
    public int height = ttt.height;

    public MyFrame(Flock birds) {

        this.f = birds;

        this.setSize(width, height);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ХААА");

    }
    @Override
    public void paint(Graphics g){
        check = check+1;
        if(check == 1) {
            f.draw(g);

        }
    }

}