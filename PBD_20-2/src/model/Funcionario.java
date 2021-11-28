package model;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Funcionario extends Pessoa{
	
	private int id;
	private String rg;
	private String especialidade;
	private double salario;
	private String dataAdmissao;
	private SimpleDateFormat dataSDF;
	
	public Funcionario(String nome, String cpf_cnpj, String telefone, String rg, String especialidade, double salario,
			String dataAdmissao) {
		super(nome, cpf_cnpj, telefone);
		this.dataSDF = new SimpleDateFormat("yyyy/MM/dd");
		this.rg = rg;
		this.especialidade = especialidade;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
//		this.dataAdmissao = dataSDF.parse(dataAdmissao);
		
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SimpleDateFormat getDataSDF() {
		return dataSDF;
	}

	public void setDataSDF(SimpleDateFormat dataSDF) {
		this.dataSDF = dataSDF;
	}
	
	
	
}
