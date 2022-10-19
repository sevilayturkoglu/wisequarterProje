package ders17_Scope_Local_Class_Variablslar;

public class C05_ObjectVariables {
    //java run time programdir,calistigi surece yapilan degisiklikleri kaydeder,calisma bitince degisen degerleri resetler
    //INSTANCE VERIABLE CAGIRMA
    //statik verilere class adiyla ulasiriz obje olusturarak gelmez ama
    //C03 clasindaki instance veriabllara nasil ulasiriz
    // Cevap o clasin adini kullanarak obje olusturmaliyiz,cunku objeye baglilardir

    public static void main(String[] args) {

        C03_ObjectVariables pers1=new C03_ObjectVariables();       //obje olusturduk simdi instance variabllari cagiralim
        System.out.println(pers1.persIsim);//isim girmedigimiz icin bos gelir
        System.out.println(pers1.persYas);//0
        System.out.println(pers1.persTlf);//0

        //deger verelim
        pers1.persIsim="Suleyman";
        pers1.persYas=35;
        pers1.persTlf="212 6989788";

        System.out.println(pers1.persIsim);
        System.out.println(pers1.persYas);
        System.out.println(pers1.persTlf);

       C03_ObjectVariables pers2=new C03_ObjectVariables();            //istedigimiz kadar obje olusturabiliriz
        pers2.persIsim="Nalan";
        pers2.persYas=29;
        pers2.persTlf="21245786354";

        System.out.println(pers2.persIsim);
        System.out.println(pers2.persYas);
        System.out.println(pers2.persTlf);

        C03_ObjectVariables pers3=new C03_ObjectVariables();
        pers3.persIsim="Ayse";
        pers3.persYas=25;
        pers3.persTlf="212457321154";

        System.out.println(pers3.persIsim);
        System.out.println(pers3.persYas);
        System.out.println(pers3.persTlf);
    }
}
