package ders21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini  yazdiran list yap
        //fibonacci sayilari kendinden onceki iki sayinin toplamidir
        //or  0 1 1 2 3 5 8 13 21.....
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen fibonacci dizilimi icin bir sayi giriniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi == 1 || girilenSayi == 0 || girilenSayi < 0) {
            System.out.println("fibonacci sayisi 0 ,0 kucuk  veya 1 olmasin");

        } else {
            fibonacciSayilariniYazdir(girilenSayi);
        }
    }

    private static void fibonacciSayilariniYazdir(int girilenSayi) {
        List<Integer> fibonacciListesi = new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);

        int yeniFibonacci = 0;
//ben yaptim
        for (int i = 2; i < girilenSayi; i++) {//ilk iki indexi onceden elimizle girdik bu nedenle index 2 den basladi
            yeniFibonacci = fibonacciListesi.get(i - 1) + fibonacciListesi.get(i - 2);//son sayimizin bir onceki ve iki onceki indexini
            if (yeniFibonacci < girilenSayi) {                                                                // alip topladik yeni fibonacci sayisini elde ettik
                fibonacciListesi.add(yeniFibonacci);
            }
            if (yeniFibonacci >= girilenSayi) {
                break;

            }
        }
        System.out.println(fibonacciListesi);
    }

}