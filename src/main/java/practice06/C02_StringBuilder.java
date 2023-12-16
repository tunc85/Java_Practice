package practice06;

public class C02_StringBuilder {
    public static void main(String[] args) {
            /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
             */
//1 - parametresiz constuructor kullanarak
        //2- String parametreli consturctor kullanarak
        //3- int parametreli constructor kullanarak

        StringBuilder sb1 = new StringBuilder(7);

        System.out.println("sb1.capacity() =" + sb1.capacity());
        System.out.println("  sb1.length() = "+ sb1.length());


        sb1.append("hava guzel"); // baslangic kapasitesi 2x2 +2 otomatik arttirdi
        System.out.println(sb1); // mutable

        String str= "merhaba"; // inmutable
        str= str.substring(5);
        System.out.println(str);

        /*sb1.capacity() =7
        sb1.length() = 0
        hava guzel
        ba*/


       int idx=  sb1.indexOf(" ");
        //System.out.println(idx); // 4
        sb1.deleteCharAt(idx);
        System.out.println(sb1); // havaguzel belli bir indexi bularak boslugu sildik

        sb1.reverse();
        System.out.println(sb1); // lezugavah ters cevirdik

        sb1.delete(sb1.length()-4,sb1.length()); // sadece lenght dersek basladigin yerden itibaren sil sonuna kadar sil anlaminda kullanabiliriz
        System.out.println(sb1); // lezug

        sb1.reverse(); // guzel
        //Java guzel

        sb1.insert(0,"Java ");
        System.out.println(sb1); // Java guzel







    }
}
