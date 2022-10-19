package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adinizi yaziniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyadinizi giriniz");
        String soyAd= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : "+soyAd);//bunlari tek satirda yazabilirdik aralarina ters slash n koyarak alt alta yazdirirdik
        System.out.println("Yasiniz : "+yas);//"isminiz : "+isim "/n soyisminiz :"+soyAd "/n yasiniz : " +yas
        System.out.println("Kaydiniz basariyla tamamlanmistir");
    }
}
