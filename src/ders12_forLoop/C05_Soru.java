package ders12_forLoop;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        kullanicidan pozitif sayi al
        1 den baslayarak tum pozitif sayma sayilari yazdirin
        3 ile bolunebiliyorsa sayi yerine fizz
        5 ile bolunebiliyorsa sayi yerine buzz
        ikisi ile de bolunuyorsa yerine fizzBuzz yazsin
         */
        int sayi=130;
        for (int i = 1; i <= sayi; i++) {
            if(i%5==0 && i%3==0){
                System.out.print(" fizzBuzz\n ");// \n koyarak alt satira gecmesini sagladik her 5 ve 3 e bolunce bir alta geccek

            } else if (i%5==0) {
                System.out.print("  buzz ");

            }else if(i%3==0){
                System.out.print(" fizz ");

            }else{
                System.out.print(i + " ");
            }

        }
    }
}
