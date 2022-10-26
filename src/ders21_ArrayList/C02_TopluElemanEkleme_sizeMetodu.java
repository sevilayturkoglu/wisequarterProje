package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme_sizeMetodu {
    public static void main(String[] args) {
        //var olan listeye toplu eleman nasil eklernir.
        List<String> sesliHarfler=new ArrayList<>();
        String[] ses={"a","e","i","o","u"};
        for (int i=0;i< ses.length;i++){
            sesliHarfler.add(ses[i]);//ses deki elemanlari for dongusu ile listimize ekledik
        }
        System.out.println(sesliHarfler);


        // .size methodu bize listimizin uzunlugunu verir
        System.out.println(sesliHarfler.size());//5

        // .isEmpty metodu listin bos olup olmadigini kontrol eder
        System.out.println(sesliHarfler.isEmpty());//false cunki ici dolu
    }
}
