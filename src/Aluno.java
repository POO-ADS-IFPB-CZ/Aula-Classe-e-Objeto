import java.time.LocalDate;
public class Aluno {
    private int matricula;
    private String nome;
    private String cpf;
    private String curso;
    private int periodo;
    private LocalDate nascimento;

    public Aluno(int matricula, String nome, String cpf, String curso,
                 int periodo, LocalDate nascimento){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.periodo = periodo;
        this.nascimento = nascimento;
    }

    public Aluno(int matricula){
        this.matricula = matricula;
    }

    public Aluno(){
    }

    public int getMatricula(){
        return matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getCurso(){
        return curso;
    }

    public int getPeriodo(){
        return periodo;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

}
