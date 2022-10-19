package ders12_forLoop;

public class C04_DikkatEdilecekler {
    public static void main(String[] args) {
        /*
        Sonsuz loop olur calistirma bilgisayar coker
       ORNEK:
        for (int i = 0; i >-10 ; i++) {
            System.out.println(i + " ");
               */

        /*
        ilk deger icin sart true olmuyorsa dongu baslamaz
        ORNEK:*/
        for (int i = 20; i < 5; i++) {
            System.out.println(i + " ");

        }

        /*
        Bir loopu bitisini sonuna kadar beklemek istemiyorsak
        ORNEK:
        Verilen sayinin asal olup olmadigini bulalim
         */

        int sayi = 5300;
        boolean asal = false;         //bolmeye asal hale gelene kadar devam eder asali buldu mu false true doner ve break ile dongu biter
        for (int i = 2; i <= sayi - 1; i++) {

            if (sayi % i == 0) {
                asal = true;
                break;

            }

        }
        System.out.println(asal);

        if (asal) {
            System.out.println("sayi asal degil");
        } else {
            System.out.println("asal sayi");
        }



    }

}
