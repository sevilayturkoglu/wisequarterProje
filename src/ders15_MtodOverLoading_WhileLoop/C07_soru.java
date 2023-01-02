package ders15_MtodOverLoading_WhileLoop;

import java.util.Scanner;

public class C07_soru {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi ve ussunu isteyip hesaplayip yazdiranbir metot olusturun
         */

        System.out.println(usHesaplama());

    }public static int usHesaplama(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayi ve us giriniz");
       int sayi= scan.nextInt();
       int us=scan.nextInt();
        int sonuc=1;
        while (us>0){
            sonuc*=sayi;
            us--;
        }
        return sonuc;
    }
}
