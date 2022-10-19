package ders13_nestedForLoop_Methods;

import java.util.Scanner;

public class C06_MethodOlusturma {
    public static void main(String[] args) {
        /*
        kullanicidan iki sayi alip toplama metodu yapalim
         */
       isteToplaYazdir();//asagida ayni clasta main metot disinda yazdigimiz metodu ,main metotta adi ile cagirdik ve geldi calistirdik
        isteToplaYazdir();//ayni metodu kac kere cagirsak o kadar calisir
        //bu metodu baska bir class acip clas adi ile cagirabiliriz ,bir sonraki class ta cagiralim

    }
    public static void isteToplaYazdir(){//metotlar main metodun disinda olusturulur,main metotta cagirilir
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("isteToplaYazdir= "+(sayi1+sayi2));
    }
}
