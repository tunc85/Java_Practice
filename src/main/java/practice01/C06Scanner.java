package practice01;

import java.util.Scanner;

public class C06Scanner {
    public static void main(String[] args) {
 /*
  kullanıcıdan kilosunu ve metre cinsinden boyunu isteyiniz
  ve vucut kitle indeksini bulunuz

  not: vucut kitle indeksi: kilo/(boy*boy)

   */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Giriniz");
        double kilo = input.nextDouble();

        System.out.println("Metre cinsinden Boy giriniz");


        double boy = input.nextDouble();

        //Vucut kitle indeksi : kilo /(boy*boy)

        System.out.println("Vücut kitle endeksiniz: "+kilo/(boy*boy));









    }
}
