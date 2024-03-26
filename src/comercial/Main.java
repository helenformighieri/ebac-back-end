package comercial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Maria", "Feminino"),
                new Pessoa("João", "Masculino"),
                new Pessoa("Ana", "Feminino"),
                new Pessoa("Carlos", "Masculino")
        );

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        mulheres.forEach(m -> System.out.println(m.getNome()));
    }
}
