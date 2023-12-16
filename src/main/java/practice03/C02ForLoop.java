package practice03;

import java.util.Scanner;

public class C02ForLoop {
    public static void main(String[] args) {
         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */


        Scanner scan = new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i <5 ; i++) {

            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();
            if (sayi % 10 == 7 || sayi % 10 == 9) {
                continue; // bir loopta atlanmak istenen elemanlar icin kullanilir.

            }
                toplam+=sayi; //  toplam=toplam+sayi;

            }
        // continue'da loop bir kez atlanir.
        //break ise loopu tamaen kirar.
        System.out.println("toplam = " + toplam);


    }
    }

