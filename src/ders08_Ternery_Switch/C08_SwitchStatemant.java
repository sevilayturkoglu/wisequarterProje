package ders08_Ternery_Switch;

import java.util.Scanner;

public class C08_SwitchStatemant {
    public static void main(String[] args) {
        //kullanicidan ay numarasi al ve mevsimlere gore grupla
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ay numarasi giriniz");
        int ayNo=scan.nextInt();

        /*switch (ayNo) {
            case 12, 1, 2 -> System.out.println("Mevsim Kis");
            case 3, 4, 5 -> System.out.println("Mevsim Ilkbahar");         //boyle de yazilabilir
            case 6, 7, 8 -> System.out.println("Mevsim Yaz");
            case 9, 10, 11 -> System.out.println("Mevsim Sonbahar");
            default -> System.out.println("gecersiz ay adi");
        }*/
        switch (ayNo){
            case 12: case 1: case 2:
                System.out.println("Mevsim Kis");
                break;
            case 3: case 4: case 5:
                System.out.println("Mevsim Ilkbahar");
                break;
            case 6: case 7: case 8:
                System.out.println("Mevsim Yaz");
                break;
            case 9: case 10: case 11:
                System.out.println("Mevsim Sonbahar");
                break;
            default :
                System.out.println("gecersiz ay adi");
        }
    }
}
