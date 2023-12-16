package practice06.inheritance02;

public class Opel extends Araba{
    protected String hiz="Opel arabalar max 220 km hiz yapar.";
    protected  String marka="Opel";
    protected  String sirketMerkezi="Almanya";
    protected  void garanti(){
        System.out.println("Opel arabalar 2 yil garantilidir");
    }
    //method overriding

    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanirlar");
    }
}
