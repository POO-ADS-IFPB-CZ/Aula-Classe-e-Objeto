import java.time.LocalDate;

public class Professor {

    private int matricula;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private float salario;
    private String titulacao;

    public Professor(int matricula, String nome, String cpf,
                     LocalDate nascimento, float salario, String titulacao){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.salario = salario;
        this.titulacao = titulacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
