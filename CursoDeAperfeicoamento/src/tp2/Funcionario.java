package tp2;

import java.util.Date;

public class Funcionario {
	
	protected String nome;
	protected int numID;
	protected Date dataNasc;
	protected int CPF;
	protected Telefone numtel;
	protected String endereco;
	protected double salario; 
	
	public Funcionario(String n, Date dn, int CPF, Telefone num, String end, 
			String e, String s, Double sl , int id) {
		nome = n;
		dataNasc = dn;
		this.CPF = CPF;
		this.numtel = num;
		this.numID =id;
		endereco = end;
		salario = sl;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
