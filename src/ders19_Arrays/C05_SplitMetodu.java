package ders19_Arrays;

import java.util.Arrays;

public class C05_SplitMetodu {
    public static void main(String[] args) {
        //split metodu bir stringi istedigimiz yerden boler parcalara ayirir ve yeni bir array haline getirir

        String str="java cok cok guzeldir arkadaslar";
        String[]strArray= str.split(" ");//stringimizi bosluklaradan bolduk strArray Arrayinin icine attik
        System.out.println(Arrays.toString(strArray));//[java, cok, cok, guzeldir, arkadaslar]
        System.out.println(strArray.length);

        //ORNEK SORU
        //str Stringinde kac tane a var
        //1.yontem
        String[]strArray1= str.split("a");//her a bir array oldu
        System.out.println(Arrays.toString(strArray1));//[j, v,  cok cok guzeldir , rk, d, sl, r] haline geldi
        int aSayisi=strArray1.length-1;
        System.out.println(aSayisi);//6 yazdi yani olusan array elemani sayisi ile a sayisi ayni oldu

        //2.yontem
        String[]str2=str.split("");//her harfi arrayin bir elemani haline getirdik
        int count=0;
        for(int i=0;i<str2.length;i++){

            if(str2[i].equals("a")){



                count++;
            }
        }
        System.out.println(count);//6 yazar ,iki yontem de dogru

    }
}
