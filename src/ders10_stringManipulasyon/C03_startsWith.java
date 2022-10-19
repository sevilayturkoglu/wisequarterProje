package ders10_stringManipulasyon;

public class C03_startsWith {
    public static void main(String[] args) {
        //metnin sorguladigimiz string ile baslayip baslamadigini soyler
        //ayrica stringimizin o index ile baslayip baslamadigini soyler
        String str="manti acarken java ogrenilmez";
        System.out.println(str.startsWith("manti"));//true
        System.out.println(str.startsWith("Manti"));//false
        System.out.println(str.startsWith("acarken"));//false
        System.out.println(str.startsWith("m"));//true
        str.startsWith("manti acarken java ogrenilmez");//true
        System.out.println(str.startsWith(""));//true
        System.out.println(str.startsWith("acarken", 6));//true burada acarken stringinin 6.indexten baslayip baslamadigini sordum
        str.startsWith("manti",0);//true cunku manti 0.indexten baslar
        System.out.println(str.startsWith("java", 10));//false cunki java 10 degil 14.indexten baslar
    }
}
