package ders08_Ternery_Switch;

public class C04_Ternary {
    public static void main(String[] args) {
        //kulanicidan uc tane sayi iste
        //sayilar birbirine esitse "eskenar ucgen" yazsin
        //esit degilse "eskenar degil"yazsin
        int sayi1=12;
        int sayi2=0;
        int sayi3=12;

        String ucgen=sayi1==sayi2 &&sayi2==sayi3  ? "eskenar ucgen" : "eskenar degil";
        System.out.println(ucgen);
        String ucgen2=sayi1>0 && sayi2>0 && sayi3>0 && sayi1==sayi2 &&sayi2==sayi3
                      ? "eskenar ucgen" : "eskenar degil";//burada sayilarin
        // sifirdan buyuk olma sarti ekledik ama cok uzun oldu
        System.out.println(ucgen2);

        // kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        int a=17;
        int b=15;
        int c= a>b ? b : a;
        System.out.println(c);
        System.out.println(a > b ? b : a);//yukaridakiyle ikisi ayni

    }
}
