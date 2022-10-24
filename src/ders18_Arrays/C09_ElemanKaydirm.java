package ders18_Arrays;

import java.util.Arrays;

public class C09_ElemanKaydirm {
    public static void main(String[] args) {
        //array elemanlarini oteleme
    int []arr={4,5,6,7,8};

       int []yeniyArra=new int[arr.length];

        for(int i=0;i<arr.length-1;i++){//
            yeniyArra[i+1]=arr[i];


        }yeniyArra[0]=arr[arr.length-1];
       System.out.println(Arrays.toString(yeniyArra));
//      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//ikinci cozum hocanin yaptigi
      /*  int[] arr1 = {4, 5, 6, 7};

        arr1=kaydirma(arr1);
        System.out.println(Arrays.toString(arr1));// 7 4 5 6 yazar

    }

    public static int[]kaydirma(int[] arr1){

       int bosKova=arr1[arr1.length-1];
       for (int i = arr1.length -2;i>=0 ; i--) {
           arr1[i + 1] = arr1[i];

       }arr1[0]=bosKova;

        return arr1;*/
    }
}