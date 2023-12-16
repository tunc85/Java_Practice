package practice08;

import java.util.Scanner;

public class C04_Fibonacci {
     /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */
    // 0 1
     public static void main(String[] args) {

         Scanner scan= new Scanner(System.in);
         System.out.println("Lutfen 47den kucuk bir tam sayi giriniz");
         int sayi = scan.nextInt();

         fibonacci(sayi);





     }

     public static void fibonacci(int sayi){
         //  0-1-1-2-3-5-8-13-21-34

         int num1=0;
         int num2=1;
         int num3;
         for (int i = 0; i < sayi; i++) {
             System.out.print(num1+"-");
             num3 = num1+num2;  // num3 son iki sayinin toplami , num 2 yi her defasinda birer saga
                                //kaydirmak icin elimde num3 degeri olmali
             num1=num2;
             num2=num3;

         }

     }
}
