package rewiew2;

public class Soru_12_2dArray {
    public static void main(String[] args) {
        //$ varsa3.2 ile E varsa 4.2 ile carp
        //$ ve E isaretlerini kaldir
        //elemanlarin toplamini double olarak yaz
        String[][]arr={{"$9","$2","E3"},{"$9","$2","E3"},{"$9","$2","E3"}};

        double topG=0;
        double a=0;
        double b=0;
        String sayi="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].contains("$")){
                  sayi= arr[i][j].replace("$","");
                  topG+=(Double.parseDouble(sayi)*3.2);
                }else {
                    sayi= arr[i][j].replace("E","");
                     topG+=(Double.parseDouble(sayi)*4.2);

                }

            }

        }System.out.println(topG );
    }
}
