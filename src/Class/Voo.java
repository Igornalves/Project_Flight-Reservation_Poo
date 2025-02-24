package Class;

import java.util.List;

import Services.VooService;

public class Voo {

    private int numeroVoo;
    private String origem;
    private String destino;
    private String dataPartida;
    private String dataChegada;
    private String companiaAerea;
    private String tipoAeronave;
    private String status;

    private List<Assento> assentos;
    
    private List<Reserva> reservas;
    
    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private VooService vooService;
    
    // Construtor
    public Voo() {
        this.vooService = new VooService(); // Serviço é instanciado internamente
    } 

    public void adcionadoAssentos(Assento assento) {
        assentos.add(assento);
        System.out.println("o assento " + assento + " foi adcionando" + " \n \n");
    }

    public void removerAssento(Assento assento) {
        assentos.remove(assento);
        System.out.println("o assento " + assento + " foi removido com sucesso" + " \n \n");
    }

    public int quantidadeDeAssento() {
        return assentos.size();
    }

    public Assento getAssento(int intex) {
        return assentos.get(intex);
    }

    public void adcionandoReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("sua reserva " + reserva + " foi adcionada");
    }

    public void removendoReserva(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("sua reserva " + reserva + " foi removida");
    }

    public int quantidadeDereservas(){
        return reservas.size();
    }

    public Reserva getReserva (int intex){
        return reservas.get(intex);
    }

    // public List<Reserva> getReservas() {
    //     return reservas;
    // }
    
    // public void setReservas(List<Reserva> reservas) {
    //     this.reservas = reservas;
    // }
    
    // public List<Assento> getAssentos() {
    //     return assentos;
    // }

    // public void setAssentos(List<Assento> assentos) {
    //     this.assentos = assentos;
    // }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

}
