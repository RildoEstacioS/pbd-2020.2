package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

	public static String URL_MYSQL = "jdbc:mysql://localhost:3306/oficina_pbd";
	public static String Usuario_MYSQL = "root";
	public static String Senha_MYSQL = "Rildo@alucard1";
    
	private static PreparedStatement statement;
	private static ResultSet result;	
	
	private static Connection conexao = null; 

	public static Connection getConnection() throws Exception {
		try {
			if (conexao == null || conexao.isClosed()) {
				System.out.println("Chegou");
				conexao = DriverManager.getConnection(URL_MYSQL, Usuario_MYSQL, Senha_MYSQL);
				System.out.println("Fez a conexão!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}	
		return conexao;
	}
	
}
