import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private Flock f;

    public MyFrame(Flock birds) {
        this.f = birds;

        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("СЏ РЅРµ Р·РЅР°СЋ РїРѕС‡РµРјСѓ РѕРЅРѕ СЂРёСЃСѓРµС‚ РІ 2 СЂР°Р·Р° Р±РѕР»С€Рµ РїС‚РёС† С‡РµРј РЅР°РґРѕ");

    }
    @Override
    public void paint(Graphics g){
            f.draw(g);

    }

}