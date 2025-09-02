public class Libro {
    private String titolo;
    private String autore;
    private int anno;

    // costruttore vuoto
    public Libro() {}

    // costruttore completo
    public Libro(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    // getter e setter
    public String getTitolo() { return titolo; }
    public void setTitolo(String nuovoTitolo) { this.titolo = nuovoTitolo; }

    public String getAutore() { return autore; }
    public void setAutore(String nuovoAutore) { this.autore = nuovoAutore; }

    public int getAnno() { return anno; }
    public void setAnno(int nuovoAnno) { this.anno = nuovoAnno; }

}

