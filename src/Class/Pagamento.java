package Class;

public class Pagamento {

    private String id;
    private String valor;
    private String metodoPagamento;
    private boolean statusPagamento;

    public Pagamento(String id, String valor, String metodoPagamento, boolean statusPagamento) {
        this.id = id;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
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
