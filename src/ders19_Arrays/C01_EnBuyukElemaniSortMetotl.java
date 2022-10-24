package ders19_Arrays;

import java.util.Arrays;

public class C01_EnBuyukElemaniSortMetotl {
    public static void main(String[] args) {
        //Arrays.sort() metodu arrayi buyukten kucuge siralar


        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun
        int[] arr={3,8,1,5,2,9,20,0};
        enKucukBuyuk(arr);

    }public static void enKucukBuyuk( int[] arr){
        Arrays.sort(arr);//bu metot tum erey elemanlarini kucukten buyuge siralar
        int enbuyuk=arr[arr.length-1];
        int enkucuk=arr[0];
        System.out.println(enkucuk+" \n"+enbuyuk);

    }
}
