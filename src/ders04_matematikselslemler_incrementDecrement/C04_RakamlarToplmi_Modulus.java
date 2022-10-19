package ders04_matematikselslemler_incrementDecrement;

import java.util.Scanner;

public class C04_RakamlarToplmi_Modulus {
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
     //   System.out.println("lutfen dort basamakli bir sayi giriniz");
     //   int sayi=scan.nextInt();

        //verilen dort basamakli bir sayinin rakamlarini toplama yapalim
        int input=1453;
        int rakamlarTop=0;
        int birlerBasamagi;
//*Not sayi dort basamakli oldugu icin islemi dort kez tekrar edecegiz

        //modulus kullanarak birler basamagini bulup al .% ye modulus denir ve modulus bize bolme isleminde kalani verir
        birlerBasamagi=input % 10;//3 alir

        //birler basamagindaki sayiyi toplama ekle 0+3
        rakamlarTop=rakamlarTop+birlerBasamagi;

        //birler basamagindan kurtul 1453/10=145
        input=input/10;


        birlerBasamagi=input%10;
        rakamlarTop=birlerBasamagi+rakamlarTop;
        input=input/10;

        birlerBasamagi=input%10;
        rakamlarTop=birlerBasamagi+rakamlarTop;
        input=input/10;

        birlerBasamagi=input%10;
        rakamlarTop=birlerBasamagi+rakamlarTop;
        input=input/10;


        System.out.println("Rakamlar Toplami  ="+rakamlarTop);
    }
}
