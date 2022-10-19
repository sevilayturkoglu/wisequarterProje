package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_ScannerSwap {
    public static void main(String[] args) {
        //sayilari swap deger atama degistirme yapacagiz interwiew de sorarlar
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen aralarina enter yaparak iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        int bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;

        System.out.println("sayi1 = "+sayi1);
        System.out.println("sayi2 = "+sayi2);

        ////Ornek bos value kullanmadan swap yapimi
        int s1=15;
        int s2=25;

        s1=s1+s2;
        s2=s1-s2;
        s1=s1-s2;
        System.out.println(s1 + s2);//degerleri toplar
        System.out.println("s1 = " + s1 + "  s2 = " + s2);//swap olmus degerleri yazar
        System.out.println("s1 = " + s1 + s2);//basta String oldugu icin degerleri toplamaz yan yana yazar cunki hepsini string kabul eder
    }
}
