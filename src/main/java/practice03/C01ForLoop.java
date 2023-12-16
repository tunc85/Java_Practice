package practice03;

import java.util.Locale;
import java.util.Scanner;

public class C01ForLoop {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */


        //    babacan
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime =scan.next().toLowerCase(Locale.ROOT);

        int sayac=0;

        for (int i = 0; i < kelime.length(); i++) { //i loop degiskeni esas amacı loopun kac kez donecegini belirtmektir.

            if (kelime.charAt(i)=='c'){
                break;// bizi loopun disina atar.

            } else if (kelime.charAt(i)=='a') {
                sayac++;

            }


        }
        System.out.println("Ilk C harfine kadar olan a harflerinin sayisi : "+sayac);

        

    }
}
