package aluguelDeCarros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
	
	protected double salario; 
	
	public Funcionario(String n, String dataNasc, int CPF, Telefone num, String end, 
			 Double sl , int id) {
		nome = n;
		this.numID =(long) id;
		try {
			this.dataNasc = new SimpleDateFormat("dd/MM/yyy").parse(dataNasc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.CPF = (int) CPF;
		this.numtel = num;
		endereco = end;
		salario = sl;
		
	}

	public Funcionario(String string) {
		// TODO Auto-generated constructor stub
	}

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

	public String toString() {
		return "Funcionário: " + getNome() + ", " + numtel;
	}
	
	
}
