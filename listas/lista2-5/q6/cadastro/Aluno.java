package cadastro;

public class Aluno {
    public String nome;        
    private String matricula;  

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}