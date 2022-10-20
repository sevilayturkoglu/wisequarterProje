package ders19_Arrays;

import ders18_Arrays.C03_ArrayElemanlariniArttirma;
import ders18_Arrays.C04_ArraysElemanlariniToplama;
import ders18_Arrays.C05_ArraydeElemanAramak;
import ders18_Arrays.C06_KullanicininArrayOlusturmasi;

import java.util.Arrays;

public class C02_MethodKullanma {
    public static void main(String[] args) {
        //verilen arrayin elemanlarini 2 arttirin
        int[]arr={2,3,4};
       arr= C03_ArrayElemanlariniArttirma.ikiArttir(arr);//daha once C03 klasinda yaptigimiz metodu cagirdik
        System.out.println(Arrays.toString(arr));

        //array elemanlarini topla sonuc yazdir
        System.out.println(C04_ArraysElemanlariniToplama.topllaaa(arr));//metot cagirdik

       //array icinde 10 var mi
        C05_ArraydeElemanAramak.arananElement(arr,4);

        //kullanicidan array olusturmasini iste
       int[]yeniArray= C06_KullanicininArrayOlusturmasi.kendiArrayiniYap();
        System.out.println(Arrays.toString(yeniArray));

    }
}
