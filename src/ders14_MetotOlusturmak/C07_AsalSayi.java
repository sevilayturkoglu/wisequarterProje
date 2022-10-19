package ders14_MetotOlusturmak;

public class C07_AsalSayi {
    public static void main(String[] args) {
        //kullanicidan bir pozitif tam sayi al
              //  asal olup olmadigini donduren metot yaz

        int sayi=147;
        System.out.println(asalSayiKontrolEt(sayi));

    }public  static String asalSayiKontrolEt(int sayi){
        String asalMi="asal";
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                asalMi="asal degil";
                break;
            }
        }
        return asalMi;
    }
}
