class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private String curso;

    // TODO: Criar 3 construtores sobrecarregados:
    // Um deve chamar o outro para evitar duplicação
    // 1. Apenas matricula e nome
    public Aluno(String matricula, String nome) {
        validarMatricula(matricula);
        this.matricula = matricula;
        this.nome = nome;
    }

    // 2. Matricula, nome e idade
    public Aluno(String matricula, String nome, int idade) {
        this(matricula, nome);
        this.idade = idade;
    }

    // 3. Matricula, nome, idade e curso
    public Aluno(String matricula, String nome, int idade, String curso) {
        this(matricula, nome, idade);
        this.curso = curso;
    }
    
    // TODO: Definir quais getters são realmente necessários
    public String getMatricula() { return this.matricula; }
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
    public String getCurso() { return this.curso; }
    
    // TODO: Criar método privado validarMatricula(String matricula)
    private void validarMatricula(String matricula) {
        if(matricula == null || matricula.trim().isEmpty())
            throw new IllegalArgumentException("Matrícula inválida");
    }
}

public class questao3 {
    public static void main(String[] args) {
        
    }
}
