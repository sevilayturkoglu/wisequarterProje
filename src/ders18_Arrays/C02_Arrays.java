package ders18_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[]str={"Ali","Veli","Nisa"};
        //yazdiralim
        for (int i=0;i<str.length;i++){
            System.out.print(str[i] + " ");
        }
        System.out.println("");
        System.out.println(str);//[Ljava.lang.String;@2d98a335 yzar,arrayi yazmaz ,array non primitive yani obje oldugu icin sadece memorydeki adresini yazar

        //Arrayi array listesi halinde nasil yazdirabilirim
        System.out.println(Arrays.toString(str));//[Ali, Veli, Nisa] seklinde yazar.Arrays klasindan bir metottan faydalandik
    }
}
