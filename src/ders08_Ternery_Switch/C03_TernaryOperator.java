package ders08_Ternery_Switch;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        //ternary op tek basina kullanilmaz cunki bir sonuc uretir
        //ya sout icine direk yazmaliyiz veya
        // bir degere atamaliyiz
        //ORNEK
        int a=5;
       // a%2==0 ? "cift sayi":"tek sayi"; bu error verir CTE(complete time error)
        System.out.println(a%2==0 ? "cift sayi":"tek sayi");//sout icinde error vermez
        String str=a%2==0 ? "cift sayi":"tek sayi";//error vermez cunki deger atadik
      //String str1=  a%2==0 ? "cift sayi": a*2;error verir cunki stringin icine atmaya calistigimiz a*2 string degil,data turu ayni olmali
       String str2= a%2==0 ? "cift sayi":""+(a*2);//error kayboldu cunki basa koydugum "" ile a*2 yi stringe cevirdim
        System.out.println(str2);
    }
}
