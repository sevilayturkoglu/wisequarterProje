package ders09_StringManipulasyon;

public class C02_equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3="Ali";
        String str4=new String("Ali");//eger == metoduyla karsilastirma yaparsak str1 ve str3 esit cikar ancak str4 esit cikmaz oysa ucu ayni Ali
        //bu nedenle stringleri equals yontemi ile kontrol edersek daha saglikli olur ,cunki equals icerige bakip esit olup olmadigini soyler

        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1 == str4);//false  yukarida yazdigimizdan dolayi
        System.out.println(str1 == str3);//true
        System.out.println(str2.equals(str1));//false
    }
}
