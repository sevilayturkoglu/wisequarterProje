package ders10_stringManipulasyon;

public class C04_endsWith {
    public static void main(String[] args) {
        //metnimizi sorguladigimiz string ile bitip bitmedigini soyler
        String str="Java heryerde guzel";
        System.out.println(str.endsWith("guzel"));//true
        System.out.println(str.endsWith("heryerde"));//false
        System.out.println(str.endsWith("Java"));//false
        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith("Java heryerde guzel"));//true

    }
}
