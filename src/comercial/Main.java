package comercial;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<Livro> livroClass = Livro.class;
        if (livroClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = livroClass.getAnnotation(Tabela.class);
            System.out.println("Valor da tabela: " + tabela.value());
        } else {
            System.out.println("Anotação 'Tabela' não presente na classe 'Livro'.");
        }
    }
}

