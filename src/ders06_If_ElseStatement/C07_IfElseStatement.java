package ders06_If_ElseStatement;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {
        //kullanicidan bir karakter girmesini isteyin
        //girilen karakter kucuk harf ise buyuk harf olarak yazdirin
        //yoksa aynisini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krt=scan.next().charAt(0);
        if(krt>='a' &&krt<='z'){
           // System.out.println(krt - 32);//neden 32 cunki Ascii tablosunda A ile a arsinda 32 rakam farki var
            // boyle yazarsak buyuk A nin sayisal degerini verir yanlis olur char olarak casting yapmaliyiz
           System.out.println((char) (krt - 32));
            System.out.println(Character.toUpperCase(krt));//boyle de yapabiliriz sonuc ayni olur
        }else{
            System.out.println(krt);
        }
    }
}
