package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_ArraysSoru {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.

        int []yeni=kendiArrayiniYap();//metottan aldigimiz arayi yeni bir aray icine attik
        System.out.println(Arrays.toString(yeni));
        System.out.println(Arrays.toString(kendiArrayiniYap()));//metottan gelen arayi yazdirdik
        System.out.println(Arrays.toString(kendiArrayiniYap()));//metodu uc kez cagirdigimiz icin uc kez yazar

    }

    public  static int[] kendiArrayiniYap(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen arrayin uzunlugunu giriniz");
        int length= scan.nextInt();
        int[] kullaniciArayi=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("lutfen arayi olsturan degerleri giriniz");
            kullaniciArayi[i]=scan.nextInt();
        }return kullaniciArayi;
    }
}
