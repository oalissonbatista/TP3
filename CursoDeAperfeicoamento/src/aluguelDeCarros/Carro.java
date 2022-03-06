package aluguelDeCarros;

public class Carro {
	
	private String nome;
	private String marca;
	private String categoria;
	private String caracteristica;
	private Double valor;
	

	public Carro(String n, String m, String c, Double v, String crt) {
		nome = n;
		marca = m;
		categoria = c;
		caracteristica = crt;
		valor = v;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}

}
