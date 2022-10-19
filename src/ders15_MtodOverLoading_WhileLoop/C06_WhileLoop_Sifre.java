package ders15_MtodOverLoading_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop_Sifre {
    public static void main(String[] args) {
        /*
        kullanicidan sifre girmesini isteyin
        sifre asagidaki sartlari tasimiyorsa hata mesaji yazin
        gecerli sifre yazana kadar bu islem tekrarlansin
        sifre basarili olursa sifreniz basariyla kaydedildi yazsin

        //sifre kucuk harfle baslamali ve son indexi rakam olmalidir
         */
        Scanner scan=new Scanner(System.in);

        boolean sifreDogruMu=false;
        String sifre="";
        int bayrak=0;


        while(sifreDogruMu!=true){
            System.out.println("lutfen bir sifre giriniz");
            sifre =scan.next();
            bayrak=0;//buraya bunu yazmaliyiz cunki yanlis sifre ilk girildiginde bayrak 1 olur ve degismez o zaman sonsuz dongu olur,oysa burada her giriste sifirlar oyle baslar
            if(!(sifre.charAt(0)>='a'&&sifre.charAt(sifre.length()-1)<='z')){
                System.out.println("sifrenizin ilk harfi kucuk olmalidir ,yeniden deneyiniz");
                bayrak++;
            }if(!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("sifrenizin son karakteri rakam olmalidir,yeniden deneyiniz");
                bayrak++;
            }if(sifre.length()<8){
                System.out.println("sifreniz en az 8 karakter olmali,yeniden deneyiniz");
                bayrak++;


            }if(bayrak==0){
                sifreDogruMu=true;
                System.out.println("sifre basariyla kaydedildi");
            } System.out.println(bayrak);
        }


    }
}
