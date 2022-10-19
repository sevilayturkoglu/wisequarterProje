package ders10_stringManipulasyon;

public class C09_Soru {
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
        int ilk=cumle.indexOf(metin);
        int son=cumle.lastIndexOf(metin);


        if(cumle.lastIndexOf(metin)==(-1)){
            System.out.println("cumle metini icermiyor");
        }else if(ilk==son){
                System.out.println("cumle metni bir kez iceriyor");

            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }
    }

