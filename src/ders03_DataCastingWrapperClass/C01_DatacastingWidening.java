package ders03_DataCastingWrapperClass;

public class C01_DatacastingWidening {
    public static void main(String[] args) {
        //javada bazi data turlerini obur data turleriyle degistirebiliriz,ama bazilarini degistiremeyiz
        //ornegin Stringi int e ceviremeyiz
        //ancak ozellikle primitive data turlerinde kucuk data turunu buyuk data turune Java otomotik cevirebili,
        //ancak buyuk data turunu kucuge otomotik cevirmez onu biz yapariz sonra gorecegiz

        int say=10;
        double say1=say;//burada int i doubla java otomotik cevirdi buna data casting de "AUTO WIDENING" denir
        System.out.println(say1);
    }
}
