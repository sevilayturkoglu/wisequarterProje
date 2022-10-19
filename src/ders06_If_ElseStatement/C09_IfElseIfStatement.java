package ders06_If_ElseStatement;

public class C09_IfElseIfStatement {
    public static void main(String[] args) {
        //tam sayi al
        //negatif ise gecersiz yazdir
        //tek basamakli ise rakam yazdir
        //iki basamakli ise iki basamakli yazdir
        //bunlarin disindakilere buyuk sayi yazdir
        int say=155;
        if ( say<0){
            System.out.println("gecersiz ");
        } else if (say<10) {
            System.out.println("rakam");
        } else if (say<100) {
            System.out.println("iki basamakli");
        }else {
            System.out.println("buyuk sayi ");
        }
    }
}
