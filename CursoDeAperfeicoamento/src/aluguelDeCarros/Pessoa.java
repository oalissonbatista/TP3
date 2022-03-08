package aluguelDeCarros;

import java.util.Date;

public abstract class Pessoa {
	
	protected String nome;
	protected Long numID;
	protected Date dataNasc;
	protected int CPF;
	protected String endereco;
	protected Telefone numtel;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getNumID() {
		return numID;
	}
	public void setNumID(Long numID) {
		this.numID = numID;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public Telefone getNumtel() {
		return numtel;
	}
	public void setNumtel(Telefone numtel) {
		this.numtel = numtel;
	}


}
