import java.time.LocalDate;

public class Tecnico {

    private String cpf;
    private String nome;
    private int matricula;
    private LocalDate nascimento;
    private float salario;
    private String setor;

    public Tecnico(String cpf, String nome, int matricula, LocalDate nascimento,
                   float salario, String setor) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
        this.nascimento = nascimento;
        this.salario = salario;
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
