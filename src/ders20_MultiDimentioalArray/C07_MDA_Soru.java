package ders20_MultiDimentioalArray;

import java.util.Arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {
        //verilen iki katli arrayde ayni indexe sahip elemanlari toplayip yeni bir array olusturun
        //int[][] arr={{3,4,5}{2,3,6,7}}; 3+2=5   4+3=7  5+6=11
        //  int[] yeni={5,7,11};gibi

        int[][] arr={{3,4,5},{2,3,6,7}};
        int arraySize=arr[0].length<arr[1].length ? arr[0].length :arr[1].length;//yeni arrayimizi olustururken
        // elemani az olan indexin lengtine gore hareket etmeliyiz ,bu islemle lengti kucuk olani tespit ettik
        System.out.println(arraySize);
        int[]yeniArr=new int[arraySize];//toplamlari icine atacagimiz arrayi olusturduk
        for (int i = 0; i <yeniArr.length ; i++) {
            yeniArr[i]=arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(yeniArr));//[5, 7, 11]
    }
}