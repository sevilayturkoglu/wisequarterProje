package ders06_If_ElseStatement;

import java.util.Scanner;

public class C01_IfStatements {
    //Bilgi;
    //println("ali ")yazarsak  ali yazar
    //println("can")yazarsak alt satira gecer can yazar
    //print("ali ")yazarsak  ali can yazar
    //print("can ")yazarsak  can i ust satira yazar

    public static void main(String[] args) {

        //*Kullanicidan bir harf veya kelime alin o harfle baslayan ay adi varsa buyuk harf kucuk harf hssasiyeti olmadan o ayin adini yazssin "Ocak" gibi
Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        char ay=scan.next().charAt(0);
if(ay=='o' || ay=='O'){
    System.out.println("Ocak");

}if(ay=='s' || ay=='S'){
            System.out.println("Subat");//bunu alt alta yazip tum aylari ekleyebiliriz
    }
}}