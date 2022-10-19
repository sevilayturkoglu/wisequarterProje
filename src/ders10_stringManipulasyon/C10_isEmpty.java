package ders10_stringManipulasyon;

public class C10_isEmpty {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isEmpty());//true string bos diyor
        String str1="  ";
        System.out.println(str1.isEmpty());// false der cunku bosluk var ve bosluk da bir karakterdir o ne denle bos demez

        System.out.println(str.isBlank());//true
        System.out.println(str1.isBlank());//true der cunki boslukta birsey yazmiyor

        String str2="x";
        System.out.println(str2.isEmpty());//false
        System.out.println(str2.isBlank());//false

    }
}
