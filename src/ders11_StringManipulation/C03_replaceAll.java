package ders11_StringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        // verdigimiz komutlar ile metindeki seyleri degistirebiliriz
/*Regent komutlari:
\\s spaceleri yok eder
\\S space olmayan seyler
\\s+ yan yana birden fazla space
\\d digits
\\D digit olmayan sey
\\w harf veya rakam
\\W hark veya rakam olmayan hersey
*/
        //ornegin asagidaki metinde rakamlari yok et

        String str="1Jav2a 3Gu8zel9di7r";
        System.out.println(str.replaceAll("\\d", ""));//Java Guzeldir   tum rakam digitleri ayiklar
        System.out.println(str.replaceAll("\\D", ""));//123897 sadece sayilar kaldi



        //ORNEKK asagidaki urun fiyatlarini toplayiniz
        String str1="pantolon 1250 tl";
        String str2="gomlek 1500 tl";
        str1=str1.replaceAll("\\D","");//harflerden kurtulduk
        str2=str2.replaceAll("\\D","");
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//stringleri toplamak icin parseInt metodunu kullandik

    }
}
