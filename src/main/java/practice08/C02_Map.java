package practice08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_Map {
    public static void main(String[] args) {

        /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir method yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */


        HashMap<String, Double> urunFiyatlari= new HashMap<>();

        urunFiyatlari.put("Kemer",19.99);
        urunFiyatlari.put("Gomlek",29.99);
        urunFiyatlari.put("Ayakkabi",89.99);
        urunFiyatlari.put("Kazak",24.99);
        urunFiyatlari.put("Kravat",19.99);

        System.out.println(urunFiyatlari);

       double fiyatlarToplami = fiyatTopla(urunFiyatlari);

        System.out.println(fiyatlarToplami);








    }

    public static double fiyatTopla(HashMap<String, Double> urunFiyatlari) {

        double toplam=0;

        Set<Map.Entry<String,Double>> entries=urunFiyatlari.entrySet();
        for (Map.Entry<String,Double> each:entries) {
            toplam=toplam+each.getValue();

        }
        return toplam;
    }


}
