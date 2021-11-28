package model;

public abstract class Pessoa {

	private String nome;
	private String cpf_cnpj;
	private String telefone;


	public Pessoa(String nome, String cpf_cnpj, String telefone) {
		super();
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf_cnpj=" + cpf_cnpj + ", telefone=" + telefone + "]";
	}
	
	
}
