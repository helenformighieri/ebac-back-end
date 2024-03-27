package br.com.mocks;

public class ContratoDao implements IContratoDao{
    @Override
    public String salvar(){
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar(){
        throw new UnsupportedOperationException("Não implementado ainda");
    }

    @Override
    public String excluir(){
        throw new UnsupportedOperationException("Não implementado ainda");
    }

    @Override
    public String atualizar(){
        throw new UnsupportedOperationException("Não implementado ainda");
    }
}
