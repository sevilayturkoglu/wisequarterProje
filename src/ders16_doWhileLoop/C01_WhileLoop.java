package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //10 11 ve 12 sayilarini toplayan bir while Loop yaz

        int toplam=0;
        int baslangic=10;
        while (baslangic<=12){
             toplam+=baslangic;
             baslangic++;

        }
        System.out.println(toplam);


    }
}
