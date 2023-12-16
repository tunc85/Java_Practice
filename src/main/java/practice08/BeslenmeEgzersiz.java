package practice08;

public enum BeslenmeEgzersiz {
    Ocak("Havuc", "Nar", 17),
    Subat("Lahana", "Ayva", 16),
    Mart("Roka","Muz",19),
    Nisan("Enginar","Cagla",20),
    Mayis("Patlican","Erik",22),
    Haziran("Domates","Kayisi",27),
    Temmuz("Misir","Karpuz",30),
    Agustos("Borulce","Incir",29),
    Eylul("Mantar","Uzum",26),
    Ekim("Lahana","Armut",24),
    Kasim("Karnabahar","Hurma",21),
    Aralik("Pirasa","Portakal",19);

    BeslenmeEgzersiz(String ayinSebzesi, String ayinMeyvesi, int egzersizSaati) {
        this.ayinSebzesi = ayinSebzesi;
        this.ayinMeyvesi = ayinMeyvesi;
        this.egzersizSaati = egzersizSaati;
    }

    private final String ayinSebzesi;
    private final String ayinMeyvesi;

    private final int egzersizSaati;

    public String getAyinSebzesi() {
        return ayinSebzesi;
    }

    public String getAyinMeyvesi() {
        return ayinMeyvesi;
    }

    public int getEgzersizSaati() {
        return egzersizSaati;
    }
}
