package ReviewSectionSoruCozum;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        /*
        kullanicidan bir tam sayi girmesini isteyin ,sonrada 1 den istenilen sayiya kadar olan sayilarin tam karelerinin toplamini
        hesaplayin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int toplam=0;
        int tamSayi=sc.nextInt();
        for (int i = 1; i <tamSayi ; i++) {
           int kare= i*i;
           toplam+=kare;
            System.out.println(kare+" ");
        }
        System.out.println(toplam);
    }
}
