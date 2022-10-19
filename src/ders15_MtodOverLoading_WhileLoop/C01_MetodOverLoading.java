package ders15_MtodOverLoading_WhileLoop;

public class C01_MetodOverLoading {
    public static void main(String[] args) {
        /*METOTOVERLOADING:
        Java da ayni isimde birden cok metot yazabiliriz,ve yazdigimiz bu metodlari ihtiyacaa gore farkli parametreler yazarak kullanabiliriz
        Ama dikkat etmemiz gereken noktalar vardir.Java ayni isimde olan metotlardan hangisini kullanir ;
        1-Metot isimleri ayni olmali ama parametre turu veya sayisi farkli olmali
        2- Argument sayisi ile parametre sayisina bakar
        3-Argument ve parametre uyumuna bakar
        4-Minimum castingli olani secer
        ORNEKLER:
          */
        carpim(3,5);//ilk yazdigimiz metot gelir ,metot cagirilirken metot parantezine yazilana argument denir.
        carpim(3.5,3);//ucuncu yazdigimiz metot gelir
    }
//asagidaki metotlarin hepsinin ismi ayni ama parametre ve argumanlar farkli oldugu icin METOTOVERLOADING olur ve java kabul eder
// ,bizim yazdigimiz parametrelere uygun olan metodu Java bulur bize getirir
    public static void carpim(int sayi1, int sayi2) {
        System.out.println("iki integer sayinin carpimi = " + sayi1 * sayi2);
    }
    public static void carpim(int sayi1, int sayi2, int sayi3) {//ayni isim ama parametre sayisi farkli kabul eder
        System.out.println("uc integer sayinin carpimi = " + sayi1 * sayi2);
    }
    public static void carpim(double sayi1, int sayi2) {//kabul eder cunki iki parametrenin data turu farkli
        System.out.println("double-integer sayinin carpimi = " + sayi1 * sayi2);
    }
    public static void carpim(int sayi1, double sayi2) {//kabul eder cunki iki parametrenin data turu farkli ve bir ustteki metoda gore data turlerinin yerleri degisik
        System.out.println("integer-double sayinin carpimi = " + sayi1 * sayi2);
    }
    public  static  void carpim(double sayi1,double sayi2){//kabul eder cunki  parametrenin data turuleri farkli
        System.out.println("double-integer sayinin carpimi = " + sayi1 * sayi2);
}}