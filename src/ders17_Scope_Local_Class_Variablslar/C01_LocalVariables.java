package ders17_Scope_Local_Class_Variablslar;

public class C01_LocalVariables {

    //                            LOCAL VARIABELLAR
   //Local variabellar bir metodun icinde olusturulur ve sadece o metot icinde kullanilabilir,ulasilabilir
    //Local veriabllara deger atamak mecburi degildir ancak kullanmak istersek deger atamadan kullanamayiz
    //loop icinde olusturulan variabellar da localdir ,loop disinda kullnamayiz,
    // ancak loop disinda ,ayni metotta olusturdugumuz variabla loop icinde yeniden deger verebiliriz


    public static void main(String[] args) {
     int sayi=10;
     String isim="Ramazan";
int a;//deger atamadik sorun degil
       // System.out.println(a);ama deger atamadan kullanamayiz
        for (int i = 0; i < 10; i++) {
            String adres="Ankara";

        }
        //System.out.println(adress);kullanamayiz cunki lokal olarak loop icinde olusmus


    }public static void method1(){

        //System.out.println(sayi);kullanamayiz cunki local olarak baska metot icinde olusturulmus

    boolean dogruMu=true;
    }
}
