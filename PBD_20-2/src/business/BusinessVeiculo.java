package business;

import dao.DAOVeiculo;
import model.Veiculo;

public class BusinessVeiculo {

	private DAOVeiculo daoVeiculo;
	
	public BusinessVeiculo() {
		daoVeiculo = new DAOVeiculo();
	}
	
	public Veiculo salvarVeiculo(Veiculo veiculo) throws Exception {
		return daoVeiculo.salvarVeiculo(veiculo);
	}
	
	public boolean buscarVeiculo(String placa) throws Exception {
		return daoVeiculo.buscarVeiculo(placa);
	}
	
}
