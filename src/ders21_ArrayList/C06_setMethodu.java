package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_setMethodu {
    public static void main(String[] args) {
        //javada set update icin kullanilir,
        // add ve set farklidir,add sadece var olana ekleme yaparken
        // ,set istenilen indexteki elemani siler yerine istenilen yenisini deger olarak atar
        int []ekle={1,2,3,4,3,2,5,7,6,4,9,7,8};
        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < ekle.length ; i++) {
            sayilar.add(ekle[i] );

        }
        sayilar.set(0,8);//0. indexte 1 i sildik 8 ekledik
        System.out.println(sayilar);//[8, 2, 3, 4, 3, 2, 5, 7, 6, 4, 9, 7, 8]
        int eskiDeger=sayilar.set(1,9);//burada 2 yi silip 9 yapmadan once eski deger olan 2 yi sakladik ,belki lazim olur
        System.out.println(eskiDeger);//2
        System.out.println(sayilar);//[8, 9, 3, 4, 3, 2, 5, 7, 6, 4, 9, 7, 8]



    }
}
