package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayList_getMethod {
    public static void main(String[] args) {
        //get ArrayListin icinden index kullanarak eleman almak icin kullandigimiz methodtur
        List<String> liste=new ArrayList<>();
        liste.add("fatih");
        liste.add("levent");
        liste.add("esra");
        liste.add("seher");

        liste.get(2);//esra yi getirir

    }
}
