package ders16_doWhileLoop;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        //while loop da sayi konditionun icinde arttigi icin fazladan islem yapip bizim istedigimiz gibi sonuclanmayabilir
        //doWhile de ise once bir kez islem yapar sonra kondtionu kontrol eder
        //do loop enaz birkez calisir
        //10 11 12 sayilarini doWhile loop u ile toplayalim

        int baslangicSayisi=10;
        int toplam=0;
        do{
            toplam+=baslangicSayisi;
           baslangicSayisi++;

        }while( baslangicSayisi<=12);

        System.out.println(toplam);
    }
}
