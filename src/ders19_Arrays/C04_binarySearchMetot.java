package ders19_Arrays;

import java.util.Arrays;

public class C04_binarySearchMetot {
    public static void main(String[] args) {
        //binarySearch metodu array icinde aradigimiz elemanin yerini gosterir
        // ancak binarySearh kullanmadan once Sort metodu ile elemanlari siraya koymaliyiz
        // ,cunki siraya koymazsak binary sonucu yanlis verebilir ,
        // cunki binary eleman ararken  sayi dogrusu gibi dusunur ve elemanin yerini sayisal degerine gore tahmin eder

                     //ARRAYS.binarySearch() METODU
        //***********************************************
       int[]arr={1,3,9,4,2,10,1,8,5,10};//binary ile soralim
        int[]arr2={1,3,9,4,2,10,1,8,5,10};
        System.out.println(Arrays.binarySearch(arr, 5));//-8
        System.out.println(Arrays.binarySearch(arr, 1));//0
        System.out.println(Arrays.binarySearch(arr, 10));//-10
        System.out.println(Arrays.binarySearch(arr, 3));//-8  goruldugu gibi 1 haric hepsini yanlis bildi

        //simdi sort ile siralayip bakalim
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[1, 1, 2, 3, 4, 5, 8, 9, 10] yeni sira
        System.out.println(Arrays.binarySearch(arr, 5));//5
        System.out.println(Arrays.binarySearch(arr, 1));//1 iki tane 1 var ama binary ortadan saga ve sola bakar ilk gordugunu yazar
        System.out.println(Arrays.binarySearch(arr, 10));//8
        System.out.println(Arrays.binarySearch(arr, 3));//3  simdi hepsinin sirasini dogru bildi

                //ARRAYS.equals() METODU
        //*******************************
       // Arraylerin esit olup olmadigini anlamak icin Arrays.equals();metodu kullanilir,
        // ama sonucun true cikmasi icin eleman sayisi,eleman degeri ve elman siralamasinin ayni olmasi gerekir aksi durum false sonuc verir
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr, arr2));//true
    }
}
