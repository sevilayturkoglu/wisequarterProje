package ders06_If_ElseStatement;

public class C10_IfElseIfStatement {
    public static void main(String[] args) {
        //kullanicidan cinsiyet ve yas al
        //erkek ise 65 uzeri emekli olur
        //kadin 60 yas uzeri emekli olur
        //emekli olmak icin  ....yil daha calisman lazim yazdir
        char cins='E';
        int yas=62;
        if (cins=='E'&& yas>=65 ){
            System.out.println("emekli olursun");
        } else if(cins=='E'&& yas<65 && yas>15) {
            System.out.println("emekli olman icin  " + (65 - yas) + " yil calisman lazim");
        }else if (cins=='K'&& yas>=60){
            System.out.println("emekli olursun");
        }else if (cins=='K'&& yas<60  && yas>15){
            System.out.println("emekli olman icin  " + (60 - yas) + " yil calisman lazim");
        }else{
            System.out.println("gecersiz giris");
        }
    }
}
