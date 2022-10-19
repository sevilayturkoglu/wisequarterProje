package ders04_matematikselslemler_incrementDecrement;

import java.util.Scanner;

public class C02_DataCastingOrnek {
    //kullanicidan iki sayi iste ,sayilari birbirine bol
    // sonucun sadece tamsayi kismini yazdir
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double say1= scan.nextDouble();
        double say2=scan.nextDouble();
        //System.out.println(say1 / say2);//sayilardan en az biri double oldugu icin sonuc tam sayi cikmaz virgullu cikar
        int istenilenSayi=(int)(say1/say2);//sayilari int e casting explicit narrowing yaptik sonuc sadece tamsayi cikar
        System.out.println(istenilenSayi);
    }

}
