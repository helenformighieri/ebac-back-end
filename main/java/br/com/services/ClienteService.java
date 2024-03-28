package br.com.services;

import br.com.dao.IClienteDAO;
import br.com.domain.Cliente;
import br.com.exceptions.TipoChaveNaoEncontradaException;
import br.com.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
