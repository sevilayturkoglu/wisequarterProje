package ReviewSectionSoruCozum;

public class Soru12 {
    public static void main(String[] args) {
        /* 100 den sifira kadar 13e tam bolunen sayilari alt alta yazdirin,sonra da toplamlarini bulunuz

         */
        int top = 0;
        for (int i = 100; i > 0; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
               top+=i;
            }
        }
        System.out.println(top);
    }
}
