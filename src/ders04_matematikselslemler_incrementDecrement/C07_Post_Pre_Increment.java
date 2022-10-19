package ders04_matematikselslemler_incrementDecrement;

public class C07_Post_Pre_Increment {
    public static void main(String[] args) {

                                                                                                //       a                b             c
                                                                                               //     -------            -----         ------

        int a=10;                                                                                  //   10                  -              -


        int b=a++; //burada once anin degeri olan 10 b ye atandi sonra a bir arttirildi            //   11                   10             -


        int c=++b; //burada b nin degeri once bir arttirildi sonra c ye atandi                     //  11                     11              11


        System.out.println("a = " + a + "  b = " + b + "  c =  " + c);



        a=20;
        b=++a;
        c=a++;
        System.out.println("a = " + a + "  b = " + b + "  c =  " + c);


        a=30;
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

    }
}
