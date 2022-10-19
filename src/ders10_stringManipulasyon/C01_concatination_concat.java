package ders10_stringManipulasyon;

public class C01_concatination_concat {
    public static void main(String[] args) {
        //stringleri birlestirme veya stringleri diger data turleriyle birlestirme
        String str1="Java";
        String str2="Guzeldir";
        boolean bl=true;
        int sayi=20;
        double dbl=3.45;
        System.out.println(str1 + "  " + str2);//Java Guzeldir yazar
        System.out.println(str1 + bl + sayi);// Javatrue20     basta string oldugu icin yan yana hepsini birlestirir

      //  System.out.println(bl + sayi); error boolean ve sayiyi birlestirmez
        System.out.println(sayi + dbl);//sonuc double cinsinden 23..45 cikar

        //CONCAT (sadece stringleri birlestirir)

       // System.out.println(str2.concat(bl)); hata verir cunki concat string ile booleani birlstirmez
      //  System.out.println(str2.concat(sayi));hata string ile int gibi primitive data birlesmez
        System.out.println(str1.concat(" ").concat(str2));//arada bir boslukla str1 ve str2 birlestirilir


    }
}
