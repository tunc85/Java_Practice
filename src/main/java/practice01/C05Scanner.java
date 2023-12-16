package practice01;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
  /*
   kullanıcıdan aldıgınız sayının karesini bulunuz
   not:bir sayının karesi,sayının kendisi ile carpımına esittir
    */
 //Scanner objesi olusturmak.
        Scanner scan = new Scanner(System.in);

        System.out.println("Karesini Bulmak İstediğiniz Sayıyı Giriniz.");
        int sayi1 = scan.nextInt();
        System.out.println("Girdiğiniz sayı"+sayi1);

        System.out.println("Girdiğiniz sayının karesi:"+sayi1*sayi1);









    }
}
