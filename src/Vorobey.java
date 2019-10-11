import java.awt.*;
import java.util.Random;

public class Vorobey extends Birds{
    private String name;
    public void random(){
        Random random = new Random();
        int i = random.nextInt(6);
        if  (i == 0){
            name = "Р’РѕСЂРѕР±РµР№";
        }
        if (i == 1){
            name = "Р’РѕСЂРѕР±РёРѕРЅ";
        }
        if (i == 2){
            name = "Р’РѕСЂРѕР±РёР»Р»Р°";
        }
        if (i == 3){
            name = "Р’РѕСЂР±РёР»";
        }
        if (i == 4){
            name = "Р’РѕСЂРѕР±СѓС€РµРє";
        }
        if (i == 5){
            name = "Р’РѕСЂСѓР±СѓС€РєРѕ";
        }
    }
    public Vorobey(){
        random();
        size = 30;
        color = color.yellow;
        System.out.println("РџСЂРёРІРµС‚, РњРµРЅСЏ Р·РѕРІСѓС‚ "+name+" Рё СЏ РІРѕСЂРѕР±РµР№");
    }
}