package ders09_StringManipulasyon;

public class C07_subString {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";
        //subStringin bir baska yontemi ile metinden basini ve sonunu belirledigimiz bolumu alabiliriz ,index nosuyla

        //ORNEK gun kelimesini alalim

        System.out.println(str.substring(5, 8));// gun yazar ,5. indexi alarak baslar ama 8. index dahil degildir
        //5.index inclusive 8.index exclusive dir


        //ORNEK gectikce yazdiralim
        System.out.println(str.substring(9, 17));//gectikce yazar

        String isim="hUseyIn";
        //ilk harfi buyuk geri kalan harfleri kucuk yazdirin
        isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        System.out.println(isim);//Huseyin yazar


        //ORNEKK sadece ucuncu indexteki harfi yazdirin
        System.out.println(isim.substring(3, 4));

        //ORNEKK sadece dorduncu indexteki ve son harfi  birlikte ve buyuk yazdirin
        System.out.println(isim.length());
        System.out.println(isim.substring(4, 5).toUpperCase() + isim.substring(isim.length() - 1).toUpperCase());
    }
}
