package practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C01_Lambda {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        //pozCiftElYazdir(list);//12 6 8
        //System.out.println();
        //pozCiftElYazdirRef(list);
        //System.out.println();
        //kareYazdir(list);
        //tekrarsizYazdir(list);
        buyKucSiralaYazdir(list); // 15 12 9 8 6 5 5 1 0 -5 -8 -12
        pozKuplerinBirbs50OlanlariYazdir(list);


    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    //Lambda Expression kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın
    public static void pozCiftElYazdir( List<Integer> l){

        l.stream()//listi stream'e donusturerek akısa sunduk
                .filter(t-> t%2==0 && t>0 )//akıstan gelen pozitif ve cift elemanları filtreledik, sartı saglamayanlar elendi
                .forEach(t-> System.out.print(t+" "));//aralarında bir bosluklu aynı satırda yazdır

    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    //Method Referances kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın
    public static void pozCiftElYazdirRef(List<Integer> k){
        k.stream()
                .filter(Utils::pozitifMi)
                .filter(Utils::ciftMi)
                .forEach(Utils::yazdir);


    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> k){
        k.stream(). // akis
                map(t->t*t). // gelen elemani karesine donusturduk
                forEach(Utils::yazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void tekrarsizYazdir(List<Integer> l){
        l.stream().
                map(Utils::kareBul).
                distinct().
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSiralaYazdir(List<Integer> s){
        s.stream().
                sorted(Comparator.reverseOrder()). // sorted methodu parametresiz kullanildiginda natural orderdir
                forEach(Utils::yazdir); // reverseOrder ile kullanildiginda ise tam tersi siralar

    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozKuplerinBirbs50OlanlariYazdir(List<Integer> x){
        x.stream().
                filter(Utils::pozitifMi). // pozitif elemanlari filtreledik
                map(t->t*t*t). // gelen pozitif elemanlarin kuplerini aldik
                filter(t->t%10==5). // pozitif ve kupleri alinmis sayilarin birler basamagi 5 olanlari filtreledik
                forEach(Utils::yazdir); // yazdirdik utils kullanarak
    }


}