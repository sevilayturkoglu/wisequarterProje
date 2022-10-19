package ders05_Concatination_Operation;

public class C05_LocicalOperator_OR_Veya {
    public static void main(String[] args) {
        //icinde bir tane bile true olsa sonuc true cikar .yani sadece false false false dir digerleri hep true dur
        // sembolu || dir,olumlu operator dur.

        int a=10;
        int b=15;
        System.out.println(a > b ||  b > 0);//biri false biri true = true
        System.out.println(b > a ||  a > 5);// true true=true
        System.out.println(a > b ||  b < 0); //false false =false
    }
}
