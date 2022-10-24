package ders19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_kullanicidanElemanAlArrayYap {
    public static void main(String[] args) {
        //kullanicidan eleman al array yap
        //kullanici sifir girdiginde array bitsin
        int[]arr={1};
       int girilenSayi=0;

        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("array olusturmak uzere lutfen sayi giriniz \n,eger 0 girerseniz array tamamlanacaktir");
            girilenSayi= scan.nextInt();
           if(arr[0]==1){
               arr[0]=girilenSayi;
           }else if(girilenSayi!=0){
               arr=C08_ArrayeElemanEklemeMetodu.arrayElementEkle(arr,girilenSayi);
           }
        }while(girilenSayi!=0);
        System.out.println(Arrays.toString(arr));
    }
    }

