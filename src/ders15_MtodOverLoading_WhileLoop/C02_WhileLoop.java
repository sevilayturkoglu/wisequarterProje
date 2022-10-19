package ders15_MtodOverLoading_WhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //baslangic sayisi ve kac kere tekrar edecegi belli degilse while loop kullanmaliyiz

        //2 basamakli sayilari aralarinda bir bosluk olacak sekilde yazdirin
        //for loop ile
        for (int i = 10; i < 100; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        //while ile
        int sayi=10;
        while (sayi<100){
            System.out.print(sayi+" ");
            sayi++;//bu durumda bunu yazmazsak sonsuz loop olur cunki sayi hep 10 kalir
        }
    }
}
