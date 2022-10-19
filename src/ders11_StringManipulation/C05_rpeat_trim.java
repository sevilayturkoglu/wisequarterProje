package ders11_StringManipulation;

public class C05_rpeat_trim {
    public static void main(String[] args) {
        String str="java ben ";
        System.out.println(str.repeat(4));//kac kere istersek o kadar tekrar eder

        //TRIM bastaki ve sondaki bosluklari siler

        String str1="    java ben    ";
        str1=str1.trim();
        System.out.println(str1);

    }
}
