package business;

import dao.DAOCliente;
import model.Cliente;

public class BusinessCliente {

	private DAOCliente daoCliente;

	public BusinessCliente() {
		super();
		this.daoCliente = new DAOCliente();
	}
	
	public Cliente salvarCliente(Cliente cliente) throws Exception {
		return daoCliente.salvarCliente(cliente);
	}
	
	public Cliente buscarCliente(String cpf) throws Exception {
		return daoCliente.buscarCliente(cpf);
	}
	
	
}
