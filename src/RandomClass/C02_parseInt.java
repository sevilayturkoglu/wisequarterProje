package RandomClass;

import java.util.ArrayList;
import java.util.List;

public class C02_parseInt {
    public static void main(String[] args) {
        //string listini integer liste cevirip donduren bir method yaz
        List<String> stringList=new ArrayList<>();
        stringList.add("2");
        stringList.add("3");
        stringList.add("22");
        stringList.add("32");
        System.out.println(stringList);
        List<Integer> converteToInt= converteToInteger(stringList);
        System.out.println(converteToInt);
        System.out.println(converteToInteger(stringList));
        //..........................

        //..........................
    }

    public static List<Integer> converteToInteger(List<String> stringList) {
        List<Integer> integerList=new ArrayList<>();

        for (String each:stringList) {
            integerList.add(Integer.parseInt(each));
        }
        return  integerList;

    }
}
