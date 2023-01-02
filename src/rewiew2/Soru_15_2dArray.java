package rewiew2;

import java.util.*;

public class Soru_15_2dArray {
    public static void main(String[] args) {
        //kullanicidan isim iste
        //varsa arasindaki bosluklari sil
        //kullanici adi bizim listte varsa sonuna rastgele sayi ekle
        //kullanici adi listede yoksa listeye ekle

        List<String>kullaniciList=new ArrayList<>();
        kullaniciList.add("Ali");
        kullaniciList.add("Sevilay");
        kullaniciList.add("nazli");
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String girilenIsim=sc.nextLine().replace(" ","");
        System.out.println(girilenIsim);

            if(!kullaniciList.contains(girilenIsim)){
                kullaniciList.add(girilenIsim+new Random().nextInt(100));


            }else{
                girilenIsim=girilenIsim;
            }System.out.println(kullaniciList);

        }

    }

