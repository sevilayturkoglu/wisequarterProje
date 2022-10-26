package ders20_MultiDimentioalArray;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}; output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int [] arrTop=new int[arr.length];
        int top=0;
        for (int i= 0; i <arr.length ;i ++) {
            top=0;//her dongude toplam yeniden sifirlansin diye yaptik
            for (int j = 0; j < arr[i].length; j++) {
                top+=arr[i][j];
            }arrTop[i]=top;//her dongu sonrasi toplami buraya array icine atip sakladik,
            // yeni dongu baslarken de toplami sifirladik 14.satir

        }
        System.out.println(Arrays.toString(arrTop));
    }

    }

