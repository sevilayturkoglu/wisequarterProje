package ders20_MultiDimentioalArray;

public class C05_MDA_SayilarinCarpimi {
    public static void main(String[] args) {
        //sayilarin carpimini bize donduren bir metod olustur
        int[][] arr = {{4, 6}, {3, 5, 8}, {1, 4}};
        int carpim = 1;
        System.out.println(carpSonuc(1, arr));

    }

    public static int carpSonuc ( int carpim ,int[][] arr){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    carpim *= arr[i][j];
                }
            }return carpim;

        }
    }
