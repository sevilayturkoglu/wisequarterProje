package ders04_matematikselslemler_incrementDecrement;

public class C05_Increment_Decrement {
    public static void main(String[] args) {
        //sayilara ekleme cikarma yapmak
        int sayi=10;
        sayi=sayi+3;//uc arttirir
        System.out.println(sayi);
        sayi+=3;//uc daha arttirir
        System.out.println(sayi);
        sayi++;//bir daha arttirir,post increment
        System.out.println(sayi);
        ++sayi;//bir daha arttirir,pre increment
        System.out.println(sayi);

        sayi=sayi-3;
        System.out.println(sayi);
        sayi-=3;
        System.out.println(sayi);
        sayi--;
        System.out.println(sayi);
        --sayi;
        System.out.println(sayi);

        sayi=sayi*3;
        System.out.println(sayi);
        sayi*=3;
        System.out.println(sayi);
    }
}
