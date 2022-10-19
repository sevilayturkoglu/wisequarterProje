package ders03_DataCastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi = 10;
        /// sayi.kullanilacak metot cikmaz cunki primitiv data

        String str = "Java cok guzel";//nonprimitive olan String icin asagida metot var hazir cikti
        //  str.kullanmak icin pek cok hazir metot cikti
        char str1 = str.charAt(5);
        System.out.println(str1);
        System.out.println(str.charAt(5));

        //normalde prmitiv data turlerinde hazir metotlar olmaz
        //ancak Java istekler sonucu primitiv data turlerinin kullanmasi icin bazi metotlar olusturmustur WRAPPER CLASS
        //wrapper claslar primitiv data turlerini kabul ederler ve metotlarida vardir

        ///ORNEKLER

        char cr='a';//char primitiv oldugu icin metodu yok char in wrapperi olan Character in ise metotlari var
        Character chr='a';//***burada Character Wrapper clasina ait equals metodunu kullandik
        System.out.println(chr.equals('b'));

        System.out.println(Character.isDigit('7'));//metot kullandik cevap true olacak

        //ORNEK
        String str2="123";
        String str3="12";
        // bu stringlerin toplamasini yapabilir miyim?
        System.out.println(str3 + str2);//string oldugu icin yan yana yazar 12312 gibi yani toplama yapmaz
//***ancak int in wrapperi olan Integere ait parseInt metodunu kullanarak rakamli Stringi primitiv hale getirip toplama yapabiliriz
        System.out.println(Integer.parseInt(str2) + Integer.parseInt(str3));
        System.out.println(Byte.MAX_VALUE);//wrapper Byte bir metodunu kullanarak int in max degerini bulduk
        System.out.println(Short.MIN_VALUE);
    }
}