package Class;

import Services.ReservaService;

public class Reserva {

    private String id;
    private Passageiro passageiro;
    private Voo voo;
    private Assento assento;
    private String status;
    private int valor;

    private Pagamento pagamento;
    
    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private ReservaService reservaService;
    
    // Construtor
    public Reserva() {
        this.reservaService = new ReservaService(); // Serviço é instanciado internamente
    }
    
    public String getId() {
        return id;
    }
    
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
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

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
