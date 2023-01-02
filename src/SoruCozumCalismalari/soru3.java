package SoruCozumCalismalari;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
       int sayi=sc.nextInt();
        System.out.println((byte)sayi);

    }
}
