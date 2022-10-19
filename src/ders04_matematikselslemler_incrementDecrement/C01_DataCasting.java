package ders04_matematikselslemler_incrementDecrement;

public class C01_DataCasting {
    public static void main(String[] args) {
        int say1=20;
        int sayi2=6;
        System.out.println(say1 / sayi2);//tam bolme olmadigi icin ve data turumuz int oldugu icin sadece tam sayi kismini yazar yani "3"

        double db=6;
        System.out.println(say1 / db);//bolenlerden biri double oldugu icin sonuc double olarak kusuratli cikar
        //Java genis olana gore davranir
    }

}
