import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws Exception {

        String nameInfo = "Nome: ", idadeInfo = "Idade: ", emailInfo = "Email: ";
        Scanner leitor = new Scanner(System.in);
        User person1 = new User();

        System.out.print(nameInfo);
        person1.setName(leitor.nextLine());

        System.out.print(emailInfo);
        person1.setEmail(leitor.nextLine());

        System.out.print(idadeInfo);
        person1.setIdade(leitor.nextInt());

        person1.mostrarStatus();
        
    }
}