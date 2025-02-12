package Class;

import Services.PassageiroService;

public class Passageiro {

    private String nome;
    private long cpf;
    private String dataNascimento;
    private String email;
    private String typePassaporte;
    private String programaFidelidade;

    // Instância do serviço de reserva
    @SuppressWarnings("unused")
    private PassageiroService passageiroService;

    // Construtor
    public Passageiro(String nome, long cpf, String dataNascimento, String email, String typePassaporte,
            String programaFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.typePassaporte = typePassaporte;
        this.programaFidelidade = programaFidelidade;
        this.passageiroService = new PassageiroService(); // Serviço é instanciado internamente
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
