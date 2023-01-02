package rewiew2;

import java.util.Scanner;

public class Soru_1_While {
    public static void main(String[] args) {
        //girilen sayinin rakamlar toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int alinanSayi= scan.nextInt();
        int toplam=0;
        int birlerBasamagi=0;
        while(!(alinanSayi==birlerBasamagi)){//alinanSayi!=0
         birlerBasamagi=alinanSayi%10;
         toplam+=birlerBasamagi;
         alinanSayi=alinanSayi/10;

        }
        System.out.println(toplam);
    }
}
