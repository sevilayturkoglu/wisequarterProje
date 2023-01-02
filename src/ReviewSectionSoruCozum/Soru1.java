package ReviewSectionSoruCozum;

public class Soru1 {
    public static void main(String[] args) {
        /*
        girilen string icinde xyz var ise true yok ise false donduren bir metot yaz
         */
        String str = "xyzmiyim";
        System.out.println(varMi(str));
    }

    public static boolean varMi(String str) {
   boolean bl=true;
        String str1 = "xyz";
        if (str.contains(str1)) {
           bl=true;
        } else {
            bl=false;
        }return bl;
    }

}
