package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Veiculo;
import util.ConnectionFactory;
import util.SQLFactory;

public class DAOVeiculo {
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;

	public Veiculo salvarVeiculo(Veiculo veiculo) throws Exception{
		try {
			conexao = ConnectionFactory.getConnection();
			this.statement = conexao.prepareStatement(SQLFactory.VeiculoSQL.INSERT_VEICULO);
			this.statement.setString(1, veiculo.getMarca());
			this.statement.setString(2, veiculo.getModelo());
			this.statement.setString(3, veiculo.getPlaca());
			this.statement.setLong(4, veiculo.getCliente().getId());
		
			this.result = statement.executeQuery();
			this.result.next();
		}
		catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return veiculo;
	}
	
	public boolean buscarVeiculo(String placa) throws Exception{
		try {
			conexao = ConnectionFactory.getConnection();

			this.statement = conexao.prepareStatement(SQLFactory.VeiculoSQL.BUSCAR_VEICULO);
			this.statement.setString(1, placa);
			this.result = statement.executeQuery();
			
			if (result.next()) {
				if (result.getString(1).equals(placa)) {
					return true;
				}
			}
			return false;
		}
		catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return false;
	}
	
}
