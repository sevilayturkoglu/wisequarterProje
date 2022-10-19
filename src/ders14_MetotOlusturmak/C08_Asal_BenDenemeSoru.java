package ders14_MetotOlusturmak;

public class C08_Asal_BenDenemeSoru {
    public static void main(String[] args) {
        int sayi = 5557;
        String asalMi = "asal sayi";
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                asalMi="asal sayi degil";
                break;
            }
        }
        System.out.println(asalMi);
    }
}