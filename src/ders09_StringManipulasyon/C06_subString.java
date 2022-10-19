package ders09_StringManipulasyon;

public class C06_subString {
    public static void main(String[] args) {

        //bu yontem ile indexini verdigimiz bir stringi metin icinden alabiliriz
        String str="Java ogren ,isi kap";
        System.out.println(str.length());//19
        System.out.println(str.charAt(str.length() - 1));// p son karakter
        System.out.println(str.charAt(18));//p son karakter
        System.out.println(str.substring(5));//5 .indexden baslayarak stringin geri kalanini yazar
        System.out.println(str.substring(0));//tum stringi yazdirir

        // ORNEKK  son karakteri string olarak kaydedin

      String str1="" +str.charAt(str.length()-1);//basa bos string getirerek char i string olarak kaydedebiliriz AMAAAA
        System.out.println(str1);// string p
       // asagidaki yontemler daha guzel cunki direk string aliyoruz

        String str3= str.substring(18);// bu yontemi yapmak icin once uzunlugunu bulmaliyiz ugrastirici
        System.out.println(str3);//string p

        String str2= str.substring(str.length()-1);// en iyi yontem bu ,son karakter ve sonrasini yazdir diyoruz
        // zaten sonrasi yok sadece son karakter string olaarak yazar
        System.out.println(str2);//string p


        //ORNEK Son indexteki karakteri upperCase olarak yazdir
        System.out.println(str.substring(str.length() - 1).toUpperCase());

         //ORNEKKK son uc harfi buyuk harg yazdir
        System.out.println(str.substring(str.length() - 3).toUpperCase());//KAP

    }
}
