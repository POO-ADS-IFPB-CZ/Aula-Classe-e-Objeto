import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private float salario;

    public Funcionario(String nome, String cpf, LocalDate nascimento,
                       int matricula, float salario){
        super(nome, cpf, nascimento, matricula);
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float calcularPagamento(){
        return salario;
    }

}