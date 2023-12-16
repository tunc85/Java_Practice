package practice05;

import java.util.Scanner;

public class C03HesapMakinesi {
    public static void main(String[] args) {

          /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi seciniz: + - * / kullaniniz");
        char islem =scan.next().charAt(0); //nextChar diye bir method yok
        if (islem=='+' || islem== '-' ||islem=='*' || islem=='/' ){
            System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz\nBirinci sayi:");
            double sayi1= scan.nextInt();
            System.out.println("Ikinci sayi: ");
            double sayi2= scan.nextInt();

            hesapMakinesi(sayi1,sayi2,islem); //arguman

        }else {
            System.out.println("Hatali giris");
        }









    }//main method sonu

    public static void hesapMakinesi(double sayi1, double sayi2, char islem) { //parametre
        switch (islem){
            case '+':
                System.out.println(sayi1+"+"+sayi2 + "=" + (sayi1+sayi2) );
                break;
            case '-':
                System.out.println(sayi1+"-"+sayi2 + "="+ (sayi1-sayi2));
                break;
            case '*':
                System.out.println(sayi1+"*"+sayi2 + "=" + (sayi1*sayi2));
                break;
            case '/':
                System.out.println(sayi1+"/"+sayi2 + "=" + (sayi1/sayi2));

        }
    }
}//class sonu
