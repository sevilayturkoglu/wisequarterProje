package ders18_Arrays;

public class C04_Arrays_Soru {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
        int []arr={2,5,-3,-7,8};
        int top=0;

        System.out.println(topllaaa(arr,top));
    }
    public  static int  topllaaa(int[]arr,int top){

        for(int i=0;i<arr.length;i++){
            if (arr[i]>=0) {
                top+=arr[i];
            } //System.out.println(top);
        }return top;


    }
}
