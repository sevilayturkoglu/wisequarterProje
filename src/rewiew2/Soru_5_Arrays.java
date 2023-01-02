package rewiew2;

import java.util.Arrays;

public class Soru_5_Arrays {
    public static void main(String[] args) {
        /*
        verilen bir int arrayin elemanlarinin karelrini bulun
         */
        int[] arri={2,3,4};
        for (int i = 0; i < arri.length; i++) {
            arri[i]=arri[i]*arri[i];

        }
        System.out.println(Arrays.toString(arri));
    }
}