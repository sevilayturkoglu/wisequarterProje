package ders18_Arrays;

public class C07_EnUzunEnKisaEleman {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun
        // ve en kisa kelimeleri yazdiran bir method olusturun.
        String[] str = {"Ali","Eda", "Veli", "Mehmet", "Husamettin","hasangiller"};

    enKsaUzun(str);

    }


    public static void enKsaUzun(String[] str){
        String enKisaKelime = str[0];
        String enUzunKelime = str[0];
        for (int i = 0; i < str.length; i++) {
            if (enKisaKelime.length() > str[i].length()) {
                enKisaKelime = str[i];
            }if(enUzunKelime.length()<str[i].length()){
                enUzunKelime=str[i];
            }
        }
        System.out.println("en kisa kelime = " + enKisaKelime + "  en uzun kelime=  " + enUzunKelime);
    }
}