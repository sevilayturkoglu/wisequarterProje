package ders05_Concatination_Operation;

import java.util.Scanner;

public class C06_IfStatement {
    // sarta bagli ifadelerdir sart saglaniyorsa istegimizi true kabul eder yerine getirir,
    // sart  gerceklesmez veya false ise istegimizi yapmaz
    public static void main(String[] args) {
        //kullanicidan iki sayi alin
        //eger birinci sayi 100 den buyukse "ilk sayi 100 den buyuk "yazsin
        //eger ikinci sayi cift ise "ikinci sayi cifttir "yazsin
        //eger ilk sayi ikinciden buyukse "ikinci sayi kucuktur "yazsin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int ilk = scan.nextInt();
        int son = scan.nextInt();
        if (ilk > 100) {
            System.out.println("ilk sayi 100 den buyuktur");
        }
        if (son % 2 == 0) {
            System.out.println("ikinci sayi cifttir");
        }
        if (ilk > son) {
            System.out.println("ikinci sayi kucuktur");
        }
        // bu ifadelerden sadece dogru olan ekranda yazilir
        // suslu parantez icindeki bolgeye if body denir


        int a = 10;
        int b = 20;
        boolean sonuc = a > b;//boolean deger  false bu nedenle statementsimizi yazdiramayiz
        if (sonuc) {
            System.out.println("boolean sonuc false ise bunu yazmaz ,ki yukarda false oldugu gorunuyor ");
        }

        sonuc = a < b;//ifade true ya donustu simdi statementimizi yazar
        if (sonuc) {
            System.out.println("boolean sonuc true ise bunu yazar ,ki yukarda true oldugu gorunuyor ");
        }
///EK BILGI
        int nam=10;
        nam=+1;// burada nam degerini 1 yaptik
        System.out.println(nam);// 1 yazar

        int nam1=10;
        nam1+=3;//nam1 e uc ekledik 13 oldu
        System.out.println(nam1);//13 yazar

        nam1*=2;//13*2
        System.out.println(nam1);//nam1 i 2 ile carpar
        nam1/=2;
        System.out.println(nam1);//num1 2 ye bolundu
    }
}