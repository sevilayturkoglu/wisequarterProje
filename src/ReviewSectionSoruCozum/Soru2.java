package ReviewSectionSoruCozum;

public class Soru2 {
    public static void main(String[] args) {
        /*
        name1 ve name2 variabellarini olustur name1 uzunlugu cift sayi ise ortasina name2 yi yerlestir
        name1 uzunlugu tek sayi ise ,tek sayili oldugu icin yerlestiremedik yaz
         */

        String name1="Sevilaylar";
        String name2="Ahmet";

        if(name1.length()%2==0){
            String yeniName="";
            yeniName=name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2);
            System.out.println(yeniName);

        }else{
            System.out.println("name1 karakter sayisi tek oldugu icin yerlestiremedik");
        }
    }
}
