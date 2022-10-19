package ders11_StringManipulation;

public class C01_null_pointer {
    public static void main(String[] args) {

        //null in gorevi codumuzu calisir halde tutmaktir

        String str="";//burada str ye deger atadik  degerimiz hiclik,bununla String metotlari kullanip yazdirabiliriz
        System.out.println(str.length());// 0 yazar
        System.out.println(str);//yazar ama birsey gorulmez
        System.out.println(str.concat("Java"));//metot kullandik

        String str1;//deger atamadik yazmaya ve metot kullanmaya calisirsak error verir
       // System.out.println(str1);error

        String str3=null;//burada str3 e null degeri yani bos deger atadik
        System.out.println(str3);//null yazar yazdirabiliriz
      //  System.out.println(str3.isEmpty());metotlar hata verir
        //System.out.println(str3.isBlank());

        System.out.println(str3 + "java");//nulljava yazar yani toplama yaptirir

    }
}
