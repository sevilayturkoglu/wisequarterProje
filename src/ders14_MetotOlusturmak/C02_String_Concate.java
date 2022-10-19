package ders14_MetotOlusturmak;

public class C02_String_Concate {
    public static void main(String[] args) {
        //verilen iki stringi aralarinda bir bosluk ile concate birlestirip
        // main metoda donduren yeni bir string olustur
        String str="Java";
        String str2="cok guzeldir";
        System.out.println(birlestirmeMetodu(str, str2));//parametreyi metodun icinden aldik
        System.out.println(birlestirmeMetodu("Bu da", " gecer ya Hu"));//ayni metoda kendimiz parametre yazdik

    }public static String birlestirmeMetodu(String str,String str2){

        return str+" "+str2;
    }
}
