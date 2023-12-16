package practice07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C07_Set {

    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};

    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5}; //  {1,2,3,4,5}
        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 3, 4, 4, 5]
        
        arr=benzersizYap(arr);



    }


    private static int[] benzersizYap(int[] arr) {
        Set<Integer> tekrarsiz= new HashSet<>();
        for (int each:arr) {
            tekrarsiz.add(each);
        }
        System.out.println(tekrarsiz);  // [1, 2, 3, 4, 5]

        int[] brr = new int[tekrarsiz.size()];
        int idx=0;
        for ( Integer w:tekrarsiz) {
            brr[idx]=w;

        }
        return brr;
    }

}
