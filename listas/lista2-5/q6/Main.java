import cadastro.Aluno;
import secretaria.Secretaria;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Cauã", "12345");
        Secretaria secretaria = new Secretaria();

        secretaria.mostrarDados(aluno);

        System.out.println(aluno.nome);

        System.out.println(aluno.getMatricula());

        // errro:
        // System.out.println(aluno.matricula);
    }
}