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
        return "Nome: "+getNome()+"E-mail: "+getEmail()+"Idade: "+getIdade();
    }
}
