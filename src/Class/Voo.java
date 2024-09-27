package Class;

import Services.VooService;

public class Voo {

    private int numeroVoo;
    private String origem;
    private String destino;
    private String dataPartida;
    private String dataChegada;
    private String companiaAerea;
    private String tipoAeronave;
    private int listaAssentos;

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private VooService vooService;

    // Construtor
    public Voo(int numeroVoo, String origem, String destino, String dataPartida, String dataChegada,
            String companiaAerea, String tipoAeronave, int listaAssentos) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.companiaAerea = companiaAerea;
        this.tipoAeronave = tipoAeronave;
        this.listaAssentos = listaAssentos;
        this.vooService = new VooService(); // Serviço é instanciado internamente
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getCompaniaAerea() {
        return companiaAerea;
    }

    public void setCompaniaAerea(String companiaAerea) {
        this.companiaAerea = companiaAerea;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public int getListaAssentos() {
        return listaAssentos;
    }

    public void setListaAssentos(int listaAssentos) {
        this.listaAssentos = listaAssentos;
    }

}
