package practice07;
public class C02_Encapsulation {
    public static void main(String[] args) {
        //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        C01_Encapsulation obj1=new C01_Encapsulation("ali","Can", -25);
        System.out.println(obj1.getIsim());
        System.out.println(obj1.getSoyisim());
        System.out.println(obj1.getYas());
        System.out.println(obj1);//obj1.toString() demektir, toString yoksa referans verir



        //objenin yasını 30 olarak guncelleyin
        obj1.setYas(30);
        System.out.println(obj1);


        //parametresiz cons kullanarak 2. bir obje olusturun
        C01_Encapsulation obj2=new C01_Encapsulation();
        System.out.println(obj2);


        //Ayse, Yilmaz, 40 degerlerini atayın
        obj2.setIsim("ayse");
        obj2.setSoyisim("Yilmaz");
        obj2.setYas(40);
        System.out.println(obj2);


        //yas'ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2);


        //yas negatif deger alamayacak sekilde set methodunu guncelleyin
        //c01 da duzenledik
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        //c01 de duzenledik
        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin
        // hem cons hemde c01 degistirdik
    }
}
