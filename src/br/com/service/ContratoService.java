package br.com.service;

import br.com.mocks.IContratoDao;

public class ContratoService implements IContratoService{
    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao){
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar(){
        return contratoDao.salvar();
    }

    @Override
    public String buscar(){
        return contratoDao.buscar();
    }

    @Override
    public String excluir(){
        return contratoDao.excluir();
    }

    @Override
    public String atualizar(){
        return contratoDao.atualizar();
    }
}

