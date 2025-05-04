public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Medium już jest wypożyczone: " + tytul);
        }
    }

    public void zwroc() {
        if (!dostepny) {
            dostepny = true;
            System.out.println("Zwrócono: " + tytul);
        } else {
            System.out.println("Medium nie było wypożyczone: " + tytul);
        }
    }

    public void wyswietlInformacje() {
        System.out.println(tytul + " (" + rokWydania + ") - " + (dostepny ? "Dostępne" : "Wypożyczone"));
    }
}
