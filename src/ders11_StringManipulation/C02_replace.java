package ders11_StringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        //replace metodu char kabul eder ancak replaceAll metodu char kabul etmez
        String str="Java candir";
        System.out.println(str.replace('a', 'A'));//kucuk a yerine A yazdik
        System.out.println(str.replace(" ", ""));//bosluk yok ettik Javacandir bitisik yapar
        System.out.println(str.replace("candir", "guzeldir"));
        System.out.println(str.replace("a", ""));//a lari sildik

        //Java candir yerine Hava cok guzeldir yazdir
        System.out.println(str.replace("Java", "Hava")
                          .replace("candir", "cok guzeldir"));

        //1.a yi A yapin
        System.out.println(str.replaceFirst("a", "A"));

        System.out.println(str.replace("", "-"));//-J-a-v-a- -c-a-n-d-i-r-
    }
}
