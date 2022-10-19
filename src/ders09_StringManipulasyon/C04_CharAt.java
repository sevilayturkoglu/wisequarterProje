package ders09_StringManipulasyon;

public class C04_CharAt {
    public static void main(String[] args) {
        //CharAt metodunun icine Stringimizin hangi karakterini almak istiyorsak onun index nosunu yazariz
        String str="Java Candir";
        System.out.println(str.charAt(0));//sadece ilk karakteri verir J.  J nin index nosu 0 dir
        System.out.println(str.charAt(5));//sifirdan saymaya baslayarak 5.karakteri verir C
        System.out.println(str.charAt(10));//son karakteri verir r
        //index sayisi ile karakter sayisi arasinda her zaman 1 fark vardir or:karakter sayisi 11 ise index sayisi 10 dur
        //yani 11. karakter olan r nin indexi 10 dur
    }
}
