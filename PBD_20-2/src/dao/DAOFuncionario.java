package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import model.Funcionario;
import util.ConnectionFactory;
import util.SQLFactory;

public class DAOFuncionario {

    java.sql.Date date = new java.sql.Date(0000-00-00);
	
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	
	SimpleDateFormat dataSDF = new SimpleDateFormat("yyyy/MM/dd");

	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception{
		try {
			conexao = ConnectionFactory.getConnection();
			
			this.statement = conexao.prepareStatement(SQLFactory.FuncionarioSQL.INSERT_FUNCIONARIO);
			this.statement.setString(1, funcionario.getNome());
			this.statement.setString(2, funcionario.getCpf_cnpj());
			this.statement.setString(3, funcionario.getTelefone());
			this.statement.setString(4, funcionario.getRg());
			this.statement.setString(5, funcionario.getEspecialidade());
			this.statement.setString(6, funcionario.getDataAdmissao());
			this.statement.setDouble(7, funcionario.getSalario());
			
			this.result = statement.executeQuery();
			this.result.next();
	    	funcionario.setId(result.getInt(1));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return funcionario;
	}
	
	public boolean buscarFuncionario(String cpf) throws Exception {
		try {
			conexao = ConnectionFactory.getConnection();

			this.statement = conexao.prepareStatement(SQLFactory.FuncionarioSQL.SELECT_CPF_FUNCIONARIO);
			this.statement.setString(1, cpf);
			this.result = statement.executeQuery();
			
			if (result.next()) {
				if (result.getString(1).equals(cpf)) {
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
