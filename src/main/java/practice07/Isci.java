package practice07;

public class Isci implements Muhasebe{

        /*
            calisan isci ise;
               1- Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
               2- Çalisanin calisma suresi 10 yıl ve uzeri ise maasından %30;
               daha az ise maasindan %20 vergi kesintisi yapılıyor
         */

    @Override
    public double ekMesai(int calismaSaati) {
        if (calismaSaati>160){
            System.out.println("Aylik ek mesai ucreti : "+ (calismaSaati-160)*10);//1
            return (calismaSaati-160)*10;
        }else{
            return 0;
        }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili>=10){
            System.out.println("Vergi : "+ (brutMaas*30/100));
            return brutMaas*30/100;
        }else{
            System.out.println("Vergi : "+ (brutMaas*20/100));//2
            return brutMaas*20/100;
        }

    }

    public double netMaas(double brutMaas, int calismaSaati, int calismaYili){
        return brutMaas + ekMesai(calismaSaati) - vergi(brutMaas, calismaYili);
        //      1500    +       200             -  300
    }
}