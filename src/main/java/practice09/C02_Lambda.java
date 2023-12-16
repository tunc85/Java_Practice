package practice09;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C02_Lambda {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        // toplamYazdir(list);
        //toplamYazdirRef(list);
        System.out.println(pozCarpimVer(list));
        int carpim=pozCarpimVerRef(list);
        System.out.println(carpim);
    }
    // SORU7: List elemanlarının toplamını lambda expression ve method reference ile bulun ve yazdırın
    public static void toplamYazdir(List<Integer>l){
        //foreach ile;
        int toplam=0;
        for (Integer w:l) {
            toplam=toplam+w;
        }
        //-5,-8,-12,0,1,12,5,5,6,9,15,8
        System.out.println(l.stream()
                .reduce((t, u) -> t + u)//reduce methodu akısı tek elemana indirgiyor
        );
        //optinaldan kurtulmak icin
        //1. baslangıc degeri ver
        System.out.println(l.stream()
                .reduce(0,(t, u) -> t + u));
        //2.get methodu
        try {
            System.out.println(l.stream()
                    .reduce((t, u) -> t + u).get());
            //get methodu liste bos ise exception fırlatır
            //bunun önune gecmek için exception gelme ihtimali olan kodu
            //try catch bloguna aldık(JAVA)
        } catch (Exception e) {
            System.out.println("Liste bos");
        }
    }
    public static void toplamYazdirRef(List<Integer>l){
        System.out.println(l.stream()
                .reduce(Integer::sum));
        //1.yol identity
        System.out.println(l.stream()
                .reduce(0,Integer::sum));
        //2.yol get methodu
        try {
            System.out.println(l.stream()
                    .reduce(Integer::sum).get());
        } catch (Exception e) {
            System.out.println("Liste bos");
        }
    }
    //SORU8 : Listin pozitif elemanlarının, carpımını bulan ve return eden methodu yazınız
    public static int pozCarpimVer(List<Integer> l){
        int carpim=l.stream()//akısa sunduk
                .filter(Utils::pozitifMi)//akıstan gelen pozitif elemanları filtreledik
                .reduce(1,(t,u)->t*u);//carpmanın etkisiz elemanı olan 1 identity
        return carpim;
    }
    public static int pozCarpimVerRef(List<Integer>l){
        return l.stream()
                .filter(Utils::pozitifMi)
                .reduce(1,Math::multiplyExact);
    }
}
