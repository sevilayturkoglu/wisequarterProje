package rewiew2;

public class Soru_06_Arrays {
    /*
    bir arrayin elemanlarinin degerlerinin ortalamasini hesplayin
    ve ortalamadan buyuk olan elemanlari yazdir
     */
    public static void main(String[] args) {
        int [] arri={8,7,9,6,4,3,2};
        int top=0;
        int ort=0;
        for (int i = 0; i < arri.length; i++) {
            top += arri[i];
            ort = top / arri.length;

        }
        for (int i = 0; i < arri.length; i++) {
            if (arri[i] > ort) {
                System.out.print(arri[i] + " ");
            }
        }

        System.out.println();
        System.out.println(top);
        System.out.println(ort);
    }
}
