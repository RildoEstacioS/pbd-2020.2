package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Cliente;
import util.ConnectionFactory;
import util.SQLFactory;

public class DAOCliente {
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	
	public Cliente salvarCliente(Cliente cliente) throws Exception{
		
		try {
			conexao = ConnectionFactory.getConnection();
			
			this.statement = conexao.prepareStatement(SQLFactory.ClienteSQL.INSERT_CLIENTE);
			this.statement.setString(1, cliente.getNome());
			this.statement.setString(2, cliente.getCpf_cnpj());
			this.statement.setString(3, cliente.getTelefone());
			this.statement.setString(4, cliente.getCelular());
			this.statement.setString(5, cliente.getTipoCliente());
			this.statement.setString(6, cliente.getEndereco());
			this.statement.setDate(7, cliente.dataEntrada());
			this.statement.setDate(8, cliente.dataSaida());
			this.statement.setDouble(9, cliente.getValor());
		
			System.out.println("Deu certo!");
			this.result = statement.executeQuery();
			this.result.next();
			cliente.setId(result.getInt(1));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	public Cliente buscarCliente(String cpf) throws Exception {
		
		try {
			conexao = ConnectionFactory.getConnection();
			
			this.statement = conexao.prepareStatement(SQLFactory.ClienteSQL.SELECT_CLIENTE);
			this.statement.setString(1, cpf);
			this.result = statement.executeQuery();
			
			if (result.next()) {
				System.out.println(result.getString(1).equals(cpf));
				if (result.getString("Cpf").equals(cpf)) {
					return new Cliente(result.getString("nome"), result.getString("Cpf"), result.getString("Telefone"), result.getString("Celular"), result.getString("TipoCliente"), result.getString("Endereco"), result.getString("DataEntrada"), result.getString("DataSaida"), result.getInt("Valor"));
				}
			}
			return null;
		}
		catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return null;
	}
	
	
	
}
