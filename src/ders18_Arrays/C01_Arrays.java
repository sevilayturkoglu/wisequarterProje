package ders18_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int []arr1={2,4,6,8,10};//arrayi liste seklinde yazabiliriz
        int[] kullaniciArayi=new int[3];//boyle array obje olusturup elemanlari elimizle de girebiliriz,lengtini mutlaka belirtmeliyiz
        kullaniciArayi[0]=1;
        kullaniciArayi[1]=2;
        kullaniciArayi[2]=3;
        System.out.println(Arrays.toString(kullaniciArayi));// 1 2 3 yazar

        System.out.println(arr1[3]);//arrayin ucuncu indexindeki 8 yazar
         //Arrayin 3.indexini degistirelim
        arr1[3] = 20;
        System.out.println(arr1[3] );//3.indesteki elemani degistirdik onceden 8 di simdi 20 yaptik

        //arrayin eleman sayisini bulalim
        System.out.println(arr1.length);//5 yazar icinde 5 eleman var

        //arrayin son indexindeki degeri alalim
        System.out.println(arr1[arr1.length - 1]);//son indexte bulunan 10 u yazar

        //Arrayin tum elemanlarini yazdiralim

        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] +" ");
        }

        //Bir arrayin uzunlugu length i sonradan degistirilemez
        //mesela ben 5.indexe atama yapabilir miyim ? hayir cunki son indeximiz 4
        //arr1[5] = 10;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //yazar hata verir
        //bu hata CTE error yani kod hatasi degil ,RunTime error yani calisirken ortaya cikan error dur
    }
}
