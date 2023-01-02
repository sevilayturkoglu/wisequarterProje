package rewiew2;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_9_Arrays {
    //kullanicidan aldiginiz 8 elemanli array icinde kac tane 3 e bolunen sayi oldugunu tespit et

    public static void main(String[] args) {
        int[]kullaniciArr=new int[8];
        int sayi;
        int count=0;
        Scanner sc=new Scanner(System.in);
        for (int k = 0; k <kullaniciArr.length ; k++) {
            System.out.println("lutfen array icin sayi giriniz");
            sayi= sc.nextInt();
            kullaniciArr[k]=sayi;
            if(kullaniciArr[k]%3==0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(kullaniciArr));
    }
}
