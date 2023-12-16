package practice06.inheritance02;

import java.util.ArrayList;
import java.util.List;

public class Corsa extends Opel{
    String hiz = "Corsa arabalar max 200 km hiz yaparlar";

    String yakit = "Corsa arabalar benzinlidir";

    String marka = "Corsa";

    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanir");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arablar 5.6 lt yakit tuketir");
    }

// runner'i burada olusturduk bunun icin farkli bir class olusturabilirdik ama burayi tercih ettik
    public static void main(String[] args) {
        Corsa arb1 = new Corsa();
        System.out.println("arb1.haraket = " + arb1.haraket); // Araba classindan gelir. cunku abide yok babasinda var
        System.out.println("arb1.hiz = " + arb1.hiz); // Corsa clasttan aldi
        System.out.println("arb1.yakit = " + arb1.yakit); // corsa classtan cekti bu bilgiyi cunku kendinde var
        System.out.println("arb1.marka = " + arb1.marka); // kendinden buldu
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi); // opelden cekti aldi bu bilgiyi parentindan almanya
        arb1.motor(); // burasi Corsadan geldi cunku yeni override yaptik

        Opel arb2=new Corsa();
        //List<String> list = new ArrayList<>();
        //Collection-List-ArrayList-Array
        System.out.println("arb2.haraket = " + arb2.haraket); // araba classindan gelir
        System.out.println("arb2.hiz = " + arb2.hiz); // Opel classtan geldi
        System.out.println("arb2.yakit = " + arb2.yakit); // araba classindan gelir
        System.out.println("arb2.marka = " + arb2.marka);// opelden gelecek
        // arb2.model -- > CTE
        arb2.motor(); // corsadan gelir cunku opelde buldu ama overridenin sonu corsaya  bakıyor o yüzden corsa class'indan aldi.



    }
}
