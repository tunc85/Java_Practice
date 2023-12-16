package practice05;

import java.util.Scanner;

public class C04FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen fahrenheit cinsinden degerini giriniz");
        double fahrenheit= scan.nextDouble();

        double celsius=fahrToCels(fahrenheit);
        System.out.println(celsius);



        //main mothod icinden kisa yoldan method olstururken;
        //1. methoda verecegimiz ismi yaziyor -- size kalmis -- methodlar kucuk harfle baslar
        //2 method parantezi
        //3 method parantezininin icinde methoda gondermek istedigimiz variable(arguman) yazin
        //4. create method secenegine tiklayin









    }

    public static double fahrToCels(double fahrenheit) {
        // formül: c = (f-32)/1.8

        double celcius=(fahrenheit-32)/1.8;
        return celcius;
    }
}
