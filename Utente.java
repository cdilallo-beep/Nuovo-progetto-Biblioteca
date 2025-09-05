public class Utente {
    private String nome;
    private int id;

    // Costruttore
    public Utente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Versione migliorata del toString()
    @Override
    public String toString() {
        return "Utente: " + nome + " (ID: " + id + ")";
    }
}