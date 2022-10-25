package ders20_MultiDimentioalArray;

public class C02_MDA_ElementleriTopla {
    public static void main(String[] args) {
        //elementleri topla
        int [] arr1={3,5,7,8};
        int top=0;
        for(int i=0;i<arr1.length;i++){
            top+=arr1[i];
        }
        System.out.println(top);//23

        //MDA da toplama nasil olur

        int [][]arr2={{1,2},{3,4,5},{7}};
        int top1=0;
        for(int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                top1+=arr2[i][j];
            }
        }
        System.out.println(top1);
    }
}
