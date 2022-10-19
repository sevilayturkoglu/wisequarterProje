package ders11_StringManipulation;

public class C08_soru {
    public static void main(String[] args) {
        /*
         *kullanicidan sifre iste
         * kullaniciya duzeltmesi gereken eksikleri soyletin
         * eger eksiksiz girerse sifre basariyla kaydedildi yazin
         * ilk harf kucuk olmali
         * son karakter rakam olmali
         * sifrede bosluk olmamali
         * uzunlugu en az 10 karakter olmali
         */
        String sifre="aks4444kkkk1";
        int bayrak=0;

        if(!(sifre.length()>=10)){
            System.out.println(" sifre en az 10 karakter olmali");
            bayrak++;
        }if(!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }if(!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk olmali");
            bayrak++;
        }if(sifre.contains(" ")){
            System.out.println("sifrede bosluk olmamali");
            bayrak++;
            System.out.println(bayrak);
        }if(bayrak==0){
        System.out.println("sifre basariyla kaydedildi");
    }
}}