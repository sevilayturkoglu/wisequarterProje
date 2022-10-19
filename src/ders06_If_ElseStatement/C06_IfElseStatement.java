package ders06_If_ElseStatement;

public class C06_IfElseStatement {
    public static void main(String[] args) {
        int not = 45;
        if (not >= 50) {
            System.out.println("sinifi gectin");
            System.out.println("yazin kafan rahat");
        } else {
            System.out.println("sinifta kaldin");
            System.out.println("yaz okuluna bekleriz");
        }

        //if else parantezleri olmasaydi eger ne olurdu
        //parantez yoksa java sadece her bir statementin istenen duruma gore sadece ilk satirini yazar ikinci satiri yazmaz

        int not1 = 55;
        if (not1 >= 50)
            System.out.println("sinifi gectin");
           // System.out.println("yazin kafan rahat");//bu satir kalirsa java hata verir kod calismaz
        else
            System.out.println("sinifta kaldin");

            System.out.println("yaz okuluna bekleriz");//bu satiri if elseden ayri gorur her durumda yazar

    }
}