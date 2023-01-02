package rewiew2;

import java.util.Arrays;

public class Soru_14_2dArray {
    public static void main(String[] args) {
        //verilen cumledeki bosluklar haric karakter sayisini bulunuz
        //1.yol
        String str="Ali okula gitti";
        str=str.replace(" ","");
        System.out.println(str.length());

        //2.yol
        String []arr=str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
