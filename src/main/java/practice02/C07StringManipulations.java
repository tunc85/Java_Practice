package practice02;

import java.util.Scanner;

public class C07StringManipulations {
    public static void main(String[] args) {

         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve Soyadinizi Giriniz\n Not: Yalnizca tek ad ve tek soyad girilmeli");
        String adSoyad=scan.nextLine();
        //space idx bulalim
        int spaceIdx=adSoyad.indexOf(" ");
        String ad =adSoyad.substring(0,spaceIdx); //ilk idx dahil , ikinci idx harictir.
        //ali
        String soyAd=adSoyad.substring(spaceIdx+1);

        //ali-> Ali
        String ad2=ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1);
        String soyAd2=soyAd.toUpperCase().charAt(0)+soyAd.toLowerCase().substring(1);
        System.out.println("Ad  : " +ad2);
        System.out.println("Soyad  : "+soyAd2);















    }
}
