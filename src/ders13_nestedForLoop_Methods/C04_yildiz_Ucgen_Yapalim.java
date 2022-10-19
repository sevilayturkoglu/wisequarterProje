package ders13_nestedForLoop_Methods;

public class C04_yildiz_Ucgen_Yapalim {
    public static void main(String[] args) {
        /* * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         */
        for (int i = 1; i <= 4; i++) {//4 satir yapacak
            for (int j = 1; j <= 6; j++) {//her satirda 6 yildiz yapacak
                System.out.print("* ");
            }
            System.out.println("");//her icteki loop bitisinde bir alt satira iner

        }/// yukaridan asagi artan yildiz yapalim
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }System.out.println("");

        //yukaridan asagi azalan yildiz yapalim
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}