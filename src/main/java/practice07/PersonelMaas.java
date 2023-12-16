package practice07;

public class PersonelMaas {
    /*
Bir sirketin muhasebe departmanı calısanlarin maaslarini hesaplıyor.
Muhasebe departmanı maas için su kriterlere bakıyor:

calisan isci ise;
       1- Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
       2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
       daha az ise maasindan %20 vergi kesintisi yapılıyor


calisan memur ise;
       1- Çalışanın aylık çalışma saatine göre 120 saat üstü  her saat için brüt maaşı 10 dolar artır.
       2- Çalisanin calisma suresi 10 yıl ve uzeri ise brut maasından %30;
       daha az ise maasindan %25 vergi kesintisi yapılıyor

Her calisanın maası hesaplanırken bu 2 kritere dikkat edilmek zorundadır

Bu kriterlere gore interface kullanarak calısanların net maasını hesaplayan kodu yazınız

 */
    public static void main(String[] args) {

        Memur memur1=new Memur();
        //System.out.println(memur1.ekMesai(145));
        //System.out.println(memur1.vergi(2000, 11));

        //System.out.println(memur1.netMaas(2000, 145, 11));

        Isci isci1=new Isci();

        double isci1Maas= isci1.netMaas(1500,180,9);
        System.out.println(isci1Maas);// 1400.0


    }


}