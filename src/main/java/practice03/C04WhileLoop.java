package practice03;

import java.util.Scanner;

public class C04WhileLoop {
    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        //baslangic degeri >> loopun oncesinde tanimlanir
        //artis azalis miktari >> loopun body'sinde yazilir.
        //kosul kontrolu >>while ile yazilir

        while (sayi%10!=0){
            System.out.print(sayi+ " ");

            sayi++;
        }







    }
}
