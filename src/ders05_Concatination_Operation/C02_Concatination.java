package ders05_Concatination_Operation;

public class C02_Concatination {
    public static void main(String[] args) {
        String s1="java";
        String s2="guzeldir";
        String s3="";
        String s4=" ";

        int sayi1=4;
        int sayi2=3;

        //variabillari kullanarak java guzeldir7 yaz
        System.out.println(s1 + s4 +s2+(sayi1 + sayi2));

        //java guzeldir 12 yaz
        System.out.println(s1 + s4 + s2 + sayi1 * sayi2);

        //7java guzeldir yaz
        System.out.println((sayi1 + sayi2) + s1 + s4 + s2);//alttaki ile bu ayni seyi yazar cunki java once parantez isini yapar ayni zamanda soldan baslar
        System.out.println(sayi1 + sayi2 + s1 + s4 + s2);

        //34 java yaz
        System.out.println(s3 + sayi2 + sayi1 + s1);//basa bos string koyduk(s3 bos stringimiz) bos stringi iki sayi arasina da koyabilirdik ayni sey

        //java7 guzeldir43 yaz
        System.out.println(s1 + (sayi1 + sayi2) + s4 + s2 + sayi1 + sayi2);

    }

}
