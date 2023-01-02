package rewiew2;

public class Soru_11_2dArray {
    public static void main(String[] args) {
        int[][]arr={{9,2,3},{5,5,5},{2,1,3}};//bu array da ki minimum sayiyi tespit et
        int min=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }


        }System.out.println(min);
    }
}
