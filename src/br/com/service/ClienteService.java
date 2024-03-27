package br.com.service;

import br.com.mocks.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
