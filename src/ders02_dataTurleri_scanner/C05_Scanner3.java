package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz  "+"iki sayi arasinda entera basiniz");
       double sayi1=scan.nextDouble();
       double sayi2= scan.nextDouble();
        System.out.println("dikdortgenin alani : "+sayi1*sayi2);
    }
}
