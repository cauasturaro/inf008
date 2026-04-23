package secretaria;

import cadastro.Aluno;

public class Secretaria {

    public void mostrarDados(Aluno aluno) {
        System.out.println(aluno.nome);

        System.out.println(aluno.getMatricula());

        // erro de compilação
        // System.out.println(aluno.matricula);
    }
}