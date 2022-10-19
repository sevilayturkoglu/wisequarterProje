package ders03_DataCastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        //ONEMLI
        int say=20;
       // short sayi2=say;    burada buyuk olan int i kucuk olan shorta atamaya calistik Java bunu otomotik yapmaz
        //Javanin bunu kabul etmesi icin casting yapmaliyiz yani daraltma yapmaliyiz buna explicit"NARROWING "denir
        //narroving soyle yapilir:
        short sayi2=(short)say;
        System.out.println(sayi2);

        double dbl=23.5;
        int sayi=(int)dbl;//double int e cevirince noktadan sonrasini yazmaz 23 yazar yani narrowing yapar
        System.out.println(sayi);

        //
        say=129;
        byte sayu=(byte)say;//byte siniri -128 ile +127 arasindadir bu nedenle 127 den kucukleri yazarken sorun olmaz
        // ama 127 den buyuk yazarsak narrowing yapar

        System.out.println(sayu);



    }
}
