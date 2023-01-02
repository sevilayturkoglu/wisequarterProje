package ReviewSectionSoruCozum;

public class Soru11_Fibonacci {
    public static void main(String[] args) {


    /*
    kullanicinin verdigi sayiya kadar olan fibonacci dizisini bulun

     */
        int fibonacci = 6;
        int birinciSayi = 0;
        int ikinciSayi = 1;
        int ucuncuSayi = 0;
        System.out.print(birinciSayi+" ");
        System.out.print(ikinciSayi+" ");
        for(int i=2;i<fibonacci;i++){//ilk iki sayiyi biz verdigimiz icin i yi ikiden baslattik
            ucuncuSayi=birinciSayi+ikinciSayi;
            birinciSayi=ikinciSayi;
            ikinciSayi=ucuncuSayi;

            System.out.print(ucuncuSayi+" ");
        }

    }
}