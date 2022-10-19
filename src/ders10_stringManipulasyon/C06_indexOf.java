package ders10_stringManipulasyon;

public class C06_indexOf {
    public static void main(String[] args) {

        // bunu kullanarak metinde olan yazdigimiz stringin indexini verir,metinde yoksa -1 yazar
String str="Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a"));// 9 ilk a harfi 9. indexteymis
        System.out.println(str.indexOf('a'));// 9 char da kabul eder
        System.out.println(str.indexOf("hersey"));//  15 hersey stringi 15.indexten itibaren baslar

        System.out.println(str.indexOf("gul"));// -1 yazar cunki metinde gul stringi yok ONEMLIII


        System.out.println(str.indexOf("e"));// ilk e 3. indexteymis
        //3. indexten sonraki e yi bulalim
        System.out.println(str.indexOf("e", 4));//13 yazar bununla 3. indexteki e den sonra ki e yi bulur .bir sonraki e 13.indexteymis

        //13. indexten sonraki e yi bulalim

        System.out.println(str.indexOf("e", 14));//16 daymis

        //ORNEK  cumledeki 2.c yi yazdiralim
        //once uzun yoldan yapalim
        int ilkIndex=str.indexOf("c");// ilk indeksin kodunu bulup deger atadik
        System.out.println(str.indexOf("c",(ilkIndex)+1));//22 bulduk

//asagidaki de aynisi ama tek satirlisi
        System.out.println(str.indexOf("c") + " "+str.indexOf("c", str.indexOf("c") + 1));//8 22 yan yana yazar
    }
}
