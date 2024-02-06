public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = String.valueOf(0000000000);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + cpf);
    }
}
