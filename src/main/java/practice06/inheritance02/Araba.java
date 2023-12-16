package practice06.inheritance02;

public class Araba {
    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.



    protected String haraket="Arabalar teker ile haraket eder.";

    protected String hiz= "Arabalar motor gucune gore haraket eder.";

    protected  String yakit = "Arabalar farkli turde yakit kullanirlar";

    protected  String marka = "Arabalar uretildikleri markaya sahiptir";


    protected void motor(){
        System.out.println("Arablar farkli markalarda kullanirlar");
    }

    protected void yakitTuketimi(){
        System.out.println("Arablar motor gucune ve yakit turune gore yakit tuketirler");
    }
}
