package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi giriniz");
        double ondalikS=scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");
        int tamS=scan.nextInt();

        System.out.println("sayilarin toplami:   "+ ondalikS+tamS);

        System.out.println("sayilarin carpimi:   "+ ondalikS*tamS);
    }
}
