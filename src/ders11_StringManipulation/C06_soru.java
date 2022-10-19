package ders11_StringManipulation;

public class C06_soru {
    public static void main(String[] args) {
        /*kullanicidan cumle al
        *cumle de ev geciyorsa  home sweet home yazdir
        * cumlede is geciyorsa calismak guzeldir yazdir
        * ikisi de geciyorsa hem ev lazim hem is yazdir
        * hicbirisi gecmiyorsa cok calisman lazim yazdir
         */
        String cumle="geldim kedi coktu";
        cumle=cumle.toLowerCase();
        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println(" hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home sweet home");

        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("cok calisman lazim");
        }
    }
}
