package ders10_stringManipulasyon;

public class C07_Soru {
    public static void main(String[] args) {
        /*
        kulanicidan metin alin
        sonra bir cumle alin
        1-metin cumleyi icermiyor
        2-cumle metni bir kez iceriyor
        3-cumle metni birden fazla iceriyor
        yazdirin
         */
        String cumle = "Java cok guzeldir cok";
        String metin = "guzeldir";

        if (cumle.indexOf(metin) == -1) { // (!cumle.contains(metin)) seklinde de yazardik cumle metin icermiyor anlamina gelirdi
            System.out.println("cumle metni icermiyor");
        } else {
        int ilk = cumle.indexOf(metin);
        int ikinci = cumle.indexOf(metin, ilk + 1);
        if(ikinci==(-1)){
            System.out.println("metni bir kez icerir");

        }else{
            System.out.println("metni cok kez icerir");
        }
        }

    }

}