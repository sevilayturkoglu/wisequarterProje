package ders07_Nested_IfElseStatement;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        //kullanicidan cinsiyet ve yas al
        //erkek ise 65 uzeri emekli olur
        //kadin 60 yas uzeri emekli olur
        //emekli olmak icin  ....yil daha calisman lazim yazdir


        //cinsiyete gore kategorize edelim
        char cins='E';
        int yas=60;
        if (cins=='k'||cins=='K'){
            if (yas<15){
                System.out.println("hatali yas girisi");
            } else if (yas>=60) {
                System.out.println("emekli olabilirsin");

            }else{
                System.out.println("emekli olmak icin  " + (60 - yas) + " yil calisman lazim");
            }

        } else if (cins=='e'||cins=='E') {
            if (yas<15){
                System.out.println("hatali yas girisi");
            } else if (yas>=65) {
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olmak icin  " + (65 - yas) + " yil calisman lazim");
            }

        }else {
            System.out.println("yanlis cinsiyet girisi");
        }
    }
}
