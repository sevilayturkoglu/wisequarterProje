package ders04_matematikselslemler_incrementDecrement;

public class C08_pre_post_Increment {
    public static void main(String[] args) {
        int x=3;
        int y=2*++x;
        int z=5+y--;
        System.out.println(x + y + z);
    }
}
