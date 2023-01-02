package rewiew2;

import java.util.Arrays;

public class Soru_7_Arrays {
    public static void main(String[] args) {
/*
stringinizi heySiri den baySiri ye cevirin
 */
        String hey="heySiri";
        String bay="baySiri";
        //1.cozum
        hey=hey.replace("hey","bay");
        System.out.println(hey);


        //2.cozum
        String []heya=hey.split("y");
        String[]beya=bay.split("S");
        System.out.println(Arrays.toString(heya));
        System.out.println(Arrays.toString(beya));
        bay=(beya[0]+heya[1]);
        System.out.println(bay);


    }
}
