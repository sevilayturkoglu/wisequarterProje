package ders09_StringManipulasyon;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3="ALI";
        String str4="Ali Can";

        System.out.println(str1.equals(str2));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true

        System.out.println(str2.equalsIgnoreCase(str3));//true

        //equalIgnoreCase kullanirsak Java buyuk -kucuk harf ayrimi yapmadan esitligi kontrol eder
       // yukarida son iki ornekte oldugu gibi yazilislar buyuklu kucuklu olmasina ragmen ignoreCase kullandigimiz icin esit dedi
//ama yazilarda farkli ekleme ve bosluklar olsa esit demezdi.yani sadece buyuk kucuk harf degisikligi ignore edilir
        System.out.println(str1.equalsIgnoreCase(str4));//false
    }
}
