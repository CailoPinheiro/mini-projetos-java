package Program;

import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import Entidade.Pessoa;

public class Registro {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa[] = new Pessoa[5];
        pessoa[0] = new Pessoa("Cailo", "sample@outlook.com", 18);
        pessoa[1] = new Pessoa("Person Sample", "sample@outlook.com", 22);
        pessoa[2] = new Pessoa("Person Sample", "sample@outlook.com", 20);
        pessoa[3] = new Pessoa("Person Sample", "sample@outlook.com", 14);
        pessoa[4] = new Pessoa("Person Sample", "sample@outlook.com", 31);

        /*
         * for (int cont = 0; cont < pessoa.length;cont++) {
         * System.out.println("Nome: " + pessoa[cont].getNome() + (" " + cont));
         * System.out.println("E-mail: " + pessoa[cont].getEmail());
         * System.out.println("Idade: " + pessoa[cont].getIdade());
         * System.out.println("----------------------------------------");
         * 
         * System.out.println("Agora com toString:");
         * System.out.println(pessoa[cont].toString());
         * System.out.println("----------------------------------------");
         * }
         */

        int cont = 1;
        for (Pessoa vetor : pessoa) {
            System.out.println("----------------------------------------");
            System.out.println("Usuário - " + cont + "\n" + vetor);
            cont++;
        }

        // Funcionalidade de pequisar por nome.

        System.out.println("Pesquisar um nome: ");
        String findName = leitor.next();
        cont = 1;

        
        for (Pessoa vetor : pessoa) {
            if (findName.equals(vetor.getNome())) {
                System.out.println("Encontrado no índice: " + cont);
                System.out.println("************************");
                System.out.println(vetor);
                cont++;
            } else {
                System.out.println("Nenhum resultado para \""+findName+"\" na posição "+cont);
                cont++;
            }
        }
        

        // Outra versão, utiizando boolean. Com o intuito de: caso não encontre, apenas exibir a mensagem que não foi encontrado. Ao contrário da versão anterior, que precisava dizer todas as posições em que não foi encontrado (Isso seria péssimo caso o vetor fosse muito grande).

        /* 
        boolean encontrado = false;
        for (Pessoa vetor : pessoa) {
            if (findName.equalsIgnoreCase(vetor.getNome())) {
                System.out.println("Encontrado no índice: " + cont);
                System.out.println("************************");
                System.out.println(vetor);
                encontrado = true;
                cont++;
            } else if (!encontrado){
                System.out.println("Nenhum resultado para \""+findName+"\"");
                break;
            }
        }
        */
    }
}
