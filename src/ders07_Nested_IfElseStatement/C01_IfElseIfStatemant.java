package ders07_Nested_IfElseStatement;

import java.util.Scanner;

public class C01_IfElseIfStatemant {
    public static void main(String[] args) {
        //kullanicidan boy ve kilosunu alin
        //vucut kitle endeksini hesaplayin(kilo*1000/boy*boy)
        //30 dan buyukse Obez
        // 25 30 arasi kilolu
        //20  25 arasi normal
        // 20 den kucuk zayif
        //farklisi gecersiz yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();
        double vki=(kilo*10000/(boy*boy));
        System.out.println(vki);
        if (vki>30){
            System.out.println("obez");
        } else if (vki >=25) {
            System.out.println("kilolu");

        } else if (vki>=20) {
            System.out.println("normal");

        } else if (vki<20 &&vki>1) {//vki>0 da yazabilirdik
            System.out.println("zayif");

        }else{
            System.out.println("gecersiz");
        }
    }
}
