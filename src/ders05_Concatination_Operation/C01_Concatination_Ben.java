package ders05_Concatination_Operation;

public class C01_Concatination_Ben {
    public static void main(String[] args) {
        //ONEMLI;
        //Concatination(+) birlestirme demektir,stringi onundekilerle birlestirir ve hepsini string yapar ama bazi kurallari vardir
        //String bastaysa kendinden sonra gelenleri de string yapar
        //ama parantez ici ve carpmanin onceligi oldugu icin once carpma ve parantez islemlerini yapar sonra stringle birlesim yapar
        //javanin islemlemlerini yukaridan asagi ve soldan saga dogru yapar

        String a="hello";
        String b="world";
        System.out.println(a + b);//helloworld
        System.out.println(a + "  " + b);//hello world

        ///////////
        int c=2;
        int d=3;
        System.out.println(a + c + d);//hello23 yazar cunki ondeki string digerlerinide string yapti bu nedenle toplama islemi yapilmadi yan yana yazildi
        System.out.println(c + d + a);//5 hello yazar  java soldan saga dogru islem yapar yani once 2 ile3 u toplar sonra stringi yazar
        System.out.println(a + (c + d));//hello5 yazar cunki java once parantez icini yapar yani 2 ile 3 u topladiktan sonra helloyu basa ekler
        System.out.println(a + c * d);//hello6 yazar cunki carpma isleminin onceligi vardir

    }
}
