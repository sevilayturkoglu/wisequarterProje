package ders14_MetotOlusturmak;

public class C05_SubstringOlustur {
    public static void main(String[] args) {
        //input olarak string al.baslangic ve bitis indexlerine gore baslangic indexi dahil,bitis indexi haric olacak sekilde
        //oradaki harfleri yazdiran bir metot olustur
        //-kullanici baslangic degeri olarak ,bitis degerinden buyuk bir sayi girerse ,hata mesaji verin
        //-kullanici string de olan indexlerden daha buyuk bir index girerse hata mesaji yazdirin
        String input="Java ne kadar guzel";
        int baslangicIndex=5;
        int bitisIndex=20;

        kendiSubStringMetodumuz(input,baslangicIndex,bitisIndex);//onceki metotta sout yapmadigimiz icin burada yapmaliydik yoksa metot sonucu yazmaz
        kendiSubStringMetodumuz("sevilay turkoglu",3,9);
    }public static void kendiSubStringMetodumuz( String input,int baslangicIndex,int bitisIndex){
        if(baslangicIndex>bitisIndex){
            System.out.println("baslangic indexi bitis indexinden buyuk olamaz");
        } else if (bitisIndex>=input.length()) {
            System.out.println("bitis indexi string sinirlari disinda");

        }else{
            for (int i=baslangicIndex;i<bitisIndex; i++){
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }
    }
}
