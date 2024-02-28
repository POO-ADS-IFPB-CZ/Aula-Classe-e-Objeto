import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123, "João", "123.123.123-12",
                "ADS", 3,
                LocalDate.of(2000,12,1));

        aluno.setMatricula(963);

        aluno.setNome("João da Silva");

        System.out.println(aluno.getNome().toUpperCase());


    }
}