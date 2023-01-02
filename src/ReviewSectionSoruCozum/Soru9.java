package ReviewSectionSoruCozum;

public class Soru9 {
    public static void main(String[] args) {
        /*
       Bir string de ki tekrar eden karakterleri yazdirmayan bir kod yaziniz
         */
        String str = "aaabbabakkajall";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {

          /* if(!str2.contains(String.valueOf(str.charAt(i)))){
            str2=str2+String.valueOf(str.charAt(i));*/

            if (!str2.contains(str.substring(i, i + 1))) {
                str2 = str2 + str.substring(i, i + 1);
            }
        }System.out.println(str2);

    }

}