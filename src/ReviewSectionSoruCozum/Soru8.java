package ReviewSectionSoruCozum;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        /*
        kullanicinin sececegi isleme  ve girecegi sayilara gore dort islem yaptiran bir islem yapiniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen istediginiz islemi giriniz");
        char islem=sc.next().charAt(0);

        System.out.println("lutfen birinci sayiyi giriniz");
        double birinci=sc.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double ikinci=sc.nextDouble();
        double sonuc=1;
        switch (islem){
            case '+':
                sonuc=birinci+ikinci;
                break;
            case '-':
                sonuc=birinci-ikinci;
                break;
            case '*':
                sonuc=birinci*ikinci;
                break;
            case '/':
                sonuc=birinci/ikinci;
                break;
            default:
                System.out.println("gecersiz islem");
        }
        System.out.println(sonuc);
    }
}
