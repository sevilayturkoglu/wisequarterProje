package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //kullanicidan bir bilgi alip yazdirmak icin Scanner clas kullanmaliyiz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Kullanici Adini Giriniz");
        String kullaniciAdi= scan.nextLine();
        System.out.println(kullaniciAdi.toUpperCase());
    }
}
