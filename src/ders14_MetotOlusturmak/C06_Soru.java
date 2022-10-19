package ders14_MetotOlusturmak;

public class C06_Soru {
    public static void main(String[] args) {
        //kullanicidan ayri ayri ad soyad al
        //isim ve soyisimleri bas harfleri buyuk gerisi kucuk olacak sekilde duzenle ve yeni stringr ata
      //  isim bosluk soyisim seklinde bize donduren sekilde metot olustur
        String isim="aLI";
        String soyisim="bAYraM";

        System.out.println(isimSoyisimDuzenle(isim, soyisim));
        System.out.println(isimSoyisimDuzenle("sevilay", "turkoglu"));
    }public static String isimSoyisimDuzenle(String is,String sis ){//parametre adi yukardakiyle ayni olabilir olmayabilir de.farketmez
        String yeniAd=is.substring(0,1).toUpperCase()+is.substring(1).toLowerCase()+" "+
                sis.substring(0,1).toUpperCase()+sis.substring(1).toLowerCase();

        return yeniAd;
    }
}
