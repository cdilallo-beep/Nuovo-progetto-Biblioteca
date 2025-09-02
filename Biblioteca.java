import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libri = new ArrayList<>();

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public void visualizzaLibri() {
        for (Libro libro : libri) {
            System.out.println(libro);
        }
    }
}