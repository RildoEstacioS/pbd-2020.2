package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SQLFactory {

	 //UTIL
	
	//FUNCIONARIO
	
	public static class FuncionarioSQL{
		
		public static final String INSERT_FUNCIONARIO = "insert into Funcionario (Nome, Cpf, Telefone, Rg, Especialidade, Salario, DataAdmissao) values (?, ?, ?, ?, ?, ?, ?) returning idFuncionario";
	
		public static final String SELECT_CPF_FUNCIONARIO = "SELECT Cpf FROM funcionario where Cpf = (?)";	

		public static final String SELECT_FUNCIONARIO = "SELECT * From Funcionario where Cpf = (?)";
	}
	
	
	//CLIENTE
	public static class ClienteSQL{
		
		public static final String INSERT_CLIENTE = "insert into Cliente (Nome, Cpf, Telefone, Celular, TipoCliente, Endereco, DataEntrada, DataSaida, Valor) values (?, ?, ?, ?, ?, ?, ?, ?, ?) returning idCliente";

		public static final String SELECT_CPF_CLIENTE = "SELECT Cpf from cliente where Cpf = (?)";
		
		public static final String SELECT_CLIENTE = "SELECT * From cliente where Cpf = (?)";

	}
	
	//VEICULO
	
	public static class VeiculoSQL{
		
		public static final String INSERT_VEICULO = "insert into Veiculo (Marca, Modelo, Placa, idCliente) values (?,?,?,?) returning id";
		
		public static final String BUSCAR_VEICULO = "SELECT placa from Veiculo where placa = (?)";
	}
//	
//	public static boolean getFuncionarios() throws Exception{
//		//List<Funcionario> funcionarios = new ArrayList<Funcionario>();
//		
//        
//        try {
//	    	conexao = SQLFactory.getConnection();
//
//            statement = conexao.prepareStatement("SELECT * FROM Funcionario");
//            result = statement.executeQuery();
//            while (result.next()) {
//				System.out.println("Dados dos Funcionarios: \n" + "Id:" + result.getInt("IdFuncionario") + " - Nome: " + result.getString("Nome") + " - Cpf/Cnpj: " + result.getString("Cpf_Cnpj") + " - Telefone: " 
//										 + result.getString("Telefone") + " - RG: " + result.getString("RG") + " - Especialidade: " + result.getString("Especialidade") 
//										 + " - Data Admissão: " + result.getString("DataAdmissao") + " - Salário: " + result.getFloat("Salario"));
//				//funcionarios.add(funcionario)
//			}
//            //return funcionarios;
//			return true;
//
//
//        }catch (Exception e) {
//			e.printStackTrace();
////			System.out.println("Deu pau na budega!");
//        	// TODO: handle exception
//		}
//		return false;
//       
//	}
//	
//	
//	public static float getMediaSalario() throws Exception{
//		float mediaSalario = 0;
//		
//        
//        try {
//	    	conexao = SQLFactory.getConnection();
//
//            statement = conexao.prepareStatement("SELECT sum(f.salario)/count(f.idFuncionario) media FROM Funcionario f");
//            result = statement.executeQuery();
//            while (result.next()) {
//				mediaSalario = result.getFloat("media");				
//			}
//			return mediaSalario;
//
//
//        }catch (Exception e) {
//			e.printStackTrace();
////			System.out.println("Deu pau na budega!");
//        	// TODO: handle exception
//		}
//        return 0;
//	}
//	
//	public static ArrayList<String> getClienteFuncionario() {
//		ArrayList<String> Clientes = new ArrayList<>();
//		
//		ArrayList<String> FuncionarioCliente = new ArrayList<>();
//
//        try {
//	    	conexao = SQLFactory.getConnection();
//
//            statement = conexao.prepareStatement("SELECT  Cpf_Cnpj C FROM Cliente");
//            result = statement.executeQuery();
//            while (result.next()) {
////            	System.out.println(result.getString("C"));
//				Clientes.add(result.getString("C")) ;				
//			}
////            System.out.println(Clientes);
//            statement = conexao.prepareStatement("SELECT * FROM Funcionario");
//			result = statement.executeQuery();
//			
//            while (result.next()) {	
//            	for (String c : Clientes) {
//            		if (result.getString("Cpf_Cnpj").equals(c) ) {
//            			FuncionarioCliente.add( "\n Nome: " + result.getString("Nome") + " Cpf: " + result.getString("Cpf_Cnpj"));
//            		}
//					
//				}
//			}
//            
//        }catch (Exception e) {
//        	e.printStackTrace();
////        	System.out.println("Deu pau na budega!");
//        	// TODO: handle exception
//        	return null;
//        }   
//        
//        return FuncionarioCliente;
//
//	}


	
}
