package ders17_Scope_Local_Class_Variablslar;

public class C04_ClassVariables_Calisma {
    //C03 teki variabellari buraya cagirip calisma yapalim
    public static void main(String[] args) {
        //C03 de ki hastane adini yazdiralim
        System.out.println(C03_ObjectVariables.hastaneAdi);//Yildiz Hastanesi yazar.class ismiyle cagirdik geldi ,
        // ama static oldugu icin geldi instant olsaydi cagiramazdik obje olusturup cagirmaliydik
        System.out.println(C03_ObjectVariables.hastaSayisi);//23453 yazar
        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;

        System.out.println(C03_ObjectVariables.hastaSayisi);//23455 yazar
        method1();//alttaki metoda gider onu alir geri doner  23456 yazar
       System.out.println(C03_ObjectVariables.hastaSayisi);
    }public static void method1(){
        C03_ObjectVariables.hastaSayisi++;

    }
}
