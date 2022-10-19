package ders11_StringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kullanicinin girdigi metindeki harfler haric tum karakterleri atin,bosluklar kalsin

        String str="Ja5v*a   c/o6k t4$atli";
        str=str.replaceAll("\\d","");//Jav*a   c/ok t$atli  rakamlar gitti
      str= str.replace(" ","5");// Jav*a555c/ok5t$atli bosluk yerine 5 geldi
       str=str.replaceAll("\\W","");// Java555cok5tatli   harf veya rakam olmayan hersey gitti
      str=str.replaceAll("\\d"," ");//Java   cok tatli   rakamlar gitti
       str=str.replaceAll("\\s+"," ");// Java cok tatli  yan yana cok olan boslugu teke indirir
        System.out.println(str);

    }
}
