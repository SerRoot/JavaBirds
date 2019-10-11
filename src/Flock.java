import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
public class Flock extends Birds {
    int pengnum = 0;
    int macnum = 0;
    int vornum = 0;
    //Flock f1 = new Flock();
    private ArrayList<Birds> f = new ArrayList<>();


    public Flock() {
        int n = 0;
        while (n == 0 || n == 1 || n == 2) {
            Scanner l = new Scanner(System.in);
            n = l.nextInt();
            Random random = new Random();
            x = (random.nextInt(401))-200;
            xin = x+15;
            y = (random.nextInt(401))-200;
            yin = y+15;
            if (n == 0) {
                f.add(new Macaw());
                macnum = macnum + 1;
            }
            if (n == 1) {
                f.add(new Penguin());
                pengnum = pengnum + 1;
            }
            if (n == 2) {
                f.add(new Vorobey());
                vornum = vornum + 1;
            }
        }
        if (pengnum > macnum && macnum != 0) {
            System.out.println("РџРѕРїСѓРіР°Рё СѓР»РµС‚Р°СЋС‚, РїРёРЅРіРІРёРЅС‹ СЃРёРґСЏС‚ РЅР° РІРµС‚РєРµ Рё РѕР±СЃСѓР¶РґР°СЋС‚, РєР°Рє РѕС‚С‚СѓРґР° СЃР»РµР·С‚СЊ");
        }
        if (pengnum < macnum && pengnum != 0) {
            System.out.println("РџРёРЅРіРІРёРЅС‹ СѓР±РµРіР°СЋС‚, РїРѕРїСѓРіР°Рё СЃРёРґСЏС‚ РЅР° РІРµС‚РєРµ Рё СЂР°РґСѓСЋС‚СЃСЏ Р¶РёР·РЅРё");
        }
        if (pengnum == macnum && pengnum != 0 && macnum != 0) {
            System.out.println("РџРёРЅРіРІРёРЅС‹ РЅР°С‡РёРЅР°СЋС‚ РґСЂР°С‚СЊСЃСЏ СЃ РїРѕРїСѓРіР°СЏРјРё");
            Random random = new Random();
            int fight = random.nextInt(2);
            if (fight == 0) {
                System.out.println("РџРёРЅРіРІРёРЅС‹ РїРѕР±РµР¶РґР°СЋС‚, РїРѕРїСѓРіР°Рё СѓР»РµС‚Р°СЋС‚");
            }
            if (fight == 1) {
                System.out.println("РџРѕРїСѓРіР°Рё РїРѕР±РµР¶РґР°СЋС‚, РїРёРЅРіРІРёРЅС‹ СѓР±РµРіР°СЋС‚");
            }
        }
        if (pengnum == 0 && macnum == 1) {
            System.out.println("РџРёРЅРіРІРёРЅРѕРІ РЅРµС‚, РїРѕРїСѓРіР°Р№ РІ РѕРґРёРЅРѕС‡РµСЃС‚РІРµ СЃРёРґРёС‚ РЅР° РІРµС‚РєРµ Рё РїРѕРµС‚ РїРµСЃРЅСЋ РЎР»Р°РІС‹ - РћРґРёРЅРѕС‡РµСЃС‚РІРѕ");
        }
        if (macnum == 0 && pengnum == 1) {
            System.out.println("РџРѕРїСѓРіР°РµРІ РЅРµС‚, РїРёРЅРіРІРёРЅ СЃРёРґРёС‚ РѕРґРёРЅ РѕРґРёРЅРµС€РµРЅРµРє РЅР° РІРµС‚РєРµ, РЅРµ Р·РЅР°РµС‚, РєР°Рє РѕРЅ С‚СѓРґР° Р·Р°Р±СЂР°Р»СЃСЏ Рё РїРѕРµС‚ Hello Darkness My old friend");
        }
        if (pengnum == 0 && macnum == 0) {
            System.out.println("Р’ СЃС‚Р°Рµ РІРѕРѕР±С‰Рµ РЅРёРєРѕРіРѕ РЅРµС‚");
        }
        if (pengnum == 0 && macnum > 1) {
            System.out.println("РџРёРЅРіРІРёРЅРѕРІ РЅРµС‚, РїРѕРїСѓРіР°Рё  СЃРёРґСЏС‚ РЅР° РІРµС‚РєРµ");
        }
        if (macnum == 0 && pengnum > 1) {
            System.out.println("РџРѕРїСѓРіР°РµРІ РЅРµС‚, РїРёРЅРіРІРёРЅС‹ СЃРёРґСЏС‚ РЅР° РІРµС‚РєРµ Рё РЅРµ РїРѕРЅРёРјР°СЋС‚, РєР°Рє РѕРЅРё С‚СѓРґР° Р·Р°Р»РµР·Р»Рё");
        }
    }
    public void draw(Graphics g) {
        g.translate(200,200);
        g.drawLine(0, 200,0, -200);
        g.drawLine(200, 0,-200, 0);
        for (int i = 0; i < f.size(); i++) {
            geolocation(i);
            f.get(i).draw(g);
        }
    }
    public void geolocation(int i){
        for(int t =0; t<=i;t++) {
            if ((f.get(i).x)-15 > 15  || (f.get(i).x)-15 < 185 || (f.get(i).x)-30 > f.get(t).x || f.get(i).x < f.get(t).x || (f.get(i).y)-15 > 15  || (f.get(i).y)-15 < 185 || (f.get(i).y)-30 > f.get(t).y || f.get(i).y < f.get(t).y) {
                Random random = new Random();
                f.get(i).x = (random.nextInt(401))-200;
                xin = x+10;
                f.get(i).y = (random.nextInt(401))-200;
                yin = y+10;
            }
        }
    }
}



