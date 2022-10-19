package ders16_doWhileLoop;

public class C03_doWhileSoru {
    public static void main(String[] args) {
        //kullanicidan pozitif sayi al
        //bu sayinin tam kare olup olmadigini kontrol et
        int sayi=16;
        int kare=1;
        int count=0;
        do {
            if (kare*kare==sayi){
                System.out.println("tam kare");
                count++;
                break;
            }
            kare++;
        }while(kare*kare<=sayi);
        if(count==0){
            System.out.println("tam kare degil");
        }
    }
}
