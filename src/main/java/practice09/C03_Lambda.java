package practice09;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class C03_Lambda {
    public static void main(String[] args) {
        List<String> meyve = new ArrayList<>(Arrays.asList("erik","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","Elma"));
        //ilkHarfEveyaCYazdir(meyve);
        System.out.println();
        // yildizliYazdir(meyve);
        //System.out.println(chBuyKucSiralaIlkUcListele(meyve));
        //System.out.println(ilkBuyukIkinciHarfeGoreListele(meyve));
        //System.out.println(eIcerenUzunveSonHarfeGoreSirala(meyve));
        System.out.println(Arrays.toString(lLeriSilArray(meyve)));
        //lLeriSilArray(meyve)
    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım
    public static void ilkHarfEveyaCYazdir(List<String> l){
        l.stream()
                .filter(t->t.toLowerCase().startsWith("e") || t.toLowerCase().startsWith("c"))//e veya E veya c veya C ile baslayan elemanlar filtrelenecek
                .forEach(Utils::yazdir);
    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizliYazdir(List<String> l){
        l.stream()
                .map(t->"*"+t+"*")
                .forEach(Utils::yazdir);
    }
    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> chBuyKucSiralaIlkUcListele(List<String >l){
        return
                l.stream()
                        .sorted(Comparator.comparing(String::length).reversed())//akıstan gelen elemanları önce ch sayisina gore
                        //natural ordera gore sıraladık ve bunu reversed diyerek terse cevirdik buy->kucuge
                        .limit(3)//sıralamadaki ilk 3 elemanı aldık
                        .collect(Collectors.toList());
    }
    //SORU4: list elemanlarının benzersiz olanlarini ilk harf buyuk gerisi kucuk sekılde
    // 2. harfe gore sıralayıp List halinde return ederek yazdırınız
    public static List<String> ilkBuyukIkinciHarfeGoreListele(List<String>l){
        //erik  Erik
        //ciLEK  Cilek
        return
                l.stream()
                        .map(t->t.toUpperCase().charAt(0)+t.toLowerCase().substring(1))//ilk harf buyuk gerisi kucuk
                        //ERIK                        erik
                        //        E             rik  =  Erik
                        .distinct()//benzersiz hale getirdik
                        .sorted(Comparator.comparing(t->t.charAt(1)))//gelen elemanlrı 2. harfe gore sırladım(natural ordera)
                        .collect(Collectors.toList());
    }
    //SORU5 : List elemanlarının icinde e olanlarını uzunluklarina
    //ve son harflerine gore sıralayıp List halinde return ederek yazdırınız
    public static List<String> eIcerenUzunveSonHarfeGoreSirala(List<String>l){
        return
                l.stream()
                        .filter(t->t.contains("e"))//e icerenleri filtreledik
                        .sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(t.length()-1)))
                        .collect(Collectors.toList());
    }
    //SORU6 : List elemanlarının icindeki tum 'l' harflerini siliniz Array halinde return ederek yazdırınız
    public static Object[] lLeriSilArray(List<String>l){
        return
                l.stream()
                        .map(t->t.replace("l",""))
                        .toArray();
    }
}
  