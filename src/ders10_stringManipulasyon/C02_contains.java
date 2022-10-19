package ders10_stringManipulasyon;

public class C02_contains {
    public static void main(String[] args) {
        //bir string veya karakterin baska bir string icinde olup olmadigini kontrol eder
        String str="Java cok guzeldir";
        System.out.println(str.contains("Java"));//sonuc boolean olarak cikar
        System.out.println(str.contains("eldir"));//true
        System.out.println(str.contains("a"));//true
        //System.out.println(str.contains('a'));error verir char ve diger data turlerine bakmaz sadece srting kabul eder
        System.out.println(str.contains("a"));//true
        System.out.println(str.contains("java"));//false kucuk harften dolayi

        String str2="Java";//Javayi str2 ye atadik sonra onu kullanarak sorduk
        System.out.println(str.contains(str2));//true

        String str3="234 Ali";
        System.out.println(str3.contains("2"));//true
    }
}
