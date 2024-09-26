package Class;

public class Passageiro {

    private String nome;
    private int cpf;
    private String dataNascimento;
    private String email;
    private String typePassaporte;
    private String programaFidelidade;

    public Passageiro(String nome, int cpf, String dataNascimento, String email, String typePassaporte,
            String programaFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.typePassaporte = typePassaporte;
        this.programaFidelidade = programaFidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
