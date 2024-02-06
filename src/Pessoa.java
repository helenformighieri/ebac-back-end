public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}

