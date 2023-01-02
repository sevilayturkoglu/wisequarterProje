package ReviewSectionSoruCozum;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*kullanicidan isim ve soyisim girip hangisinin uzun oldugunu yazin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi girin");
        String ad=sc.next();
        String soyAd= sc.next();
        if(ad.length()>soyAd.length()){
            System.out.println("isminiz daha uzun");
        } else if (ad.length()<soyAd.length()) {
            System.out.println("soyadiniz daha uzun");

        }else{
            System.out.println("ad ve soyadiniz esit uzunlukta");
        }
    }
}
