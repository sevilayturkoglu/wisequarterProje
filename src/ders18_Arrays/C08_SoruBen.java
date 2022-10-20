package ders18_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class C08_SoruBen {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=6;
        arr[1]=7;

        int istek=4;
        System.out.println(Arrays.toString(arr));//eski arrayimiz
arr=eklemeliArray(arr,istek);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] eklemeliArray(int[]arr,int istek){
        arr[2]=istek;
        return arr;
    }
}
