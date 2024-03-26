package teste;

import comercial.Pessoa;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void testMulheres() {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Maria", "Feminino"),
                new Pessoa("João", "Masculino"),
                new Pessoa("Ana", "Feminino"),
                new Pessoa("Carlos", "Masculino")
        );

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        for (Pessoa mulher : mulheres) {
            assertEquals("Feminino", mulher.getSexo());
        }
    }
}
