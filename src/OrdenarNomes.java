import java.util.Arrays;

public class OrdenarNomes {
    public static void main(String[] args) {
        String nomesString = "Helena, Catarina, Aurora, Daniel";

        String[] nomes = nomesString.split(",");

        String[] nomesOrdenados = ordenarNomes(nomes);

        System.out.println("Nomes em ordem alfabética: " + Arrays.toString(nomesOrdenados));
    }
    public static String[] ordenarNomes(String[] nomes) {
        Arrays.sort(nomes);
        return nomes;
    }
}
