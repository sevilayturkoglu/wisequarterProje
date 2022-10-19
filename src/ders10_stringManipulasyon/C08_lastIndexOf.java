package ders10_stringManipulasyon;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        //sondan basa dogru tarar

        String str="Java hafiften beyin yakiyor";
        System.out.println(str.lastIndexOf("a"));// 21  son a 21.indexteymis
        System.out.println(str.lastIndexOf("Java"));//0. index
        System.out.println(str.lastIndexOf("java"));// -1 boyle bir string metinde yok
        System.out.println(str.lastIndexOf("e"));//15 de e var onceki e yi bulmak icin asagidakini yapalim
        System.out.println(str.lastIndexOf("e", 14));//11 15 den once 11 de olan e yi bulur

    }
}
