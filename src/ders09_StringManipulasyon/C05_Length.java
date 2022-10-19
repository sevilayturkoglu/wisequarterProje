package ders09_StringManipulasyon;

public class C05_Length {
    public static void main(String[] args) {
        //Stringin karakter sayisi yani uzunlugunu verir
        String str="Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length());//34 tane karakter var
        String sr="Bal";
        System.out.println(sr.length());//3 tane karakter var
        System.out.println(str.charAt(33));//son karakter olan u nun indexidir(33) ve u yu verir.karakter sayisi 34-1=index no
        System.out.println(str.charAt(str.length() - 1));// bu da son karakteri verir lengt ile karakter sayisini bulduk
        // -1 yapinca son karakterin indexine ulasip aldik
        System.out.println(str.charAt(str.length() - 3));//sondan ucuncu karakter olan g yi verir
    }
}
