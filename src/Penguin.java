import java.awt.*;
import java.util.Random;

public class Penguin extends Birds {
    private String name;
    public void random() {
        Random random = new Random();
        int i = random.nextInt(6);

        if (i == 0) {
            name = "РџРёРЅРі";
        }
        if (i == 1) {
            name = "РџРѕРЅРі";
        }
        if (i == 2) {
            name = "Р¤РѕРЅР°СЂРёРє";
        }
        if (i == 3) {
            name = "Р‘РёР±Р°";
        }
        if (i == 4) {
            name = "Р‘РѕР±Р°";
        }
        if (i == 5) {
            name = "Р“РІРёРЅРїРёРЅ";
        }
    }
    public Penguin(){
        //System.out.println("РЇ РїРёРЅРіРІРёРЅ");
        random();
        System.out.println("РџСЂРёРІРµС‚СЃС‚РІСѓСЋ, РњРµРЅСЏ Р·РѕРІСѓС‚ "+name+" Рё СЏ РїРёРЅРіРІРёРЅ");
        color = Color.blue;
        size = 30;
    }
    //@Override
    // public void fly(){
    //   System.out.println("РЇ РЅРµ СѓРјРµСЋ Р»РµС‚Р°С‚СЊ!");
    //}

}