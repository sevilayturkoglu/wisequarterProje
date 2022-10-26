package ders22_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {
        //Arrays.asList metodu ile bir arrayi ArrayListe cevirebiliriz ,
        //Bu yeni listin uzunlugu esnek degildir
        // ayrica bu yeni Listte ArrayListin pek cok ozelligini kullanamayiz
        //.add ,.remove gibi ozellikler kullanilamaz
        //ayrica array de bir degisiklik yaparsak ArrayList de etkilenir degisir
        // ,bunun gibi nedenkerden dolayi tercih edilmez

        //   ORNEK
        Integer []arr={1,2,3};
        List<Integer>arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);//[1, 2, 3] yazar

       // arraydenList.add(3);//ekleme yapmak istersek
       // System.out.println(arraydenList); //run time error verir

        //arrayin bir elemanini degistirelim
        arr[0]=5;
        System.out.println(Arrays.toString(arr));//[5, 2, 3]
        System.out.println(arraydenList);//[5, 2, 3] listin de elemani degisti
    }
}
