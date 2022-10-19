package ders06_If_ElseStatement;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {
        //kullanicidan bir karakter girmesini isteyin
        //girilen karakterin buyuk harf olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krt=scan.next().charAt(0);

        if(krt>='A' && krt<='Z'){
            System.out.println("girilen karakter buyuk harftir");

        }else {
            System.out.println("girilen karakter buyuk harf degil");
        }
    }
}
