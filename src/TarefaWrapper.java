import java.util.Scanner;

public class TarefaWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor numérico: ");
        int numeroPrimitivo = scanner.nextInt();

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);
        
        System.out.println("Valor como tipo primitivo: " + numeroPrimitivo);
        System.out.println("Valor como tipo wrapper: " + numeroWrapper);
    }
}
