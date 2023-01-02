package ReviewSectionSoruCozum;

public class Soru10 {
    public static void main(String[] args) {
        /*
    bir stringin icinde bulunan sayilari tespit edip toplama yapan bir cod yazin
     */
        String str="aselam14532";

        int c=Integer.parseInt(str.substring(7,8));//asagidakiyle ikisi ayni islem
        System.out.println(c);//4

         int d= Integer.valueOf(str.charAt(7));
        System.out.println(d);//52 yazar,Ascii tablosuna gore matematiksel degeri yazar
        // oyle olmamasi icin bos string koyarizint d= Integer.valueOf(""+str.charAt(7)); gibi

        int b=Integer.parseInt(""+str.charAt(7));
        System.out.println(b);//4

        int a=0;
        String s="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
              // a=a+Integer.valueOf(""+str.charAt(i)); //yazdigimiz bu uc yontem de ayni sonucu verir
             //  a=a+Integer.parseInt(""+str.charAt(i));
               a=a+Integer.parseInt(str.substring(i,i+1));
                s=""+str.charAt(i);
                System.out.print(s);//14532 ama string
            }
        }
        System.out.println();
        System.out.println(a);//15
    }
}
