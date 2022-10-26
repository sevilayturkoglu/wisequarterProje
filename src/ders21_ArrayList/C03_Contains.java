package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Contains {
    public static void main(String[] args) {

        //Contains metodu listin icinde aradigimiz seyin var olup olmadigina bakar
        List<Integer> sayilar=new ArrayList<>();
        int []ekle={1,2,3,4,3,7,2,5,7,6,4,9,7,8};

        for (int i = 0; i < ekle.length; i++) {

            sayilar.add(ekle[i]);


        }

        System.out.println(sayilar.contains(3));//true
        System.out.println(sayilar.contains(10));//false cunki 10 listin icinde yok
    }
}
