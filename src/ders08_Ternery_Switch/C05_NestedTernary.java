package ders08_Ternery_Switch;

public class C05_NestedTernary {
    public static void main(String[] args) {
        //ORNEK Nested Ternary
        //iki tam sayi al
        //sayi pozitif ise, cift sayi veya cift sayi degil  seceneklerini yazdir
        //sayi pozitif degilse uc basamakli veya uc basamakli degil seceneklerini yazdir
         int sayi=-10000;
         if (sayi>0){
             System.out.println(sayi % 2 == 0 ? "cift sayi" : "cift sayi degil");

         }else{
             System.out.println(sayi < -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil ");

         }//yukarida ki if else ternary ile cozum
        //asagidaki sadece ternary ile cozum

         String sonuc=sayi>0
                      ?
                      sayi%2==0 ? "cift sayi" : "cift sayi degil"
                      :
                      sayi < -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil ";//yan yana da yazilabilir ama cok karisik gorunur

        String sonuc1=sayi>0 ? sayi%2==0 ? "cift sayi" : "cift sayi degil" : sayi < -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil ";
    }
}
