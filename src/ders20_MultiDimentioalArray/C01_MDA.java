package ders20_MultiDimentioalArray;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        int[][] arr={{4,3,2},{1,2},{5,6,7},{3,6,8,0}};
        System.out.println(arr.length);//5 array icinde inner array 5 tane array var
        System.out.println(arr[2].length);
        System.out.println(arr[2]);//elemanlari yazmaz referans olan [I@568db2f2 yazar
        System.out.println(Arrays.toString(arr[2]));//[5, 6, 7] yazar

        //Tum arrayi yazdirmak icin
        System.out.println(Arrays.deepToString(arr));//[[4, 3, 2], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]] tum arrayi yazar


    }
}
