package rewiew2;

public class Soru_10_2dArrays {
    public static void main(String[] args) {
        /*
        iki arrayin elemanlarinin toplamini bulunuz
       */
        int[][] arr1 = {{5, 6, 5}, {7, 4, 3}, {7}};
        int[][] arr2 = {{16, 14, 7}, {9, 3, 2}, {9}};
        int top1 = 0;

        top1=arrayTopla(arr1)+arrayTopla(arr2);
        System.out.println(top1);
    }

    public static int arrayTopla(int[][] arr1) {
        int top = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                top += arr1[i][j];
            }
        }return top;
       /* System.out.println(top);
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j <arr2[i].length ; j++) {
                    top1+=arr2[i][j];
                }
        }
        System.out.println(top1);*/

    }

}