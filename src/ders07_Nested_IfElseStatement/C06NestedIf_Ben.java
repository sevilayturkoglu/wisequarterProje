package ders07_Nested_IfElseStatement;

public class C06NestedIf_Ben {
    public static void main(String[] args) {
        //kullanicidan aldigi urun adedi ve liste fiyati alin
        //musteri karti olup olmadigini sorun
        //musteri karti varsa 10 veya daha fazla urun aldiysa %20 indirin 10 dan daha az urun aldiysa %15 indirim yapin
        // karti yoksa 10 ve daha fazla urun aldiysa %15,10 dan daha az urun aldiysa %10 indirim yapin
        double listeFiyati = 12.5;
        int urunSayisi = -5;
        boolean kart = true;
        double toplamFiyat = 0;

        //urun sayisina gore kategorize et
        if (urunSayisi<=0){
            System.out.println("hatali giris");
        }
        else if (urunSayisi>=10) {
            if (kart){
                toplamFiyat=urunSayisi*listeFiyati*0.8;
                System.out.println("%20 indirimli " + toplamFiyat);
            }else {
                toplamFiyat=urunSayisi*listeFiyati*0.85;
                System.out.println("%15 indirimli " + toplamFiyat);

            }
        }
        else {
            if (kart){
                toplamFiyat=urunSayisi*listeFiyati*0.85;
                System.out.println("%15 indirimli " + toplamFiyat);
            }else {
                toplamFiyat=urunSayisi*listeFiyati*0.90;
                System.out.println("%10 indirimli " + toplamFiyat);

            }

        }
    }
}
