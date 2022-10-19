package ders12_forLoop;

public class C03_sayininRakamlarToplami {
    public static void main(String[] args) {
        //ORNEK
        //kullanicinin verdigi sayinin rakamlar toplamini bulun
        int say=14531;
        String sayi=""+say;//sayimizi stringe atadik
        int rakTop=0;
        int basamak=0;
        for (int i = 0; i < sayi.length(); i++) {
            basamak=say%10;
            rakTop=rakTop+basamak;
            say=say/10;

            System.out.println(rakTop);
        }
        System.out.println(rakTop);


    }
}
