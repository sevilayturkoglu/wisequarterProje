package RandomClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C01_RandomMethod {
    public static void main(String[] args) {
        //ArrayListe random veriler ekleyelim
        Random rd=new Random();

        int ekle=5;
        List<Integer> randomList=new ArrayList<>();
        for (int i=0;i<=ekle;i++) {
            randomList.add(rd.nextInt(23) );//5 tane 23 e kadar random value ekledik
            
        }
        System.out.println(randomList);

    }
}
