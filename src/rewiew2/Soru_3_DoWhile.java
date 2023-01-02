package rewiew2;

import java.util.Scanner;

public class Soru_3_DoWhile {
    public static void main(String[] args) {
        /*
        Kullanicidan x girilene kadar "program calisiyor"yazan ve x girildigind ise "program bitti "yazsin
         */
        char girilenCar='a';

        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("lutfen bir karakter giriniz");
            girilenCar=sc.next().charAt(0);
            System.out.println("program calisiyor");

        }while(girilenCar!='x');
        System.out.println("program bitti");
        }
    }

