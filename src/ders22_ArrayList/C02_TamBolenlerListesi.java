package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {
        //soru 6- Kullanicidan pozitif bir tamsayi alip,
        //  o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //  bir liste olarak bize donduren bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int kullaniciSayisi= scan.nextInt();
        System.out.println(tamBolenler(kullaniciSayisi));

    }public static List<Integer> tamBolenler(int kullaniciSayisi){
        List<Integer> tamBoldu=new ArrayList<>();
        for (int i = 1; i <=kullaniciSayisi ; i++) {
            if(kullaniciSayisi%i==0){
                tamBoldu.add(i);
            }
        }
        return tamBoldu;

    }
}
