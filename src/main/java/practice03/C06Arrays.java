package practice03;

import java.util.Arrays;

public class C06Arrays {
    public static void main(String[] args) {

           /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız

         */

        int[] arr = new  int[5]; // index degil eleman sayisi .
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));  // [0, 0, 0, 0, 0]
        //arrayin son elemanini 13 olarak guncelleyelim

        arr[4]=13;
        System.out.println(Arrays.toString(arr));

        //dinamik
        //arrayin son elamaninin indexi >> array uzunlugu -1 'dir.

        int sonIdx=arr.length-1;
        arr[sonIdx]=15;
        System.out.println(Arrays.toString(arr));


















    }
}
