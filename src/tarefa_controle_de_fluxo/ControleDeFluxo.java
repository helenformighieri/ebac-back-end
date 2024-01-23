import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + " do aluno: ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Por favor, insira uma nota válida (entre 0 e 10).");
                i--;
            } else {
                somaNotas += nota;
            }
        }

        double media = somaNotas / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
