
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero result = new Numero();

        menu();
        int escolha;
        escolha = leitor.nextInt();

        while (escolha < 0 || escolha > 4) {

            msgValorInvalido();
            menu();
            escolha = leitor.nextInt();
        }

        switch (escolha) {
            case 1: {
                System.out.println("Operação escolhida: 1 - soma");
                valueXmsg();
                n1.setValor(leitor.nextInt());

                valueYmsg();
                n2.setValor(leitor.nextInt());

                result.setValor(result.somar(n1.getValor(), n2.getValor()));
                System.out.println("A soma dos valores é: " + result.getValor());
                break;
            }

            case 2: {
                System.out.println("Operação escolhida: 2 - subtração");
                valueXmsg();
                n1.setValor(leitor.nextInt());

                valueYmsg();
                n2.setValor(leitor.nextInt());

                result.setValor(result.subtract(n1.getValor(), n2.getValor()));
                System.out.println("A subtração dos valores é: " + result.getValor());
                break;
            }

            case 3: {
                System.out.println("Operação escolhida: 3 - multiplicação");
                valueXmsg();
                n1.setValor(leitor.nextInt());

                valueYmsg();
                n2.setValor(leitor.nextInt());

                result.setValor(result.multi(n1.getValor(), n2.getValor()));
                System.out.println("A multiplicação dos valores é: " + result.getValor());
                break;
            }

            case 4: {
                System.out.println("Operação escolhida: 4 - divisão");
                valueXmsg();
                n1.setValor(leitor.nextInt());

                valueYmsg();
                n2.setValor(leitor.nextInt());

                if (n1.getValor() > n2.getValor()) {
                    result.setValor(result.div(n1.getValor(), n2.getValor()));
                    System.out.println("A divisão dos valores é: " + result.getValor());
                } else {
                    System.out.println(
                            "Não é possível realizar a divisão nesta calculadora simples. Por favor, certifique-se de que está dividindo um número maior por um número menor.");
                }
                break;
            }
        }
    }

    private static void menu() {
        System.out.println("------ Calculadora Simples ------");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("---------------------------------");
        System.out.print("Escolha uma operação: ");
    }

    public static void valueXmsg() {
        System.out.print("Digite o valor x: ");
    }

    public static void valueYmsg() {
        System.out.print("Digite o valor y: ");
    }

    public static void msgValorInvalido() {
        System.out.println("-----------------------------------");
        System.err.println("Por favor, digite uma opção válida.");
        System.out.println("-----------------------------------");
    }
}
