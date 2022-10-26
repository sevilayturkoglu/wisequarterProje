package ders21_ArrayList;

import ders18_Arrays.C06_KullanicininArrayOlusturmasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList_addMethod {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);//scanner clastan obje olusturduk
    C06_KullanicininArrayOlusturmasi obj=new C06_KullanicininArrayOlusturmasi();//C06 clasindan obje olusturduk
    int[]arr=new int[2];//array objesi olusturduk
    //bu objeleri olustururken iki tarafta da class adi yer aliyor.Scanner Scanner ,int int gibi
    //Ama arrayList objesi olustururken farkli yapilir.Cunki ArrayList interface dir


    List<Integer> sayilar=new ArrayList<>();

    //ARRAYLIST OZELLIKLERI;
    //1-primitive data kabul etmez
    //2-List bir interface oldugu icin direk obje olusturulmaz
    //3-onun yerine sag tarafa  ArrayList<>() yazilir
    //4-size belirtmek zorunda degiliz
    //5-dinamiktir yeniden boyutlandirilabilir

    //ArrayListe eleman eklemek soyle yapilir

        sayilar.add(4);
        sayilar.add(5);//
        System.out.println(sayilar);//[4, 5]
        System.out.println(sayilar.add(9));//cevap true doner.yani evet 9 ekledim diye
        System.out.println(sayilar);//[4, 5,9]
//araya index eklemek 1. indexe 2 ekleyelim
        sayilar.add(1,2);//java biz aksini soylemezsek normalde bunu sona ekler ama biz birinci indexe 2 ekle dedik
    //basa 16 ekle nasil yapilir
        sayilar.add(0,16);//eklemek istedigimiz yerin indexini ve eklemek istedigimiz sayiyi yazariz

    //adAll nasil yapilir
         List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(8);
        eklenecekListe.add(7);

        sayilar.addAll(eklenecekListe);//eklenecekler listesini sayilar listesine addAll kullanark ekledik
        System.out.println(sayilar);//[16, 4, 2, 5, 9, 8, 7]  yeni listemiz
        sayilar.addAll(1,eklenecekListe);//listemizi birinci indeks ve sonrasina tekrar ekledik
}
}