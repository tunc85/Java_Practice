package practice03;

import java.util.Scanner;

public class C05DoWhileLoop {
    public static void main(String[] args) {

        // do(yap) while(sonra kosul kontrolu) loop en az 1 kez calisir. ilk dongu icin kontrol islemi yok.
         /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */


        Scanner scan = new Scanner(System.in);
        int sayac=0;
        int toplam=0;

        do {
            System.out.println("Lutfen pozitif bir tamsayi giriniz\n Bitirmek icin 0'a basiniz");
            int sayi=scan.nextInt();

            if (sayi==0){
                break;

            } else if (sayi<0) {
                System.out.println("Negatif sayi kullanamazsiniz.");
                continue;

            } //geriye kalan durum sayinin pozitif olma durumudur. tekrar bir if'e gerek yoktur.
                sayac++;
                toplam+=sayi; //toplam=toplam+sayi;




        }while (true); // zaten iceride kosul kontolu var bu kosul hep true  eger icerideki break calisirsa dongu kirilir.

        System.out.println("Girdiginiz " + sayac + "pozitif tam sayinin toplami "+ toplam);








    }
}
