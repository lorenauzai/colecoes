package br.com.db1.colecoe;

public class Produto {

	private Integer id;
	private String descricao;
	private Double valor;

	public Produto(Integer id, String descricao, Double valor) {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
