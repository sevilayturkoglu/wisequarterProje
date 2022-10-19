package ders08_Ternery_Switch;

import java.util.Scanner;

public class C07_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        Character harf=scan.next().charAt(0);
      Character yeniHarf= harf.toUpperCase(harf); //burada kullanicidan aldigimiz harfi buyuk harfe cevirdik

        System.out.println(yeniHarf);
        switch (yeniHarf){
             case 'J':
                 System.out.println("Java");
             case 'D':
                 System.out.println("Development");
             case 'K':
                 System.out.println("Kit");
                 break;// break i buraya koydum cunki "j "yazdigimda JDK yazsin istedim
             default:
                 System.out.println("gecersiz harf");
         }


    }
}
