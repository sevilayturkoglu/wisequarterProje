package ders13_nestedForLoop_Methods;

public class C05_NestedForLoop_Ornek {
    public static void main(String[] args) {
        /*
                              1    //i yi yazdirdigimizda bu sekil cikar j yazdirdigimizda solda ki sekil cikar
                              2 2
                              3 3 3
                              4 4 4 4
          1                   5 5 5 5 5
          12
          123
          1234
          12345
          yazdir
        */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
