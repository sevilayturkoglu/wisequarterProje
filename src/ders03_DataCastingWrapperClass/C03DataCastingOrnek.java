package ders03_DataCastingWrapperClass;

import java.util.Scanner;

public class C03DataCastingOrnek {
    //kullanicidan bir tamsayi iste ,girilen sayi ne olursa olsun sonuc
    //-+128 arasi olsun
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        byte donusenSayi=(byte)girilenSayi;
        System.out.println("girilen sayi= "+girilenSayi +"  donusen sayi= "+donusenSayi);
    }
}
