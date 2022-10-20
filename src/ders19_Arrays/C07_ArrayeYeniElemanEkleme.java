package ders19_Arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElemanEkleme {
    public static void main(String[] args) {
     //asagidaki arraye eleman olarak 8 ekleyelim bunu iki yontemle yapabiliriz
       int[]arr={2,4,6};

     //1-Manuel
     /*  int[]arr1={2,4,6,8};

       arr=arr1;
        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8]  yazar */

        //2-for loop

        int []arr2=new int[arr.length+1];
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0] henuz ici bos
        int eklenecekEleman=8;
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 0] arr arrayinin elemanlarini yeni arraye getirdik
        arr2[arr2.length-1]=eklenecekEleman;
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 8] 8 i yeni arreye ekledik

        arr=arr2;//yeni arrayi eski arraye deger olarak atadik
        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8] eski arrayi degismis olarak yazdirdik
    }
}
