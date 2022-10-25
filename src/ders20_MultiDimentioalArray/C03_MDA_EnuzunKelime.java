package ders20_MultiDimentioalArray;

public class C03_MDA_EnuzunKelime {
    //verilen mda da ki en uzun kelimeyi bulun
    public static void main(String[] args) {
        String[][]str={{"Ali","Husamettin"},{"Adem","Hamza","adiyok kiii"}};
        String enUzunKelime=str[0][0];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                if(str[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=str[i][j];
                }
            }
        }
        System.out.println(enUzunKelime);
    }
}
