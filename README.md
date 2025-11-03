# defesa-miniprojeto-mod2

# Sistema de Gerenciamento de Consultas e Funcionários

## Descrição do Projeto
Este projeto em Java simula o gerenciamento de funcionários e consultas em um consultório de nutrição.  
Ele demonstra conceitos de **herança**, **interfaces**, **listas estáticas**, **sobrescrita de métodos** e **tratamento de exceções**.

---

## Estrutura do Projeto

- **Funcionario.java**  
  Classe base para todos os funcionários, com atributos `nome`, `idade` e `salario`.

- **Nutricionista.java**  
  Subclasse de `Funcionario`, adiciona `numeroConsultas`.

- **Consulta.java**  
  Representa uma consulta com `Nutricionista`, `nomePaciente` e `dataHora`.

- **QuadroFuncionarios.java**  
  Lista estática que armazena todos os funcionários.

- **IConsultaManager.java**  
  Interface que define métodos para gerenciar consultas:  
  - `AdicionaConsulta(Consulta consulta)`  
  - `RetornaConsultas()`  
  - `DeletaConsulta(int posicao)`

- **ConsultasImpl.java**  
  Implementa `IConsultaManager` e gerencia a lista de consultas com tratamento de exceções.

- **Main.java**  
  Demonstra a criação de objetos, adição nas listas e impressão de relatórios usando `toString()`.

---

## Funcionalidades Implementadas

1. Criação de `Funcionario`, `Nutricionista` e `Consulta`.  
2. Armazenamento de funcionários em `QuadroFuncionarios`.  
3. Gerenciamento de consultas via `ConsultasImpl`.  
4. Impressão de relatórios de funcionários e consultas com informações detalhadas.  
5. Uso de `toString()` para exibição legível de objetos.  
6. Tratamento de erros ao adicionar ou remover consultas.

---

