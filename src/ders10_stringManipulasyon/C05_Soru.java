package ders10_stringManipulasyon;

public class C05_Soru {
    public static void main(String[] args) {
        /*maili kontrol edin
        * mail @ isareti icermiyorsa gecersiz mail yaz
        * @gmail.com icermiyorsa gmail adresi girin yaz
        * @gmail .com ile bitmiyorsa yazim hatasi yaz
        * bunlar eksik degilse email basariyla kaydedildi yaz
        */
        String mail="sevilayt1975@gmail.comcom";
       // System.out.println(mail.endsWith("@gmail.com"));

        if (!mail.contains("@")){
            System.out.println("gecersiz email");
       } else if (!mail.contains("@gmail.com")) {
            System.out.println("gmail adresi gir");
        } else if(!mail.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        }else{
            System.out.println("email basariyla kaydedildi");
        }

    }
}
