package practice06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class C01_LocalDate {
    /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Alinin dogum gununu 23/11/15 formatına benzer bir sekilde yazdırın

        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

    public static void main(String[] args) {

        LocalDate dogAli = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dogVeli= LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println("dogAli = " + dogAli);
        System.out.println("dogVeli = " + dogVeli);

         // Alinin dogum gununu 23/11/15 formatına benzer bir sekilde yazdırın

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/M/d");
        System.out.println(dogAli.format(dtf)); // 69/7/4

        //Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız

        if (dogAli.equals(dogVeli)){
            System.out.println("Ayni tarihte dogmuslar");
        }else {
            System.out.println("Ayni tarihte dogmamislar");
        } //Ayni tarihte dogmuslar

    }
}
