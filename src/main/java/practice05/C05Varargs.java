package practice05;

public class C05Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun

        String st1="Ali";
        String str2="Ridvan";
        String str3="Mehmet";
        String str4="Mustafa";
        String str5= "Kerem";

        enUzunKelimeYazdir (st1,str2,str3,str4,str5);
    }

    public static void enUzunKelimeYazdir(String...str) { // bir methodda yanliz 1 tane varargs ve sona yazilir.
        String enUzunKelime ="";
        for (String each:str) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }
        System.out.println(enUzunKelime);
    }

}
