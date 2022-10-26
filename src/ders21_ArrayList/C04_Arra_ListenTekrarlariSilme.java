package ders21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Arra_ListenTekrarlariSilme {

    //var olan arraydeki tekrar eden sayilari silin,sonra elde ettiginiz arrayi ArrayListe ekleyin
    //yeni olusturdugunuz arrayi ArrayListin icinden alip ,ilk arraye deger olarak atayin
    public static void main(String[] args) {
        int []ekle={1,2,3,4,3,2,5,7,6,4,9,7,8};//tekrarli listimiz
        List<Integer> tekil=new ArrayList<>();//bos arrayList yaptik
        for (int i = 0; i < ekle.length; i++) {
            if(!(tekil.contains(ekle[i]))){//tekrar eden sayilari arrayden ayirdik
                tekil.add(ekle[i]);//tekrar etmeyen sayilari bos ArrayListe ekledik
            }

        }
        System.out.println(tekil);
        ekle=new int[tekil.size()];//eski array uzerine ekleyecegimiz yeni arrayin bos objesini olusturduk.length olarak arrayListin sizesini kullandik
        for (int i = 0; i < ekle.length ; i++) {
         ekle[i]=tekil.get(i);//ArrayListten aldigimiz tekrarsiz elemanlari eski arraye yukledik
        }
        System.out.println(Arrays.toString(ekle));
    }
}
