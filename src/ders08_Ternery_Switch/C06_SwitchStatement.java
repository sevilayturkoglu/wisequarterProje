package ders08_Ternery_Switch;

public class C06_SwitchStatement {
    public static void main(String[] args) {
        //if else ile yapacagimiz uzun islemleri bununla daha kisa ve kolay yapariz
        //kullanici gun rakami girecek biz o rakamin hangi gun oldugunu yazacagiz
         //bu statementsta long,double,float,boolean gibi veriler kullanilmaz
        //statement "break" yazisini gorene kadar calisir,bu nedenle calismasini bitirmek istedigimiz yere break koymaliyiz
        int gunNo=8;
      /*  if (gunNo==1){
            System.out.println("pazartesi");  //bu if else cozumu devami var ama yazmadik
        } else if (gunNo==2) {
            System.out.println("sali");
           }*/
        switch(gunNo){
            case 1:
                System.out.println("pazartesi");
                break;// araya break koymazsak bizim istedigimizden sonraki statementlarida yazdirir
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Gecersiz Gun");

        }
    }
}
