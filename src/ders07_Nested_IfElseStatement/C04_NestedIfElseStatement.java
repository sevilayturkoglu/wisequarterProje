package ders07_Nested_IfElseStatement;

import java.util.Scanner;

public class C04_NestedIfElseStatement {
    public static void main(String[] args) {
        //kullanicidan cinsiyet ve yas al
        //erkek ise 65 uzeri emekli olur
        //kadin 60 yas uzeri emekli olur
        //emekli olmak icin  ....yil daha calisman lazim yazdir

        //yasa gor e kategorize et
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("lutfen cinsiyetinizi K/E olarak giriniz");
        char cins=scan.next().charAt(0);

        if (yas < 15) {
            System.out.println("hatali yas girisi");
        }
        else if (yas<60) {
            if(cins=='k'||cins=='K'){
                System.out.println("emekli olmak icin  " + (60 - yas) + "  yil calismalisin");
            }
            else if (cins=='e'||cins=='E') {
                System.out.println("emekli olmak icin  " + (65 - yas) + "  yil calismalisin");
            }
            else {
                System.out.println("hatali cinsiyet girisi");
            }

        }
        else if (yas<65) {
            if(cins=='k'||cins=='K'){
                System.out.println("emekli olmabilirsin");
            } else if (cins=='e'||cins=='E') {
                System.out.println("emekli olmak icin  " + (65 - yas) + "  yil calismalisin");
            }
            else {
                System.out.println("hatali cinsiyet girisi");
            }

        }
        else {
            System.out.println("emekli olabilirsin");
        }
    }
}
