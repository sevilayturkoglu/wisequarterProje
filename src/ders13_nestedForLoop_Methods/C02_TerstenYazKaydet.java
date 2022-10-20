package ders13_nestedForLoop_Methods;

public class C02_TerstenYazKaydet {
    public static void main(String[] args) {

        //STRINGIN TERSINI KAYDEDEREK YAZDIRMA ONEMLI
        String input="Java";
        String ters="";

        for (int i=input.length()-1;i>=0;i--){
          //  ters=ters+input.substring(i,i+1);//son harfi alir ve bir oncekine ekler
            ters+=input.substring(i,i+1);//yukarida yazdigimizla ayni islem
            //ters+=input.charAt(i);//ayni islemin charAt le yapilisi
            System.out.println(ters);
        }
        System.out.println(ters);

        System.out.println(input.substring(2, 3));// v harfi gelir.burada baslangic ve bitisini yazarak string aliyoruz
        System.out.println(input.substring(0));// java yazar baslangictan sona kadar tum stringi alir
        System.out.println(input.substring(1, 3));//av yazar
    }
}
