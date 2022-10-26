package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_kullaniciyaListOlusturtmak {
    public static void main(String[] args) {
        //Kullanicidan istedigi kadar isim alip
        // , Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun
        System.out.println(ListOlustur());
    }public static List<String>ListOlustur(){
        List<String>kullaniciList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String ob="";
        while(!(ob.equalsIgnoreCase("q"))){
            System.out.println("please enter your names,and for finish press q ");
            ob=sc.nextLine();
            if(!ob.equalsIgnoreCase("q")) {
                kullaniciList.add(ob);
            }
        }return kullaniciList;
    }
}
