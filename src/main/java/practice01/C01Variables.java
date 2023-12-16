package practice01;

public class C01Variables {
    public static void main(String[] args) {
        //(int) bir variable(yas)  olustur ve yazdır
        //data turu - data ismi - atama operatoru - deger
        int yas =12;
        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi =50;
        System.out.println(sayi);
        System.out.println(50);

        //konsola 'sayi = 50' seklinde yazdır
        System.out.println("Sayi:" +sayi); //etiketiyle yazdirma islemidir.
        System.out.println("sayi = " + sayi); //ilk data ismi sonra .soutv


        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim =yas;


        //String bir variable olusturalım (isim)
        String isim ="Ali";


        //isim variable ını etiketıyle yazdır
        System.out.println("isim = " + isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle
         isim = "Can";

        //isim ve onunIsmi variable'larını yazdır
        System.out.println("isim = " + isim); //can
        System.out.println("onunIsmi = " + onunIsmi); //ali



    }
}
