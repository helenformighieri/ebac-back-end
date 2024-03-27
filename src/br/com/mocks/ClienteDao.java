package br.com.mocks;

public class ClienteDao implements ICliente{
    public String salvar(){
        throw new UnsupportedOperationException("Não funciona sem configurar o banco de dados");
    }
}
