package ders12_forLoop;

public class C02_faktoryel {
    public static void main(String[] args) {
        //ORNEK
        //kullanicinin verdigi sayinin faktoryelini bul
        int sayi=5;
        int fak=1;
        for (int i = sayi; i > 1; i--) {
            fak=fak*i;
            System.out.print(fak+"  ");//bu tum islem basamaklarini verir cunki for icinde
        }
        System.out.println(fak+"  ");// bu sadece sonucu verir

        System.out.println("  ");

        //ORNEK
        // 1 den 100 e kadar sayilarin toplamini bulunuz
        int top=0;
        for (int i = 1; i <=100 ; i++) {
            top=top+i;

        }System.out.println(top);


    }
}
