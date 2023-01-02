package rewiew2;

public class Soru_13_2dArrray {
    public static void main(String[] args) {
        //2d arraydaki cift sayilari toplayan metot yapin
        int[][]arri={{9,2,3},{6,5,5},{2,1,3}};
int top=0;
        for (int i = 0; i < arri.length; i++) {
            for (int j = 0; j <arri[i].length ; j++) {
             if(arri[i][j]%2==0){
                 top+=arri[i][j];
             }
            }
        }
        System.out.println(top);
    }
}
