package Program;
import java.util.Scanner;
import Entidade.Pessoa;
public class Registro {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa[] = new Pessoa[5];
        pessoa[0] = new Pessoa("Naruto" , "sample@outlook.com", 18);
        pessoa[1] = new Pessoa("Cailo" , "sample@outlook.com", 22);
        pessoa[2] = new Pessoa("Salazar" , "sample@outlook.com", 20);
        pessoa[3] = new Pessoa("Josefino Pinto" , "sample@outlook.com", 14);
        pessoa[4] = new Pessoa("Jesus" , "sample@outlook.com", 31);


        /* 
        for (int cont = 0; cont < pessoa.length;cont++) {
            System.out.println("Nome: " + pessoa[cont].getNome() + (" " + cont));
            System.out.println("E-mail do desgramado: " + pessoa[cont].getEmail());
            System.out.println("Idade do infeliz: " + pessoa[cont].getIdade());
            System.out.println("----------------------------------------");

            System.out.println("Agora com toString:");
            System.out.println(pessoa[cont].toString());
            System.out.println("----------------------------------------");
        }
        */

        int cont = 1; 
        for (Pessoa vetor : pessoa) {
            System.out.println("----------------------------------------");
            System.out.println("Usuário - " + cont + "\n" + vetor);
            cont++;
        }

        // busca do usuário pelo nome

        

    }
}
