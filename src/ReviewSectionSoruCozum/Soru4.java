package ReviewSectionSoruCozum;

public class Soru4 {
    public static void main(String[] args) {
        /*
        "  Java ogrenmek123 Cok guzel@  " stringini "Java ogrenmek cok guzel" olarak yazdir
         */
        String str= "  Java ogrenmek123 Cok guzel@  ";

      String str1=str.trim().replace("123","").replace("@","");
      str1= str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();
        System.out.println(str1);
    }
}
