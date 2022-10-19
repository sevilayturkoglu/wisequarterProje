package ders04_matematikselslemler_incrementDecrement;

import java.util.Scanner;

public class C03_DataCastingOrnek {
    //kullanicidan iki int sayi alin birbirine bolup sayiyi double olarak yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz.");
        int say1= scan.nextInt();
        int say2= scan.nextInt();
      // System.out.println(say1 / say2);//sonuc narrowing tamsayi cikar 4 gibi yazar
      //  double istenilenSayi=say1/say2;
      // System.out.println(istenilenSayi);//sonuc daraltilmis virgullu cikar olsa bile kusurat yazmaz 4.0
       // double istenilenSayi=(double) (say1/say2);//yine kusurat yazmaz 4.0 gibi yazar
        // cunki once parantez icini yaptigi icin sayilar int kabul eder en son double cevirir,
        // oysa en az bir sayinin double olmasi gerekir double sonuc icin.
        double istenilenSayi=(double)say1/say2;//burada say1 double oldugu icin sonuc tam double cikar cunki Java buyuk degere gore hareket eder

        System.out.println(istenilenSayi);


    }
}
