package ders12_forLoop;

public class C01_forLoops {
    public static void main(String[] args) {
        // for gibi looplari bir conditionu birden fazla yazdirmak icin kullaniriz
        String str="Java\n";// \n bir alt satira gecmek icin kullanilir
        System.out.println(str.repeat(10));//bunu da yazmak icin kullaniriz ama sinirlidir ,looplar daha kullanislidir

        //ORNEK
        // birden baslayip 10 dahil sayilari forLoop ile yazdir

        for (int i = 1; i <=10; i++) {
            System.out.print(i + " ");//print yazdik ki yan yana yazsin ln yi kaldirdik." " bunu da sayilar arasi bosluk icin biraktik

        }
        System.out.println(" ");
        //ORNEK
        // iki basamakli sayilardan 7 ye bolunenleri yan yana yazdir
        for (int i = 10; i <100 ; i++) {
            if(i%7==0){
                System.out.print(i + "  ");
            }

        }System.out.println(" ");//bunu satirlar arasinda bosluk olsun satir atlasin diye koyduk
        //ORNEK
        //13 den baslayip yuze kadar 7 ser 7 arttirip yazdirin

        for (int i = 13; i < 100; i+=7) {

            System.out.print(i + " ");
        }
        System.out.println(" ");
        //ORNEK
        //1 den 10 a kadar sayilarin karelerini yazdiralim

        for (int i = 1; i < 10; i++) {
            System.out.print(i * i + " ");

        }System.out.println(" ");

        //ikiser ikiser yazdirma
        for (int i = 1; i <=50; i++) {
           i=i+1;

            System.out.print(i+" ");

        }
    }
}
