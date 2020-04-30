package br.com.fiap.nac.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

public class EletronicoModel {

	private long id;
	private String nome;
	private String codigo;
	private double nota;
	private String descricao;
	private double preco;
	private String caracteristicas;

	public EletronicoModel() {
	}

	public EletronicoModel(long id, String nome, String codigo, double nota, String descricao, double preco,
			String caracteristicas) {
		super();
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
		this.nota = nota;
		this.descricao = descricao;
		this.preco = preco;
		this.caracteristicas = caracteristicas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Size(min = 1, max = 30, message = "descricao precisa ter entre 1 a 30 caracteres")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Size(min = 7, max = 7, message = "Codigo precisa conter 7 caracteres")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@DecimalMin(value = "0", message = "Nota minima é 0")
	@DecimalMax(value = "10", message = "Nota maxima é 10")
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Size(min = 1, max = 200, message = "descricao deve ter no minimo 1 a 200 caracteres")
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@DecimalMin(value = "0.1", message = "preco deve ser acima de 0.0")
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Size(min = 1, max = 200, message = "caracteristicas deve ter no minimo 1 a 200 caracteres")
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
