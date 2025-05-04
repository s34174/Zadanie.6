public class TestBiblioteki {
    public static void main(String[] args) {

        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", 1990, "Andrzej Sapkowski", 320);
        Film film1 = new Film("Zielona Mila", 1999, "Frank Darabont", 189);


        MediaBiblioteczne[] mediaArray = new MediaBiblioteczne[2];
        mediaArray[0] = ksiazka1;
        mediaArray[1] = film1;


        System.out.println("\n===== INFORMACJE O WSZYSTKICH MEDIACH =====");
        for (MediaBiblioteczne media : mediaArray) {
            media.wyswietlInformacje(); // działa dzięki przesłonięciu
            System.out.println("--------------------------");
        }


        System.out.println("\n===== OPERACJE WYPOŻYCZANIA I ZWRACANIA =====");
        ksiazka1.wypozycz(); // wypożyczenie
        ksiazka1.wypozycz(); // próba ponownego wypożyczenia — komunikat
        ksiazka1.zwroc();    // zwrot


        System.out.println("\n===== METODY SPECYFICZNE DLA TYPÓW =====");
        ksiazka1.sprawdzLiczbeStron();  // tylko dla Książka
        film1.sprawdzCzasTrwania();     // tylko dla Film


        System.out.println("\n===== RZUTOWANIE TYPOWE =====");
        for (MediaBiblioteczne media : mediaArray) {
            if (media instanceof Ksiazka) {
                Ksiazka k = (Ksiazka) media;
                k.sprawdzLiczbeStron();
            } else if (media instanceof Film) {
                Film f = (Film) media;
                f.sprawdzCzasTrwania();
            }
        }
    }
}