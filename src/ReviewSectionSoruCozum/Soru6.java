package ReviewSectionSoruCozum;

public class Soru6 {
    public static void main(String[] args) {
        /*
        kullanicidan alacaginiz string de bos karakter bulunup bulunmadigini,veya stringin icinin bos olup olmadigini kontrol et
         */
        String bosMu=" ";
        System.out.println(bosMu.isEmpty());//false.cunki bos degil bosluk karakteri var
        System.out.println(bosMu.isBlank());//true
        if(bosMu.contains(" ")){
           System.out.println("stringiniz de bosluk karakteri var");//bu calisir
       }else{
           System.out.println("stringinizde bosluk yok");
       }
    }
}
