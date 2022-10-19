package ders05_Concatination_Operation;

public class C03_Relational_Esitlik_karsilastirma {
    public static void main(String[] args) {
        //javada iki degerin esitligini == ifadesiyle kontrol ederiz ve sonuc boolean olarak yani true false cikar

        int a=10;
        int b=15;
        System.out.println(a == b);

        boolean c;
        System.out.println(c = 15 == b);//true olur burada boolean c ye deger atadik c artik true
        c=12*a==10*b;
        System.out.println(c);//burada c ye yeni deger verdik artik false

        //Java da != esit degildir isareti yine sonuc boolean dir
        // !true false anlamina gelir, !(5==5) false dir,5!=5 false dir
        System.out.println(a != b);//true
        System.out.println(a != b - 5);//false cikar cunki esit

        System.out.println(c = 15 != b);// c ye false degerini atadik
        System.out.println(c = a * 3 == b * 2);// c ye tekrar true degerini atadik
    }
}
