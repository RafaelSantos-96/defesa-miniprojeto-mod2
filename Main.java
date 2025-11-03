import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Criação de objetos
        Funcionario funcionario = new Funcionario("João", 30, 2500.0);

        Nutricionista nutricionista = new Nutricionista("Maria", 28, 3500.0, 5);

        Consulta consulta1 = new Consulta(nutricionista, "Paciente A", LocalDateTime.of(2025, 11, 5, 10, 0));
        Consulta consulta2 = new Consulta(nutricionista, "Paciente B", LocalDateTime.of(2025, 11, 6, 14, 30));
        Consulta consulta3 = new Consulta(nutricionista, "Paciente C", LocalDateTime.of(2025, 11, 7, 9, 15));

        // 2️⃣ Gerenciamento de dados
        // Adicionando funcionário e nutricionista à lista
        QuadroFuncionarios.listaFuncionarios.add(funcionario);
        QuadroFuncionarios.listaFuncionarios.add(nutricionista);

        // Criando instância de ConsultasImpl para gerenciar consultas
        ConsultasImpl gerenciadorConsultas = new ConsultasImpl();
        gerenciadorConsultas.AdicionaConsulta(consulta1);
        gerenciadorConsultas.AdicionaConsulta(consulta2);
        gerenciadorConsultas.AdicionaConsulta(consulta3);

        // 3️⃣ Relatórios e impressão

        // Relatório de Consultas
        System.out.println("\n=== Relatório de Consultas ===");
        for (Consulta c : gerenciadorConsultas.RetornaConsultas()) {
            System.out.println(c);
        }

        // Relatório de Funcionários
        System.out.println("\n=== Relatório de Funcionários ===");
        for (Funcionario f : QuadroFuncionarios.listaFuncionarios) {
            String tipo = (f instanceof Nutricionista) ? "Nutricionista" : "Funcionário";
            System.out.println(f + " | Tipo: " + tipo);
        }
    }
}
