import java.awt.*;
import java.util.Random;
public class Macaw extends Birds {
    private String name;
    //public Macaw(){
    //   num = num+1;
    //  System.out.println("РЇ РїРѕРїСѓРіР°Р№ РЅРѕРјРµСЂ "+num);
    //}
    public void random(){
        Random random = new Random();
        int i = random.nextInt(6);

        if (i == 0){
            name = "РџС‹Р¶РёРє";
        }
        if (i == 1){
            name = "Р§РёР¶РёРє";
        }
        if (i == 2){
            name = "РџРµС‚СЏ";
        }
        if (i == 3){
            name = "РџСѓРїР°";
        }
        if (i == 4){
            name = "Р•РїРёСЃС‚Р°С„РёР№";
        }
        if (i == 5){
            name = "Р›СѓРїР°";
        }
    }
    public Macaw(){
        random();
        num = num+1;
        //System.out.println("РЇ РїРѕРїСѓРіР°Р№ РЅРѕРјРµСЂ "+num);
        System.out.println("Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, РњРµРЅСЏ Р·РѕРІСѓС‚ "+name+" Рё СЏ РїРѕРїСѓРіР°Р№");
        color = Color.green;
        size = 30;
    }
    //public void speak(){
    // System.out.println("РњРµРЅСЏ Р·РѕРІСѓС‚ "+this.name);
    //}
    //public void setName(String name){
    // this.name = name;
    //}
    //public String getName(){
    //return this.name;
    //}
    //public void dialog(Macaw name) {
    // System.out.println("РџСЂРёРІРµС‚, " + name.getName());
    //}
    // public void answer( name){
    //    System.out.print("Р—РґСЂР°РІСЃС‚РІСѓР№, "+name.getName());
    //  System.out.print(", ");
    //}
    //  public void dialog(Penguin d){
    //   System.out.println("РќРµРЅР°РІРёР¶Сѓ РїРёРЅРіРІРёРЅРѕРІ");
    //}

}