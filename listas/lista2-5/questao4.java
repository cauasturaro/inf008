class AgendamentoConsulta {
    private String paciente;
    private String especialidade;
    private String data;
    private double valor;

    public AgendamentoConsulta(String paciente, String especialidade, String data, double valor) {
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.data = data;
        this.valor = valor;
    }

    public AgendamentoConsulta update(String paciente, String especialidade, String data, double valor) {
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.data = data;
        this.valor = valor;
        return this;
    }

}

public class questao4 {
    public static void main(String[] args) {
        AgendamentoConsulta consulta = new AgendamentoConsulta(
            "João",
            "Cardiologia",
            "10/05",
            200.0
        );

        consulta
            .update("Carlos", "Ortopedia", "20/05", 400.0)
            .update("Ana", "Pediatria", "25/05", 150.0);
    }
}
