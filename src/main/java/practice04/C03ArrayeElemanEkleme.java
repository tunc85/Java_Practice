package practice04;

import java.util.Arrays;

public class C03ArrayeElemanEkleme {
    public static void main(String[] args) {

         /*
        verilen arraye istenen bir elemanı ekleyen bir kod yazınız
        int [] arr={1,4,7,11};
        eklenecek eleman = 5 ;
         */


        int[] arr={1,4,7,11};
        int eklenecek=5;
        System.out.println(Arrays.toString(arr)); // [1, 4, 7, 11]
        //arrayden 1 fazla eleman iceren yeni bir array olusturalim
        int[] brr= new int[arr.length+1];

        //arr'nin elemanlarini tek tek brr'ye ekleyelim

        for (int i = 0; i <arr.length ; i++) {
            brr[i]=arr[i];


        }
        System.out.println(Arrays.toString(brr)); // [1, 4, 7, 11, 0]
        brr[brr.length-1]=eklenecek;
        System.out.println(Arrays.toString(brr));
        arr=brr; // data turlerinin ayni olmasi yani ikisininde array olmasi.
        System.out.println(Arrays.toString(arr));
        //lenght+1 diyerek arr'ye 1 default ekledik
        //brr'ye aktarirkende eklemek istedigimiz sayiyi boylece ekledik












    }


}
