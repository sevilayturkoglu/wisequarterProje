package ders07_Nested_IfElseStatement;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        //kullanicidan aldigi urun adedi ve liste fiyati alin
        //musteri karti olup olmadigini sorun
        //musteri karti varsa 10 veya daha fazla urun aldiysa %20 indirin 10 dan daha az urun aldiysa %15 indirim yapin
        // karti yoksa 10 ve daha fazla urun aldiysa %15,10 dan daha az urun aldiysa %10 indirim yapin
        double listeFiyati = 12.5;
        int urunSayisi = 11;
        boolean kart = true;
        double toplamFiyat = 0;

        if (kart && urunSayisi >= 10 && urunSayisi > 0) {
            System.out.println((toplamFiyat = urunSayisi * listeFiyati * (0.8)) + "  %20 indirimli");
        } else if (kart && urunSayisi < 10&& urunSayisi>0) {
            System.out.println((toplamFiyat = listeFiyati * urunSayisi * (0.85)) + " %15 indirimli");
        } else if (!kart && urunSayisi >= 10 && urunSayisi>0) {
            System.out.println((toplamFiyat = listeFiyati * urunSayisi * (0.85)) + "  kartsiz %15 indirim");

        } else if (!kart && urunSayisi <10&& urunSayisi>0) {
            System.out.println((toplamFiyat = listeFiyati * urunSayisi * (0.9)) + "  kartsiz %10 indirim");


        }else {
            System.out.println("gecersiz giris");
        }

    }
}