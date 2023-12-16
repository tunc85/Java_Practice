package practice09;

public class Utils {

    //pozitif elemanları filtreleyecek method, eger gelen eleman pozitif ise method true, degilse false dondursun
    public static boolean pozitifMi(int a){
        return a>0;
    }

    //cift elemanları filtreleyecek method
    public static boolean ciftMi(int i){
        return i%2==0;
    }

    //aynı satırda bir bosluklu yazdıran method
    public static void yazdir(Object i){
        System.out.print(i+" ");
    }

    public static int kareBul(int i ){
       return i*i;

    }
}