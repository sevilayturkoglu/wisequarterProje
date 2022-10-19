package ders08_Ternery_Switch;

import java.util.Scanner;

public class C01_TerneryOperator {
    public static void main(String[] args) {
        //ternery operator basit if else yerine kullanilabilir
        //      if(a>0)            {a*=2;}                  else{a+=10;}             normal if else yapilan sekli
        //       a>0   ?            a*2               :         a+10 ;             bu da ternery ile yapilan sekli
        //   (boolean sart)  (sart true ise bunu yap)   (sart dogru degilse bunu yap)

        //Ornek;
        //kullanicidan iki sayi al
        //sayi pozitif ise 2 katini yazdir
        //pozitif degilse 10 ekle

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir pozitif sayi giriniz");

        double sayi=scan.nextDouble();
        if (sayi>0){                               //if else yazilisi
            System.out.println(sayi*=2);
        }else {
            System.out.println(sayi += 10);
        }
                //sayi>0 ?  sayi*2  : sayi+10;           ternery yazilisi
        System.out.println(sayi > 0 ? sayi * 2 : sayi + 10);

    }
}
