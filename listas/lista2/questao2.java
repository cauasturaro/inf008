class Post {
    private String conteudo;
    private String autor;
    private int curtidas;
    private boolean publico;

    public Post(String conteudo, String autor) {
        this(conteudo, autor, true);
    }

    public Post(String conteudo, String autor, boolean publico) {
        validarConteudo(conteudo);
        this.conteudo = conteudo;
        this.autor = autor;
        this.publico = publico;
    }

    // TODO: Sobrecarregar curtir(): void e curtir(int quantidade): void
    // Ambos devem usar um método privado para validar quantidade

    public void curtir() {
        adicionarCurtidas(1);
    }

    public void curtir(int quantidade) {
        adicionarCurtidas(quantidade);
    }

    private void adicionarCurtidas(int quantidade) {
        validarCurtidas(quantidade);
        this.curtidas += quantidade;
    }
    private void validarCurtidas(int curtidas) {
        if (curtidas < 0)
            throw new IllegalArgumentException("Número inválido de curtidas");
    }

    private void validarConteudo(String conteudo) {
        if (conteudo == null || conteudo.trim().isEmpty()) {
        throw new IllegalArgumentException("Conteúdo não pode ser vazio");
    }
}

public class questao2 {
    public static void main(String[] args) {
        
    }
}
