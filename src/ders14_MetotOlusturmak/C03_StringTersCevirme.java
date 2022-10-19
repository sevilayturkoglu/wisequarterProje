package ders14_MetotOlusturmak;

public class C03_StringTersCevirme {
    //parametre olarak bir string al ters cevirerek yeniden main metoda donduren metot yaz
    public static void main(String[] args) {
        String input="Hey Java naber";

        System.out.println(stringiTersCevir("nasilsin"));
        System.out.println(stringiTersCevir(input));
    }public  static String stringiTersCevir(String input){
       String ters="";
       for(int i=input.length()-1;i>=0;i--){
           ters+=input.charAt(i);
       }
        return ters;
    }
}
