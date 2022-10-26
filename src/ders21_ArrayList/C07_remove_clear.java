package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_remove_clear {
    public static void main(String[] args) {
        //verdigimiz indexteki elemani siler
        int []ekle={1,2,3,4,3,2,5,7,6,4,9,7,8,3};
        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < ekle.length ; i++) {
            sayilar.add(ekle[i] );

        }sayilar.remove(6);//altinci indexte bulunan ilk 5 silinir
        System.out.println(sayilar);//[1, 2, 4, 3, 2, 5, 7, 6, 4, 9, 7, 8,3]
        //ONEMLI;
        //listemiz eger integerlerden olusuyorsa,biz remove nin icine int bir deger yazdigimizda bunu index kabul eder
        // ve o indexteki elemani siler oysa soyle yaparsak adini soyledigimiz elemani siler;
        Integer silinecekObj=4;//silmek istedigimiz eleman olan 4 u Integere objeye attik
        sayilar.remove(silinecekObj);//obje adi vererek sil dedik,listemizdeki ilk 4 silindi.birden fazla dort varsa hepsini silmez
        System.out.println(sayilar);//[1, 2, 3, 2, 5, 7, 6, 4, 9, 7, 8,3]

        //tum 3 leri nasil silerim
      silinecekObj=3;
        sayilar.remove(silinecekObj);
        System.out.println(sayilar);//listede ki ilk 3 u siler,yani tum 3 ler silinmez  [1, 2, 3, 2, 7, 6, 4, 9, 7, 8, 3]

        while (sayilar.contains(silinecekObj)){  //[1, 2, 2, 7, 6, 4, 9, 7, 8] bu dongu tum ucleri siler
            sayilar.remove(silinecekObj);
        }
        System.out.println(sayilar);

        silinecekObj=10;
        sayilar.remove(silinecekObj);//liste degismez cunki listede 10 degeri yok
        System.out.println(sayilar);
        //sayilar.remove(20);
       // System.out.println(sayilar);//Java run time error verir cunki liste uzunlugumuz 20 index kadar degil


        //Clear,  list.clear dedigimizde tum liste silinir

        sayilar.clear();
        System.out.println(sayilar);// [] tum liste silindi
    }
}
