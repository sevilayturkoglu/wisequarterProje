package ders03_DataCastingWrapperClass;

import java.util.Scanner;

public class CO4_CharDataCasting {
    public static void main(String[] args) {
//ASCII tablosunda charlarin sayisal degeri vardir
        System.out.println('a'+'b');//char karakter olarak once matematik islem yapara
        // ve char b nin sayisal degerlerini topladi 97+98=195 yapti
        //ORNEK SORU:
        //kullaniciya bir char girdirin cikti olarak o chardan sonraki uc karakter gelsin
        //ornegin kullanici a girsin cikti olarak bcd gelsin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen char olarak bir karakter girin");
        char girilenKrt=scan.next().charAt(0);//Onemli; next char metot olmadigi icin next string yazacak ve
        // sadece ilk karakteri (0)char alacak.
        System.out.println(girilenKrt+1-1);//charin matematik degerini bulduk

        System.out.println((girilenKrt+1)+(girilenKrt+2)+(girilenKrt+3));//boyle yazarsak java bu charlarin sayisal degerini toplar
        // yani toplama islemi olarak gorur
        System.out.println(""+(girilenKrt+1)+(girilenKrt+2)+(girilenKrt+3));//basa bos string koyunca aradaki toplama islemini yapmaz ,ama parantez ici toplama yapar
        //  ve karakterlerin sayisal degerini verir
        //a matematik degerinin  1 fazlasi a nin 2 fazlasi .... toplama yapmadan yan yana dizer
        System.out.println(""+girilenKrt+1+girilenKrt+2+girilenKrt+3);//basa bos string koyunca hic toplama yapmaz Java geri kalani da String kabul eder charin yanina 1 2 3 ekler
        System.out.println(""+(char)(girilenKrt+1)+(char)(girilenKrt+2)+(char)(girilenKrt+3));//char casting yaptik sorun cozuldu.direk char karakterler geldi

  ///////////////////////////////////////kendi calismam
       /* Scanner scan1=new Scanner(System.in);
        System.out.println("lutfen bir char giriniz");
        char gir=scan1.next().charAt(0);
        System.out.println(gir+1+gir+2+gir+3);
        System.out.println(""+(char)(gir+1)+(char)(gir+2)+(char)(gir+3))


*/

    }
}
