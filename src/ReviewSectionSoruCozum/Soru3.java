package ReviewSectionSoruCozum;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        /*
        kullanicidan bir kelime girmesini isteyin,kelime uc veya daha fazla karakter iceriyorsa ve de karakter sayisi
        tek ise kelimenin ortasindaki karakteri yazdirin.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String str=sc.next();
        if(str.length()>=3 && str.length()%2!=0){
            char orta=str.charAt((str.length()-1)/2);//iki sekilde de olur
            //String orta=str.substring(str.length()/2,(str.length()/2)+1);
                System.out.println(orta);
            }
        }

    }

