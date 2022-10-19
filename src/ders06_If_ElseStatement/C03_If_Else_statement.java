package ders06_If_ElseStatement;

import java.util.Scanner;

public class C03_If_Else_statement {
    //kullanicidan ucge icin uc kenar uzunlugu iste
    //eger kenar uzunluklari esit ise ekrana "eskenar ucgen yazdir"
    //degilse ekrana "eskenar degil" yazsin
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("uc tane kenar uzunlugu gir");
    int bir = scan.nextInt();
    int iki = scan.nextInt();
    int uc = scan.nextInt();
        if (bir == iki && iki == uc) {
        System.out.println("eskenar ucgen");
    }else{
            System.out.println("eskenar degil");

        }
}
}