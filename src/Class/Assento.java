package Class;

public class Assento {

    private int numero;

    // a classe econômica, a classe executiva (business) e a primeira classe
    private String classe;
    private boolean disponibilidade;
    // Passageiros viajando com crianças menores de 2 anos de idade. Gestantes.
    // Passageiros com mais de 60 anos de idade. Passageiros que precisam de
    // assistência para embarcar.
    private String preferencial;

    public Assento(int numero, String classe, boolean disponibilidade, String preferencial) {
        this.numero = numero;
        this.classe = classe;
        this.disponibilidade = disponibilidade;
        this.preferencial = preferencial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(String preferencial) {
        this.preferencial = preferencial;
    }
}
