import java.util.ArrayList;
import java.util.List;

public interface IConsultaManager {
    void AdicionaConsulta(Consulta consulta);
    List<Consulta> RetornaConsultas();
    void DeletaConsulta(int posicao);
}

public class ConsultasImpl implements IConsultaManager{

    // Propriedade estática que armazena a lista de consultas.
    // É inicializada automaticamente com um novo ArrayList.
    public static List<Consulta> listaConsultas = new ArrayList<>();


@Override

public void AdicionaConsulta(Consulta consulta) {

    try {
        listaConsultas.add(consulta);
        System.out.println("Consulta adicionada com sucesso!");
    } catch (Exception e) {
        System.out.println("Erro ao adicionar consulta: " + e.getMessage());
    }
}

@Override
    public List<Consulta> RetornaConsultas() {
        return listaConsultas;
    }

    @Override
    public void DeletaConsulta(int posicao) {
        try {
            listaConsultas.remove(posicao);
            System.out.println("Consulta removida com sucesso!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida: " + posicao);
        } catch (Exception e) {
            System.out.println("Erro ao remover consulta: " + e.getMessage());
        }
    }
}





