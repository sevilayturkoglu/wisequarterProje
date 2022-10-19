package ders09_StringManipulasyon;

import java.util.Locale;

public class C01_toUpperAndtoLowerCase {
    public static void main(String[] args) {

        String str = "java Mutluluktur";
        System.out.println(str.toUpperCase());//boyle de buyuk yazdiririz ama kalici olmaz ,kalici olmasi icin deger atamaliyiz
        str = str.toUpperCase();
        System.out.println(str);
         str=str.toLowerCase();
        System.out.println(str);


        String str1="ince Memed";
        System.out.println(str1.toUpperCase());//bilgisyarin dili Ingilizce olmadigi icin benim buyuk i yi de noktali yazdi
        System.out.println(str1.toUpperCase(Locale.ENGLISH));//english tarzi yazmak icin kullandik
        System.out.println(str1.toUpperCase(Locale.forLanguageTag("Tr")));//turkce karaakterli yaz dedik

    }
}