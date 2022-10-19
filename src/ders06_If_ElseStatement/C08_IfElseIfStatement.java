package ders06_If_ElseStatement;

import java.util.Scanner;

public class C08_IfElseIfStatement {
    public static void main(String[] args) {
        //kullanicidan ucge icin uc kenar uzunlugu iste
        //kenar uzunluklari negatif veya 0 ise gecersiz kenar uzunlugu desin
        //eger kenar uzunluklari esit ise ekrana "eskenar ucgen yazdir"
        //degilse ekrana "eskenar degil" yazsin

        Scanner scan = new Scanner(System.in);
            System.out.println("uc tane kenar uzunlugu gir");
            int bir = scan.nextInt();
            int iki = scan.nextInt();
            int uc = scan.nextInt();
            if(bir<=0 || iki<=0 || uc<=0 ){
                System.out.println("gecersiz kenar uzunlugu");
            }else if( bir==iki && iki==uc){
                System.out.println("eskenar ucgen");
            }else{
                System.out.println("eskenar ucgen degil");
            }
    }
}
