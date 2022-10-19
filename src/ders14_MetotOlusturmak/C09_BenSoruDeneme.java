package ders14_MetotOlusturmak;

public class C09_BenSoruDeneme {
    public static void main(String[] args) {

        String input="Java ne kadar guzel";
        int baslangicIndex=5;
        int bitisIndex=8;

        kendiSubStringMetodumuz(input,baslangicIndex,bitisIndex);//onceki metotta sout yapmadigimiz icin burada yapiyoruz yoksa metot sonucu yazmaz
        kendiSubStringMetodumuz("sevilay turkoglu",3,9);
        System.out.println(kendiSubStringMetodumuz("Enes", 1, 4));
    }public static String kendiSubStringMetodumuz( String input,int baslangicIndex,int bitisIndex){
        String yeniInput="";
        if(baslangicIndex>bitisIndex){
            System.out.println("baslangic indexi bitis indexinden buyuk olamaz");
        } else if (bitisIndex>input.length()) {
            System.out.println("bitis indexi string sinirlari disinda");

        }else{
            for (int i=baslangicIndex;i<bitisIndex; i++){
               yeniInput=yeniInput + (input.charAt(i));
            }
           // System.out.println(yeniInput);

        }return yeniInput;
    }
}
