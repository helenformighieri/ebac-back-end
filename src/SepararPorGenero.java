import java.util.HashMap;
import java.util.Map;

public class SepararPorGenero {
    public static void main(String[] args) {
        String entrada = "Malu-F,Marcos-M,Lua-F,Gilberto-M";

        String[] pares = entrada.split(",");

        Map<String, String> nomesFemininos = new HashMap<>();
        Map<String, String> nomesMasculinos = new HashMap<>();

        for (String par : pares) {
            String[] partes = par.split("-");
            String nome = partes[0];
            String sexo = partes[1];

            if (sexo.equals("F")) {
                nomesFemininos.put(nome, sexo);
            } else if (sexo.equals("M")) {
                nomesMasculinos.put(nome, sexo);
            }
        }
        
        System.out.println("Nomes Femininos:");
        for (Map.Entry<String, String> entry : nomesFemininos.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("\nNomes Masculinos:");
        for (Map.Entry<String, String> entry : nomesMasculinos.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}

