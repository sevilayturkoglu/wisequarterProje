package ders15_MtodOverLoading_WhileLoop;

public class C08_Soru {
    public static void main(String[] args) {
        /*
        while loop kullanarak kullanicidan gelen sayinin rakamlar toplamini bulunuz
         */
        int sayi=543;
        int birlerBasamagi;
        int rakTop=0;
        while(sayi>0){
          birlerBasamagi=sayi%10;
          rakTop+=birlerBasamagi;
          sayi/=10;

        }
        System.out.println(rakTop);
    }
}
