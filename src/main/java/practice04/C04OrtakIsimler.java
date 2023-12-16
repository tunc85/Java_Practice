package practice04;

import java.util.ArrayList;
import java.util.List;

public class C04OrtakIsimler {
    public static void main(String[] args) {
        /*
         * İki Array'de ortak bulunan elementleri yazdırınız.
         * (case sensitivity olmadan)

         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

         * Output : [brad,sofia,emily]
         */

        String[] arr={"John","Brad","Angel","Sofia","Emily"}; // dis loop

        String[] brr={"sofia","brad","grace","emily","hazel"}; // ic loop

        List<String> ortakIsimler= new ArrayList<>();

        for (String each1:arr) { // John
            for (String each2:brr) { // sofia
                if (each1.equalsIgnoreCase(each2)){ // john sofia'ya esitmi? degil 2. ismi alacak. brad
                    ortakIsimler.add(each1);
                }


            }

        }

        System.out.println(ortakIsimler); //[Brad, Sofia, Emily]























    }
}
