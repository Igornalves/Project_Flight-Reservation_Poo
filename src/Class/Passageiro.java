package Class;

import java.util.ArrayList;
import java.util.List;

import Services.PassageiroService;

public class Passageiro {

    private String nome;
    private long cpf;
    private String dataNascimento;
    private String email;
    private String typePassaporte;
    private String programaFidelidade;

    @SuppressWarnings("unused")
    private List<Reserva> reservas; 

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private PassageiroService passageiroService;
    
    // Construtor
    public Passageiro() {
        reservas = new ArrayList<Reserva>();
        this.passageiroService = new PassageiroService(); // Serviço é instanciado internamente
    }

    public void adcionandoReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("sua reserva " + reserva.getValor() + " foi adcionada");
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
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    } 

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypePassaporte() {
        return typePassaporte;
    }

    public void setTypePassaporte(String typePassaporte) {
        this.typePassaporte = typePassaporte;
    }

    public String getProgramaFidelidade() {
        return programaFidelidade;
    }

    public void setProgramaFidelidade(String programaFidelidade) {
        this.programaFidelidade = programaFidelidade;
    }

}
