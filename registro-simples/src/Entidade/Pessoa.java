package Entidade;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String email;
    private Integer idade;

    Scanner leitor = new Scanner(System.in);

    public Pessoa(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Um menu seria exibido e a pessoa escolheria "1" ou "2" para, cadastrar ou pesquisar. Caso a escolha fosse "1", eu queria um método que cadastrasse a pessoa e colocaria seus dados dentro do vetor. Aqui eu tava testando uma maneira de cadastrar o usuário por meio de um método com uma ambientação (pra ficar mais amigável no terminal).

    /* 
    public void cadastrar() {

        System.out.println("Nome:");
        leitor.nextLine();

        System.out.println("E-mail:");
        leitor.nextLine();

        System.out.println("Idade:");
        leitor.nextInt();
    }
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override public String toString() {
        return "Nome: "+getNome()+
        "\n"+"E-mail: "+getEmail()+
        "\n"+"Idade: "+getIdade();
    }
}
 