package ders05_Concatination_Operation;

public class C04_LocicalOperator_And_Ve {
    //&& and dir ve .sonuc booleandir .icinde bir tane false varsa sonuc false dir.
    // mukemmelliyetcidir carpmada "0"gibidir bir tane 0 yani false varsa sonuc false dir.
    //&& ve & arasinda ki fark ise && tek false buldugunda  devamina bakmaz sonuc false verir Oysa & devamina da bakar
    // && daha hizlidir
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println(a > b && b > 0);//biri false biri true sonuc false
        System.out.println(b > a && a > 5);// true true=true
        System.out.println(a > b && b < 0); //false false =false
    }
}
