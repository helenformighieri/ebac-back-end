public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = String.valueOf(123456789);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
    }
}
