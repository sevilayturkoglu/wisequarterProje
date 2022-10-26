package ders22_ArrayList;

public class C04_ForEach_Loop {
    public static void main(String[] args) {
        int []arr={3,5,7,8,4,2,6,9,6,4,5};
    //bu array deki 5 den buyuk elemanlari toplayalim
    //once normal for ile yapalim
        int top=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>5){
                top+=arr[i];
            }

        }System.out.println(top);

        //aynisini foreach ile yapalim
        int top1=0;
        for (int each:arr) {//arr a git  herbir(each) elemanini getir dedik
            if(each>5){
                top1+=each;
            }

        }System.out.println(top1);
        //foreach icin 3 seyi soylememiz gerekir
        //1-hangi data turu alacagi(burada int)
        //2-icerisinde herbir eleman geldiginde hangi isimle cagrilacagi(burada biz each yaptik)
        //3-elemanlari nereden alacagi(burada arr arrayinden aldik)
}
}