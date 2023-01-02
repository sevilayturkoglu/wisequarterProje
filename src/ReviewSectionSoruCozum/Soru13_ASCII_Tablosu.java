package ReviewSectionSoruCozum;

public class Soru13_ASCII_Tablosu {
    public static void main(String[] args) {
        /*0-255 e kadar harflerin ,sayi ve harf degerlerini ekrana yazdir

         */
        for (int i = 0; i <=255 ; i++) {
            char a=(char)i;//chara casting yaptik
            System.out.println(a+":"+i+" ");//A:65 gibi yazar
        }
    }
}
