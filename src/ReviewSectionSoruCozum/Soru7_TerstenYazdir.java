package ReviewSectionSoruCozum;

public class Soru7_TerstenYazdir {

    public static void main(String[] args) {
        // 4 harfli stringi tersten yazdir,iki yolla yaptik,for dongusuyle de yapardik

        String str="kjba";
        if(str.length()==4){
          String ters="";
            ters=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);//en basa"" koyarak string gibi birlestirme yapmasini sagladik

           /* String ters="";
            ters= String.valueOf(str.charAt(3))+String.valueOf(str.charAt(2))
                    +String.valueOf(str.charAt(1))+String.valueOf(str.charAt(0));*/
            System.out.println(ters);

            String bak=String.valueOf(str.charAt(0));//bununla bir karakteri alip string icine atiyoruz
            String baka=String.valueOf(str.substring(1,2));//bununla da aynisini yapariz
            System.out.println(baka);
            System.out.println(bak);
        }

        for(int i=str.length()-1;i>=0;i--){
            String ters="";
            ters+=str.charAt(i);
            System.out.print(ters);
        }

    }
}
