package ders13_nestedForLoop_Methods;

public class C01_TerstenYazmaIntrwiew {
    public static void main(String[] args) {
//STRINGIN TERSINI KATDETMEDEN YAZDIRMA
        String input = "Java guzel";
        for (int i = input.length()-1; i >= 0; i--) {

            System.out.print(input.charAt(i));
        }
    }
}