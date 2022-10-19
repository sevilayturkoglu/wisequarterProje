package ders01_programlamayaGiris;

public class C02_Variables {

    public static void main(String[] args) {
        int say=111;
        System.out.println("hello java");

        System.out.println(say);
        int not,not1,ort;//buraya toplu deklare ettim
        not=50;//nota deger atadim
        System.out.println(not);
       not=60;//nota yeni deger atadim
        System.out.println(not);
        not=(not+20)/2;//nota yeni deger
        System.out.println(not);
         not1=70;
        System.out.println((not+not1)/2);//iki notun ortalamasini hesapladim
         ort=(not + not1)/2;//notlari kullanarak ortalama hesapladim ve bunu deger olarak atadim
        System.out.println(ort);

//stack memory:primitiv data turleri ve tum referanslar tutulur.Or: int a= 2; or: String str;
  //heap memory:non primitive data turlerinin degerleri tutulur
    }
}
