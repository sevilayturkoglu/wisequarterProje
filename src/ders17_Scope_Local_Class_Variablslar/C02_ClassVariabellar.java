package ders17_Scope_Local_Class_Variablslar;

public class C02_ClassVariabellar {
  //                CLASS LEVEL VARIABELLAR
    //Class icinde metot disinda olusturulan variabellardir,genel olarak metot disinda en uste yazilirlar
    //Deger atamadan da kullanilabilirler ama yazdirildiginda data tipine gore sonuc default (0,false,'',null)cikar
    // ulasilabilirligine gore Instance ve Static olarak ikiye ayrilirlar
    //Static metotlar sadece static variable kabul eder,static olmayan metotlar hem instance hem static variable kabul eder
    //static variabllar o clastaki tum abjeler icin gecerlidirler bu nedele baska bir clasa kendi clas ismiyle cagrilabilir yeni deger atanabilir,kullanilabilir
    // ama bu yeni deger kendi clasindaki degeri degistirmez,ama degistirilen deger java calistikca kalici olur
    static String hastaneAdi="Yildiz Hastanesi";//static class variable
    static int hastaSayisi=23453;
    static String basHekimAdi;//yazdirsak null yazar
    String persIsim;//instance class variable yazdirsak null yazar
    String persTlf;
    int persYas;// 0 yazar

    public static void main(String[] args) {

        //System.out.println(persIsim);//variable instance oldugu icin class lable variable olsa da static olan main metot kabul etmez,
        // kullanabilmek icin obje olusturmaliuiz

        System.out.println(basHekimAdi);// null yazar .clasa lable static variable oldugu icin kabul eder
      metot1();//static metodu burada cagirabiliriz

    }public static void metot1(){
        System.out.println(hastaSayisi);
  hastaSayisi++;//burada yeniden deger verdik ,ama yukariyi degistirmez
        //System.out.println(persTlf);//static olmadigi icin kabul etmez

        System.out.println(hastaSayisi);
    }public void method2(){//metodumuz static olmadigi icin hem static hem instant veriable kabul eder
        //bu methodu static olmadigi icin main method veya baska bir clasta cagiramayiz,obje olusturunca cagirabilir miyiz kontrol etmem gerek?
        System.out.println(basHekimAdi);
        System.out.println(persTlf);
        System.out.println(hastaSayisi);
    }
}
