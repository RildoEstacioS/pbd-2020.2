package model;

public class ItemServico {

	private String nome;
	private double valor;
	private String codigo;
	
	public ItemServico(String nome, double valor, String codigo) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
