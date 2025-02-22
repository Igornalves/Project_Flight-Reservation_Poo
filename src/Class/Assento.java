package Class;

import Services.AssentosService;

public class Assento {

    private int numero;

    // a classe econômica, a classe executiva (business) e a primeira classe
    private String classe;
    private boolean disponibilidade;
    
    // Passageiros viajando com crianças menores de 2 anos de idade. Gestantes.
    // Passageiros com mais de 60 anos de idade. Passageiros que precisam de
    // assistência para embarcar.
    private String preferencial;

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private AssentosService assentosService;

    // Construtor
    public Assento() {
        this.assentosService = new AssentosService(); // Serviço é instanciado internamente
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
