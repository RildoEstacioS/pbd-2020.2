package business;

import dao.DAOFuncionario;
import model.Funcionario;

public class BusinessFuncionario {

	private DAOFuncionario daoFuncionario;

	public BusinessFuncionario() {
		super();
		this.daoFuncionario = new DAOFuncionario();
	}
	
	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception {
		return daoFuncionario.salvarFuncionario(funcionario);
	}
	
	public boolean buscarFuncionar(String cpf) throws Exception {
		return daoFuncionario.buscarFuncionario(cpf);
	}
}
