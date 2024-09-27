package Class;

import Services.PagamentoService;

public class Pagamento {

    private String id;
    private String valor;
    private String metodoPagamento;
    private boolean statusPagamento;

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private PagamentoService pagamentoService;

    // Construtor
    public Pagamento(String id, String valor, String metodoPagamento, boolean statusPagamento) {
        this.id = id;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
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

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

}
