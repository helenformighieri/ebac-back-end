public class Main {
    public static void main(String[] args) {

        /*
         Classe que representa um objeto do mundo real - Livro.
         */
        class Livro {
            // Propriedades do livro
            private String titulo;
            private String autor;
            private int anoPublicacao;
            private String editora;

            // Construtor da classe Livro
            public Livro(String titulo, String autor, int anoPublicacao, String editora) {
                this.titulo = titulo;
                this.autor = autor;
                this.anoPublicacao = anoPublicacao;
                this.editora = editora;
            }

            // Métodos para acessar e modificar as propriedades
            public String getTitulo() {
                return titulo;
            }

            public void setTitulo(String titulo) {
                this.titulo = titulo;
            }

            public String getAutor() {
                return autor;
            }

            public void setAutor(String autor) {
                this.autor = autor;
            }

            public int getAnoPublicacao() {
                return anoPublicacao;
            }

            public void setAnoPublicacao(int anoPublicacao) {
                this.anoPublicacao = anoPublicacao;
            }

            public String getEditora() {
                return editora;
            }

            public void setEditora(String editora) {
                this.editora = editora;
            }

            // Método para exibir informações do livro
            public void exibirInformacoes() {
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Ano de Publicação: " + anoPublicacao);
                System.out.println("Editora: " + editora);
            }

            // Método main para testar a classe Livro
            public static void main(String[] args) {
                Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, "Editora B");
                livro.exibirInformacoes();
            }
        }

    }
}