package practice05;

import java.util.Arrays;

public class C01MDA {
    public static void main(String[] args) {
         /*
        mdarray olusturun yazdırın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int[][] arr1= new int[3][2];//{{0,0},{0,0},{0,0}}
        int [][] arr={{3,5},{-8,6,9,-1},{14,10,3}};

        System.out.println(Arrays.deepToString(arr)); // [[3, 5], [-8, 6, 9, -1], [14, 10, 3]]

        int[] brr=new int[arr.length]; // bu arraye arr arrayinin her bir ic arrayinin elemanlari toplamini koyacagim
           int idx=0;
        for (int[] each:arr) { // each> ic arraylar > 3,5
            int toplam=0;
            for (int each2:each) { // each2> ic arraydaki elemanlar > 3 >> 5
                toplam+=each2; //8

            }
            brr[idx]=toplam;
            idx++;

        }

        for (int i = 0; i < arr.length ; i++) {//dıs arrayin her bir elemanı gelecek

            int toplam=0;
            for (int j = 0; j <arr[i].length ; j++) {//ic arrayin her nir elemanı gelecek
                toplam+=arr[i][j] ;

            }

            brr[i]=toplam;
        }

















    }
}
