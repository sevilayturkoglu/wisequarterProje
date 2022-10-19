package ders11_StringManipulation;

public class C07_soru {
    public static void main(String[] args) {
        /*
        kullanicidan isim ve soyisim ayri ayri al
        *isim uzunsa isim ve soyismin ilk harflerini buyuk yazdir gerisi kucuk
        soyisim uzunsa ismin ilk harfi buyuk digerleri kucuk ,soyisim ise buyuk yazsin
         */
        String isim="SEVILAY";
        String sisim="TUrk";
        String yeniIsim;

        if(isim.length()>sisim.length()){
            yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+"  "
                    +sisim.substring(0,1).toUpperCase()+sisim.substring(1).toLowerCase();

        }else{
            yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+sisim.toUpperCase();

        } System.out.println(yeniIsim);//conditionun disina yazdigimiz icin ikiside kullanir
    }
}
