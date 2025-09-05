import model.Libro;
import model.Utente;
import service.BibliotecaService;

public class Main {
    public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Il nome della rosa", "Umberto Eco", 1980);
        biblioteca.aggiungiLibro(libro1);

        Utente utente = new Utente("Roberta", 1);
        biblioteca.prestaLibro("Il nome della rosa", utente);

        biblioteca.visualizzaLibriDisponibili();
    }
}