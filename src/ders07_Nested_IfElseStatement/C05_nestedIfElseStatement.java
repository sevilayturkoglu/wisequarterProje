package ders07_Nested_IfElseStatement;

public class C05_nestedIfElseStatement {
    public static void main(String[] args) {
        //kullanicidan aldigi urun adedi ve liste fiyati alin
        //musteri karti olup olmadigini sorun
        //musteri karti varsa 10 veya daha fazla urun aldiysa %20 indirin 10 dan daha az urun aldiysa %15 indirim yapin
        // karti yoksa 10 ve daha fazla urun aldiysa %15,10 dan daha az urun aldiysa %10 indirim yapin
        double listeFiyati = 12.5;
        int urunSayisi = 0;
        boolean kart = false;
        double toplamFiyat = 0;

        //kartin olup olmadigina gore kategorize et
        if(kart){// kart var
            if (urunSayisi<0){
                System.out.println("hatali urun sayisi");
            } else if (urunSayisi>=10) {
                toplamFiyat=urunSayisi*listeFiyati*0.8;
                System.out.println("%20 indirimli fiyat  " + toplamFiyat);
            }else {
                toplamFiyat=urunSayisi*listeFiyati*0.85;
                System.out.println("%15 indirimli fiyat  " + toplamFiyat);
            }
        }
        else{//kart yok
            if (urunSayisi<0){
                System.out.println("hatali urun sayisi");
            } else if (urunSayisi>=10) {
                toplamFiyat=urunSayisi*listeFiyati*0.85;
                System.out.println("%15 indirimli fiyat  " + toplamFiyat);
            }else {
                toplamFiyat=urunSayisi*listeFiyati*0.9;
                System.out.println("%10 indirimli fiyat  " + toplamFiyat);
            }
        }
    }
}
