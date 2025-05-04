public class Ksiazka extends MediaBiblioteczne {
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Autor: " + autor + ", Stron: " + liczbaStron);
    }

    public void sprawdzLiczbeStron() {
        if (liczbaStron > 500) {
            System.out.println(tytul + ": To długa książka (" + liczbaStron + " stron).");
        } else {
            System.out.println(tytul + ": To standardowa książka (" + liczbaStron + " stron).");
        }
    }
}
