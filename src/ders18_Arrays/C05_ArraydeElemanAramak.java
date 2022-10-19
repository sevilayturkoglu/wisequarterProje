package ders18_Arrays;

public class C05_ArraydeElemanAramak {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,4,4,5,2,6,7,4,3,3,5,1,3,9};
        int arananEleman=2;
       arananElement(arr,arananEleman);

    }public static void arananElement(int[]arr,int arananEleman){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arananEleman){
                count++;
            }
        }if(count==0){
            System.out.println("aranan eleman array icinde yoktur");
        }else{
            System.out.println("aradiginiz eleman olan  "+ +arananEleman + " array icinde " + count + "  kere gecmektedir");
        }
    }
}
