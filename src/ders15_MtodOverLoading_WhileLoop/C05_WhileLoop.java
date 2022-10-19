package ders15_MtodOverLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplanmak uzere  sayilar alin
        sayilarin toplami 500 veya daha fazla olursa
        girilen sayi adedi ve toplamini yazdirip ,bu kadar yeter diyin
         */
        Scanner scan = new Scanner(System.in);
        double sayi = 0;
        double toplama = 0;
        int count = 0;
        while (toplama< 500) {
            System.out.println("toplama islemi yapilmak uzere sayilar girin,sayi toplami 500 u gecmesin");
            sayi = scan.nextDouble();
            toplama += sayi;
            count++;
            /*if (toplama > 500) {
                System.out.println("Girilen sayi adedi= " + count + "   toplam sonuc= " + toplama + "  toplam miktar 500 u asti bu kadar yeter");
                break;
            }*/

        }System.out.println("Girilen sayi adedi= " + count + "   toplam sonuc= " + toplama + "  toplam miktar 500 u asti bu kadar yeter");
    }
}