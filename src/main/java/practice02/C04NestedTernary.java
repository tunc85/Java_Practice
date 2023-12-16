package practice02;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayıyının karesini ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1. tam sayiyi girin");
        int sayi1 = input.nextInt();

        System.out.println("Lutfen 2. tam sayiyi girin");
        int sayi2 = input.nextInt();

        System.out.println(sayi1 == sayi2 ? "Sayilar birbirine esit" :
                (sayi1 > sayi2 ? (sayi1 * sayi1) : (sayi2 * sayi2)));
        //(sayi2 > sayi1 ? (sayi2 * sayi2) : (sayi1 * sayi1) bu sekildede yapabilirdik.
        // \n"" icinde yazilir konsolde imleci alt satira atar.


















    }
}
