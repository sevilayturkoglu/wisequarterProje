package ders18_Arrays;

import java.util.Arrays;

public class C03_ArrayElemanlariniArttirma {
    public static void main(String[] args) {
        //verilen bir arrayin elemanlarinin degerlerini 2 arttirip bize donduren metot yapin
        // eski arrayi yeni array halinde kaydedin
       int []arr={2,4,6,8};
        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8]metot cagirmadan  once yazdigimiz icin eski haliyle yazar
        int []yeniArr=ikiArttir(arr);//metottan gelen arrayi yeni bir array icine attik
        System.out.println(Arrays.toString(yeniArr));//[4, 6, 8, 10]
       System.out.println(Arrays.toString(arr));//[4, 6, 8, 10] metot cagirdiktan sonra yazdirdigimiz icin artmis olarak yazar

       arr=ikiArttir(arr);//metottan gelen arrayi eski arrayimizin icine attik
       System.out.println(Arrays.toString(arr));//[6, 8, 10, 12] ???
        System.out.println(Arrays.toString(arr));
    }public  static int[] ikiArttir(int []arr){
        for (int i=0;i< arr.length;i++){
            arr[i]=arr[i]+2;
        } return arr;
    }
}
