package ders20_MultiDimentioalArray;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        //her bir inner arrayin son elementlerinin toplamini yazdiran bir metot olusturun
        int [][]arr={{4,6},{3,5,8},{1,0,4}};
        int top=0;
        SonElementToplam(top,arr);
    }public  static void SonElementToplam(int top,int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            top+=arr[i][arr[i].length-1];

        }
       System.out.println(top);
    }
}
