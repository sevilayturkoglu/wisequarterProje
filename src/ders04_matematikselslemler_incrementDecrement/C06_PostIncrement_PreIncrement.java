package ders04_matematikselslemler_incrementDecrement;

public class C06_PostIncrement_PreIncrement {
    public static void main(String[] args) {
        int say=10;
       ++say;
        System.out.println(say);//11
      int say1=10;
       say1++;
        System.out.println(say);//11

        //oysa
        int sayi=10;
        System.out.println(sayi++);//burada henuz 10 yazar cunki once sayiyi yaz sonra arttir dedik POST INCREMENT
        System.out.println(sayi);//simdi 11 yazar cunki bir onceki satirda arttir demistik.
        System.out.println(++sayi);//simdi 12 yazar cunki once arttir sonra yaz dedik.
        int sayim=10;
        System.out.println(++sayim);// burada 11 yazar cunki once arttir sonra yaz dedik PRE INCREMENT
    }
}
