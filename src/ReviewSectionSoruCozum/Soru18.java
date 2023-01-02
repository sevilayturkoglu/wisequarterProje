package ReviewSectionSoruCozum;

public class Soru18 {
    public static void main(String[] args) {
        /*
        stringde bulunan sesli harfleri al yeni stringe ekle*/

        String karisik="aaeekkileeeeu";
        String sesli="aeiou";
        String sesliBen="";

        //bu for dongusu ile karisigin icindeki tum sesli harfleri tekrarli sekilde aldik aaeeieeeeu yazdi
     /* for (int j = 0; j < karisik.length(); j++) {
           for (int i = 0; i < sesli.length(); i++) {
               if (karisik.substring(j, j + 1).contains(sesli.substring(i, i + 1))) {
                   sesliBen += sesli.substring(i, i + 1);
               }
           }
       }System.out.println(sesliBen);*/

//Bu for dongusu ile karisigin icindeki sesli harfleri tekrar etmeden aldik  aeiu seklinde
        /*  for (int j = 0; j < sesli.length(); j++) {
            if (karisik.contains(sesli.substring(j, j + 1))) {
                sesliBen += sesli.substring(j, j + 1);

            }

        }System.out.println(sesliBen);*/


//         Bu for ile tektrar eden harfleri kaldirdik   aekilu yazdi
              for (int i = 0; i <karisik.length() ; i++) {
            if(!sesliBen.contains(karisik.substring(i,i+1)) ){
                //!sesliBen.contains(""+karisik.charAt(i) if icine boyle de yazabilirdik
               sesliBen+=karisik.charAt(i);

            }

            }
            System.out.println(sesliBen);

    }
}