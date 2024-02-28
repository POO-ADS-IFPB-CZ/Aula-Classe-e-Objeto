import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor(123,
                "João", "111.111.111-01",
                LocalDate.of(2000,1,1),
                2950.50f, "Mestrado");
        Aluno aluno1 = new Aluno(123, "Maria",
                "222.222.222-02", "ADS", 3,
                LocalDate.of(2001,5,3));
        Aluno aluno2 = new Aluno(321, "Pedro",
                "333.333.333-03", "ADS", 3,
                LocalDate.of(2001,5,3));
        Aluno aluno3 = new Aluno(852, "José",
                "444.444.444-04", "ADS", 3,
                LocalDate.of(2001,5,3));

        Turma turma = new Turma(professor, aluno1, aluno2, aluno3,
                "POO");

        System.out.println(turma.getProfessor().getNome());

    }
}