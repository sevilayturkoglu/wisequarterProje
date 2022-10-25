package ders20_MultiDimentioalArray;

public class C04_MDA_CiftSayiAdedi {
    //Verilen MDA daki cift sayi adedini bulunuz
    public static void main(String[] args) {
        int [][]arr={{4,6},{3,5,8},{1,0,4}};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
