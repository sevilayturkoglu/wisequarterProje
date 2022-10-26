package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaHesapl {
    public static void main(String[] args) {
        // Ogretmenden ogrenci notlarini alip bir list olusturun // ogretmen 100 ustune basip bitirdiginde
        // / sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin
        List<Double> notlar= arrayListOlustur();
        raporla(notlar);

    }public static  void raporla(List<Double>notlar){
        double toplamNot=0;
        int ogreciSayisi= notlar.size();
        double sinifOrt=0;
        int ortUstuOgrenciSayisi=0;
        for (int i = 0; i < notlar.size() ; i++) {
            toplamNot+=notlar.get(i);

        }
        sinifOrt=toplamNot/ogreciSayisi;
        for (int i = 0; i < notlar.size() ; i++) {
        if(notlar.get(i)>sinifOrt){
            ortUstuOgrenciSayisi++;
        }
        }
        System.out.println(notlar);
        System.out.println("ogrenci sayisi ; "+ogreciSayisi+"\nsinif ortalamasi ; "+ sinifOrt+
                "\nortalama ustu ogrenci sayisi ; "+ortUstuOgrenciSayisi);

    } public static List<Double>arrayListOlustur(){
        Scanner sc = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        System.out.println("lutfen notlari giriniz");
        double puanlar=0;
        while (puanlar <= 100) {
           puanlar = sc.nextDouble();
            if (puanlar <= 100) {
                notlar.add(puanlar);
            }
        }
       return notlar;
    }
}