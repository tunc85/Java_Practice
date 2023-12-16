package practice07;
public class C01_Encapsulation {
    /*
bir class olusturun
private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
parametreli ve parametresiz constructor olusturun
bu variablelara ait getter setter methodlarını olusturun
toString methodunu olusturun
 */
    private String isim;
    private String soyisim;
    private int yas;
    public C01_Encapsulation(String isim, String soyisim, int yas) {
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim=isim;
        }else{
            System.out.println("Isim buyuk harfle baslamalidir");
        }
        this.soyisim = soyisim;
        if (yas<0){
            System.out.println("Yas negatif deger alamaz");
        }else{
            this.yas = yas;
        }
    }
    public C01_Encapsulation() {
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim=isim;
        }else{
            System.out.println("Isim buyuk harfle baslamalidir");
        }
    }
    public String getSoyisim() {
        return soyisim;
    }
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        if (yas<0){
            System.out.println("Yas negatif deger alamaz");
        }else{
            this.yas = yas;
        }
    }
    @Override
    public String toString() {
        return "C01_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
    /*
    POJO
    1-private variable
    2-parametreli constructor
    3-parametresiz constructor
    4-getter, setter
    5-toString
     */
}