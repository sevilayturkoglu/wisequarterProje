package ders18_Arrays;

public class C04_ArraysElemanlariniToplama {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
        int []arr={2,5,-3,-7,8};


        System.out.println(topllaaa(arr));
    }
    public  static int  topllaaa(int[]arr){
        int top=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>=0) {
                top+=arr[i];
            } //System.out.println(top);
        }return top;


    }
}
