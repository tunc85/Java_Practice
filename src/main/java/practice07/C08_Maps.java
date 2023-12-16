package practice07;

import java.util.HashMap;
import java.util.Map;

public class C08_Maps {
    public static void main(String[] args) {

        /*
İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
    input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
    output : {John=Doe, Mark=Twain, Ali=Can};
 */

        String[] isimler={"John", "Mark", "Ali"};
        String[] soyIsimler= {"Doe", "Twain", "Can"};

        HashMap<String,String>map=new HashMap<>(); // bos map

        for (int i = 0; i < isimler.length; i++) {
           map.put( isimler[i],soyIsimler[i]);

        }
        System.out.println(map); // {John=Doe, Mark=Twain, Ali=Can}





    }
}
