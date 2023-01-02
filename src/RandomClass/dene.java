package RandomClass;

public class dene {
    public static void main(String[] args) {

   String s="ben5gel6ol";
        System.out.println(sumOfDigits(s));
    }

    public static int sumOfDigits(String s) {

        int total = 0;

        char[] ch = s.toCharArray();

        for (char each : ch) {

            if (Character.isDigit(each)) {

                total += Integer.valueOf("" + each);


            }

        }

        return total;
    }
}