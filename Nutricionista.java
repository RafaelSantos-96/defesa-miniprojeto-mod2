public class Nutricionista extends Funcionario {

    int numeroConsultas;

    public Nutricionista() {

        super();
        this.numeroConsultas = 0;
        
    }

    public Nutricionista(String nome, int idade, double salario, int numeroConsultas) {

        super(nome, idade, salario);
        this.numeroConsultas = numeroConsultas;
    }


}