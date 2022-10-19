package ders06_If_ElseStatement;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //kullanicidan ucge icin uc kenar uzunlugu iste
        //eger kenar uzunluklari esit ise ekrana "eskenar ucgen yazdir"
        Scanner scan = new Scanner(System.in);
        System.out.println("uc tane kenar uzunlugu gir");
        int bir = scan.nextInt();
        int iki = scan.nextInt();
        int uc = scan.nextInt();
        if (bir == iki && iki == uc) {
            System.out.println("eskenar ucgen");
        }
    }
}