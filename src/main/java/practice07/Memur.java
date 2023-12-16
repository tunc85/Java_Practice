package practice07;

public class Memur implements Muhasebe{
/*
    calisan memur ise;
           1- Çalışanın aylık çalışma saatine göre 120 saat üstü  her saat için brüt maaşı 10 dolar artır.
           2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
           daha az ise maasindan %25 vergi kesintisi yapılıyor
 */

    @Override
    public double ekMesai(int calismaSaati) {
        if (calismaSaati>120){//ek mesai ucreti alacak demektir
            System.out.println("Aylik ek mesai ucreti : "+ (calismaSaati-120)*10);
            return (calismaSaati-120)*10;
        }else{//ek mesai ucreti alamayacak demektir
            return 0;
        }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili>=10){
            //brutMaas*30/100;  kesilecek vergi miktarı
            System.out.println("Vergi : "+(brutMaas*30/100));//önce kesilecek vergi miktarının bilgisini veriyorum
            return brutMaas*30/100;//kesilecek vergi miktarını return ediyorum
        }else{
            //brutMaas*25/100;
            System.out.println("Vergi : "+ (brutMaas*25/100));
            return brutMaas*25/100;

        }
    }

    public double netMaas(double brutMaas, int calismaSaati, int calismaYili){
        return   brutMaas + ekMesai(calismaSaati) - vergi(brutMaas, calismaYili);
        //        2000     +   250                 -  600
    }


}