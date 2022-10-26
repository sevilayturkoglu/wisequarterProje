package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {
        //Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        //Kelimenin uzunlugu tek sayi ise ortadaki harf dahil
        // ikinci yarisini yeni bir listeye ekleyip yazdirin.
        String[] arr = {"Sumeyra","Mehmet","Ekrem","Yilmaz","Ayse"};
        List<String>isimler=new ArrayList<>();
        for (String each:arr) {
            if(each.length()%2==0){
                isimler.add(each.substring(0,each.length()/2));

            }else{
                isimler.add(each.substring(each.length()/2));
            }
        }
        System.out.println(isimler);
    }
}
