package ders19_Arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMetodu {
    public static void main(String[] args) {
        //asagidaki arraye eleman olarak istenen elemani  ekleyelim bunu yapacak donusumu olan metot olusturalim
        int[]abc={3,5,8,9};
        int eklenecekEleman=1;
       abc= arrayElementEkle(abc,eklenecekEleman);
        System.out.println(Arrays.toString(abc));
    }public  static int[] arrayElementEkle(int[]eklenecekArr,int eklenecekEleman){
        int[]arr=new int[eklenecekArr.length+1];
        for(int i=0;i<eklenecekArr.length;i++){
            arr[i]=eklenecekArr[i];

        }arr[arr.length-1]=eklenecekEleman;

        return  arr;
    }
}
