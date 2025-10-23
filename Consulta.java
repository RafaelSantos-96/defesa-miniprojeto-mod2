import java.time.LocalDateTime;

public class Consulta {

    private Nutricionista nutricionista;
    private String nomePaciente;
    private LocalDateTime dataHora;

    // Construtor com todas as propriedades
    public Consulta(Nutricionista nutricionista, String nomePaciente, LocalDateTime dataHora) {
        this.nutricionista = nutricionista;
        this.nomePaciente = nomePaciente;
        this.dataHora = dataHora;
    }

    // Métodos getters para acessar as propriedades privadas
    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

}