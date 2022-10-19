package ders14_MetotOlusturmak;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {
        //kullanicidan iki sayi al,bu sayilari parametre kabul eden carpma yapip sonucu bize donduren metot yapin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        //metodu cagirarak islemler yapalim metodu cagirmazsak metot calismaz
        //metodu kac kere cagirirsak o kadar tekrar calisir biz simdi bu metodu uc kez cagirdik

        double yeni=carpimMetodu(4,3);
        System.out.println(yeni);
        System.out.println(carpimMetodu(sayi1, sayi2));//parametreyi scanner dan aldik
        System.out.println(carpimMetodu(5, 4));//parametreyi kendimiz yazdik ikisi de olur

    }public static double carpimMetodu(double sayi1,double sayi2){
        //double carp=sayi1*sayi2; boyle de olur
       /// return carp;
return sayi1*sayi2;//en kisa bu
    }
}
