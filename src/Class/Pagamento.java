package Class;

import Services.PagamentoService;

public class Pagamento {

    private String id;
    private String valor;
    private String metodoPagamento;
    private String statusPagamento;

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private PagamentoService pagamentoService;

    // Construtor
    public Pagamento() {
        this.pagamentoService = new PagamentoService(); // Serviço é instanciado internamente
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

}
