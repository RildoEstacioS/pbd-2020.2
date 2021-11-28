package facade;

import business.BusinessCliente;
import business.BusinessFuncionario;
import business.BusinessVeiculo;
import model.Cliente;
import model.Funcionario;
import model.Veiculo;

public class Facade {

	public static Facade instance;
	
	public BusinessCliente businessCliente;
	public BusinessFuncionario businessFuncionario;
	public BusinessVeiculo businessVeiculo;
	
	public Facade() {
		businessCliente = new BusinessCliente();
		businessFuncionario = new BusinessFuncionario();
		businessVeiculo = new BusinessVeiculo();
	}
	
	//Cliente
	public Cliente salvarCliente(Cliente cliente) throws Exception {
		return businessCliente.salvarCliente(cliente);
	}
	
	public Cliente buscarCliente(String cpf) throws Exception {
		return businessCliente.buscarCliente(cpf);
	}
	
	//Funcionario
	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception {
		return businessFuncionario.salvarFuncionario(funcionario);
	}
	
	public boolean buscarFuncionario(String cpf) throws Exception {
		return businessFuncionario.buscarFuncionar(cpf);
	}
	
	//Veiculo
	public Veiculo salvarVeiculo(Veiculo veiculo) throws Exception {
		return businessVeiculo.salvarVeiculo(veiculo);
	}
	
	public boolean buscarVeiculo(String placa) throws Exception {
		return businessVeiculo.buscarVeiculo(placa);
	}
}
