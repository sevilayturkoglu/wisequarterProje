package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_removeAll_equalsMethodlari {
    public static void main(String[] args) {

        //personel arrayListinden seher ve leventi removeAll ile nasil silerim
        //ayri bir arrayList yaparim ve bu yeni listeyi removeAll kullanarak silerim
        List<String> personel=new ArrayList<>();
        personel.add("fatih");
        personel.add("levent");
        personel.add("esra");
        personel.add("seher");

        List<String> silineceklerList=new ArrayList<>();
        silineceklerList.add("seher");
        silineceklerList.add("levent");

        personel.removeAll(silineceklerList);
        System.out.println(personel);//[fatih, esra]   seher ve levent silindi

            //equals
        //iki ArrayListin birbirine esit olup olmadigini kontrol eder

        System.out.println(personel.equals(silineceklerList));//false yazar cunki iki liste birbirinden farkli
    }
}
