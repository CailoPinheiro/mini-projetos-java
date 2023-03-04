public class Matrizes {
    public static void main(String[] args) throws Exception {

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Aluno " + i + ": ");

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " - ");
            }

            System.out.println("\n-----------------------------------");
        }

        // Mudando uma coluna da matriz:

        notasAlunos[1][3] = 0;

        // Calculando a média de cada aluno: 

        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma=0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            } 
            double mediaAluno = soma/4;

            if (mediaAluno >=7) {
                System.out.print("Média do aluno " + i + ": " + mediaAluno);
                System.out.print(" - ");
                System.out.println("Status: Aprovado :D");
            } else {
                System.out.print("Média do aluno " + i + ": " + mediaAluno);
                System.out.print(" - ");
                System.out.println("Status: Reprovado :/");
            }
        }
    }
}
