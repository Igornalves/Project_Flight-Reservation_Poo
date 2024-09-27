package Class;

import Services.ReservaService;

public class Reserva {

    private String id;
    private Passageiro passageiro;
    private Voo voo;
    private Assento assento;
    private boolean status;
    private int valor;

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private ReservaService reservaService;

    // Construtor
    public Reserva(String id, Passageiro passageiro, Voo voo, Assento assento, boolean status, int valor) {
        this.id = id;
        this.passageiro = passageiro;
        this.voo = voo;
        this.assento = assento;
        this.status = status;
        this.valor = valor;
        this.reservaService = new ReservaService(); // Serviço é instanciado internamente
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
