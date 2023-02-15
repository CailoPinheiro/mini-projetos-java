package Program;
import java.util.Scanner;
import Entidade.Pessoa;
public class Registro {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa[] = new Pessoa[5];
        pessoa[0] = new Pessoa("Pessoa" , "sample@outlook.com", 18);
        pessoa[1] = new Pessoa("Pessoa" , "sample@outlook.com", 19);
        pessoa[2] = new Pessoa("Pessoa" , "sample@outlook.com", 20);
        pessoa[3] = new Pessoa("Pessoa" , "sample@outlook.com", 14);
        pessoa[4] = new Pessoa("Pessoa" , "sample@outlook.com", 31);

        for (int cont = 0; cont < pessoa.length;cont++) {
            System.out.println("Nome: " + pessoa[cont].getNome() + (" " + cont));
            System.out.println("E-mail do desgramado: " + pessoa[cont].getEmail());
            System.out.println("Idade do infeliz: " + pessoa[cont].getIdade());
            System.out.println("----------------------------------------");

            System.out.println("Agora com toString:");
            System.out.println(pessoa[cont]);
        }
    }
}
