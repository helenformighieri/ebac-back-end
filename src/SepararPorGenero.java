import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SepararPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome ou 'fim' para encerrar: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o sexo sendo M para masculino, F para feminino: ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();

            if (sexo == 'M' || sexo == 'm') {
                nomesMasculinos.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
            }
        }

        System.out.println("\nLista de nomes femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        System.out.println("\nLista de nomes masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
