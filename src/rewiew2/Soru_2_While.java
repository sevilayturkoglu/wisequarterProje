package rewiew2;

import java.util.Scanner;

public class Soru_2_While {
    public static void main(String[] args) {
        //girilen sayiya kadar olan sayilardan sadece tek olan sayilari toplamini ekrana yazdiriniz
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=sc.nextInt();
        int top=0;
        while(sayi>=0){

            if(sayi%2!=0){
               System.out.print(sayi+"-");
               top+=sayi;

               // System.out.print(top+"-");
            }
            sayi--;
        }
        System.out.println();
        System.out.println(top);
    }
}
