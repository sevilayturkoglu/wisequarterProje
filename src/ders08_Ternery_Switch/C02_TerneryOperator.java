package ders08_Ternery_Switch;

public class C02_TerneryOperator {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="Ali";
        //metinleri karsilastir metinler ayni ise metinler ayni yazsin
       // metinler farkli ise metinler farkli yazsin

        if (str1.equals(str2)){// string de karsilastirma == ile degil equals metodu ile yapilir
            System.out.println("metinler ayni");
        }else {
            System.out.println("metinler farkli");
        }
        System.out.println(str1.equals(str2) ? "metinler ayni" : "metinler farkli");
    }
}
