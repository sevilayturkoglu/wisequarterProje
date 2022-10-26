package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_indexOf {
    public static void main(String[] args) {
        int []ekle={1,2,3,4,3,2,5,7,6,4,9,5,7,8};
        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < ekle.length; i++) {
            sayilar.add(ekle[i] );

        }
        //indexOf bize adini yazdigimiz elemanin hangi indexte oldugunu verir.
        System.out.println(sayilar.indexOf(2));//sonuc 1  demekki bizim 2 nin bulundugu ilk index 1 mis
        System.out.println(sayilar.indexOf(5));//6
        System.out.println(sayilar.lastIndexOf(5));// 11     5 in bulundugu son index 11 mis
    }
}
