package practice08;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {

    /* Not: Degismezlerimiz(Enum) aslinda object gibidir
   Not: Aslinda hepsi buyuk harf olmasi genel kabuldur, kucuk yazsak da Java kabul eder
   Not: Constructor yardimi ile sabitlerimizi olusturuyoruz
   Not: private variable'lara disaridan erisebilmek icin get methodlarina ihtiyac var
   */
    //Aylara gore sebze ve meyve tavsiyesi veren ve toplam yapılması gereken egzersiz saatlerini soyleyen bir kod yazınız.
    //Her ayın sabit bir sebzesi, meyvesi ve egzersiz saati olmalı.


    //enumdaki tum sabitleri yazdırınız
    //enumdaki ilk sabite ait ayinSebzesi degerini yazdırın
    //Agustos ayına ait ayinMeyvesini yazdırın
    //20 ssat ustu egzersiz yapılacak ayları ekrana yazdırınız.
    //kullanıcıdan aldıgınız meyvenin oldugu aya ait egzersiz saatini yazdırın

    public static void main(String[] args) {

        //enumdaki tum sabitleri yazdırınız
        BeslenmeEgzersiz[] arr=BeslenmeEgzersiz.values();
        System.out.println(Arrays.toString(arr)); // [Ocak, Subat, Mart, Nisan, Mayis, Haziran, Temmuz, Agustos, Eylul, Ekim, Kasim, Aralik]


        //enumdaki ilk sabite ait ayinSebzesi degerini yazdırın

        System.out.println(arr[0].getAyinSebzesi()); // Havuc


        //Agustos ayına ait ayinMeyvesini yazdırın

        //System.out.println(arr[7].getAyinMeyvesi()); // Incir
        System.out.println(BeslenmeEgzersiz.Agustos.getAyinMeyvesi()); //Incir


        //20 ssat ustu egzersiz yapılacak ayları ekrana yazdırınız.
        for (BeslenmeEgzersiz each :arr) {
            if (each.getEgzersizSaati()>20) {
                System.out.println(each);
            }

        }




        //kullanıcıdan aldıgınız meyvenin oldugu aya ait egzersiz saatini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir meyve ismi giriniz");
        String meyveSecimi= scan.next();

        for (BeslenmeEgzersiz w :arr) {

            if (w.getAyinMeyvesi().equalsIgnoreCase(meyveSecimi)) {

                System.out.println(w + " ayinda yapilacak olan egzersiz saati " + w.getEgzersizSaati());
                break;
            }
        }











    }//main disi
}//class disi
