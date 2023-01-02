package rewiew2;

import java.util.Scanner;

public class Soru_4_DoWhile {
    public static void main(String[] args) {
        /*
        kullanici bir kelime isteyin girilen kelimenin karakter sayisi tk ve 3 tenfazla ise kelimenin ortasindaki harfi yazdirin
        cift sayi ise yanlis karakter girdiniz
         */
        String kelime = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("lutfen bir kelime giriniz");
            kelime = sc.next();
            if (kelime.length() % 2 == 0 || kelime.length() < 2) {
                System.out.println("yanlis karakter girdiniz");
            }
            if (kelime.length() >= 3 && kelime.length() % 2 == 1) {

                System.out.println(kelime.substring(kelime.length() / 2, kelime.length() / 2 + 1));
            }
        } while (kelime.length() % 2 == 0 || kelime.length() < 3);
    }
}