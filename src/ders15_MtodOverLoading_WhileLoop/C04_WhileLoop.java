package ders15_MtodOverLoading_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /*ORNEK Soru
        * kullanici toplama yapilmak uzere sayilar girsin
        * kullanici 0 girdigi zaman islem bitsin
        * kullanicinin kac sayi girdigini ve toplama isleminin sonucunu ekrana yazdirin
        * */
        double sayi=1;//bu sayi 0 olmamali cunki 0 loopu bitirir bu soruda
        double toplam=0;
        int count=0;

        Scanner scan=new Scanner(System.in);
        while(!(sayi==0)){//while(sayi!=0) seklinde de yazabilirdik
            System.out.println("Lutfen toplama yapilmak uzere sayilar giriniz \n girdiginiz sayi 0 olursa isleminiz bitecektir");
            sayi=scan.nextDouble();
            toplam+=sayi;
            count++;

           /* if(!(sayi==0)){//bu sekilde de yapabilirdik
           count++;
                toplam+=sayi;

            }*/
        }
        System.out.println("girdiginiz sayi adedi = " + count + "  " + "girdiginiz sayilarin toplami = " + toplam);

    }
}
