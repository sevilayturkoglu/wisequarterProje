package ders19_Arrays;

import java.util.Arrays;

public class C06_ArrayaYeniDegerAtama {
    public static void main(String[] args) {
        //1-var olan bir arrayin uzunlugunu degistiremeyiz ama baska bir arrayi deger olarak atayabiliriz
        String[]str={"Ali,Veli"};
        String[]str2={"A","B","C"};
        System.out.println(Arrays.toString(str));//str [Ali,Veli] iken
        str=str2; //str2 yi str ye deger olarak atadik
        System.out.println(Arrays.toString(str));// str artik [A, B, C]

        //2-istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz
        str=new String[6];//6 elemanli bos array degeri atadik
        System.out.println(Arrays.toString(str));//[null, null, null, null, null, null]

        //3-yeni olusturulan arraya{} icinde deger atayabiliriz
        //ancak var olan arraya bunu yapamayiz

      //  str={"g","h"};//java izin vermez hata verir.
    }
}
