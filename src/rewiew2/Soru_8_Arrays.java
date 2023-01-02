package rewiew2;

public class Soru_8_Arrays {
    public static void main(String[] args) {
        /*
        verilen arrayde toplamlari 9 a esit olan sayi ciftlerini yazdiriniz
         */
        int[]arri={5,7,-6,4,2,15,3,8,1};
        for (int i = 0; i < arri.length; i++) {
            for (int j = i+1; j <arri.length ; j++) {
                if(arri[i]+arri[j]==9){
                    System.out.print(arri[i] + " " + arri[j]+"  ;");
                }
            }

            }
        }
    }

