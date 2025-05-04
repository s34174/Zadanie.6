public class Film extends MediaBiblioteczne {
    private String rezyser;
    private int czasTrwania;

    public Film(String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Reżyser: " + rezyser + ", Czas trwania: " + czasTrwania + " min");
    }

    public void sprawdzCzasTrwania() {
        if (czasTrwania > 120) {
            System.out.println(tytul + ": To długi film (" + czasTrwania + " min).");
        } else {
            System.out.println(tytul + ": To standardowy film (" + czasTrwania + " min).");
        }
    }
}