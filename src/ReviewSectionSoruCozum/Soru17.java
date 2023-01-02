package ReviewSectionSoruCozum;

public class Soru17 {
    public static void main(String[] args) {
        /*
        kullanici harf girsin girilen harf sesli ise sesli harf desin,sessiz ise sessiz harf desin
        ,girilen harf degil ise hatali karakter yazssin
         */

        String[] sesli = {"a", "e", "i", "o", "u" };
        String[] sessiz = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "y", "z", "q", "x", "w" };
        String kullan = "a";

        for (int i = 0; i < sesli.length ; i++) {
            if (sesli[i].contains(kullan)) {
                System.out.println("sesli harf girdiniz");

            }

        }
        for (int j= 0; j < sessiz.length ; j++) {
            if (sessiz[j].contains(kullan)) {
                System.out.println("sessiz harf girdiniz");

            }
        }
    }
        }
