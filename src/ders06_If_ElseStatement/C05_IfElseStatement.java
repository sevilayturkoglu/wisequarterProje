package ders06_If_ElseStatement;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin.65 yas ve uzeri ise emekli olabilirsin yazsin
        //degilse emekliligine kac yil var yazsin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas= scan.nextDouble();//veriyi double yaptik cunki yas kusuratli olabilir
        if(yas>=65){
            System.out.println("Emekli olabilirsin");
        }else{
            System.out.println("emekliliginize  " + (65-yas )+ "  yil var");
        }
    }
}
