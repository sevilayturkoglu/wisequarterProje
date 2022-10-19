package ders14_MetotOlusturmak;

public class C04_Tekrar {
    public static void main(String[] args) {
        //asagidaki iki sayinin yeni kod yazmadan carpimini bul

        int a=10;
        int b=20;
        System.out.println(C01_Carpim.carpimMetodu(a, b));//daha once olusturdugumuz C01 clasindaki carpim metodunu cagirdik

      //yeni cod yazmadan String birlestirme yapalim
        String c="Nasilsin";
        String d="oglum";
        System.out.println(C02_String_Concate.birlestirmeMetodu(c, d));//birlestirme metodunu cagirdik

        //yeni kod yazmadan asagidaki stringi tersten yazalim
        String str ="sevilay";
        System.out.println(C03_StringTersCevirme.stringiTersCevir(str));

        System.out.println(C03_StringTersCevirme.stringiTersCevir("bunu ters cevir"));

    }
}
