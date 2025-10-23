public class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    // constru. vazio
       public Funcionario() {
       
        this.nome = "Sem nome";
        this.idade = 0;
        this.salario = 0.0;
    
    }

    // contru. parametros 
    
    public Funcionario(String nome, int idade , double salario) {

        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // metodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }


}