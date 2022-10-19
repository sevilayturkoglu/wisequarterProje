package ders15_MtodOverLoading_WhileLoop;

import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi ve ussunu isteyip hesaplayip yazdiranbir metot olusturun
         */
        int sayi=5;
        int us=3;
        usHesaplama(sayi,us);

    }public static void usHesaplama(int sayi,int us){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi ve us giriniz");
        sayi= scan.nextInt();
        us=scan.nextInt();
        int sonuc=1;
        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}
