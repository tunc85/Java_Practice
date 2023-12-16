package practice07;

public interface Muhasebe {
    //to do list

    //abstract methodlarda body yoktur

        //ekMesai ve vergi diye iki tane abstract method olusturalım

    public abstract double ekMesai(int calismaSaati);

        //interfacelerdeki tum methodlar public ve abstracttır

    double vergi(double brutMaas, int calismaYili);

}