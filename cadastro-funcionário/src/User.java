public class User {

    private String name;
    private String email;
    private int idade;

    public void mostrarStatus() {

        System.out.println("------------ Cadastro Realizado ------------");
        System.out.println("Nome:" + this.name);
        System.out.println("E-mail:" + this.email);
        System.out.println("Idade:" + this.idade);
        System.out.println("--------------------------------------------");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
