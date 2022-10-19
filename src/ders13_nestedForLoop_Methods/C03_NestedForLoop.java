package ders13_nestedForLoop_Methods;

public class C03_NestedForLoop {

    public static void main(String[] args) {
//1 den 4 e kadar sayilari carpim tablosu halinde yazin
        for (int i = 1; i <= 4; i++) {//satirlari yapar
            for (int j=1;j<=4;j++){//satirlarin icini doldurur
                System.out.print(i * j+" ");

            }
            System.out.println("");

        }
    }
}