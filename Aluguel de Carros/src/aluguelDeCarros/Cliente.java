package aluguelDeCarros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa {

	protected String email;
	protected String senha;
	protected Carteira carteira;
	
	
	//Sobrecarga
	public Cliente(String n, String dataNasc, int CPF, Telefone num, String end, 
			String e, String s, Carteira cart, long id) {
		nome = n;
		try {
			this.dataNasc = new SimpleDateFormat("dd/MM/yyy").parse(dataNasc);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.CPF = (int) CPF ;
		numtel = num;
		numID = (long) id;
		endereco = end;
		email = e;
		senha = s;
		carteira = cart;
	}
	
	
	public Cliente(String n, int CPF, Telefone num, String end, 
			String e, String s, Carteira cart, long id) {
		nome = n;
		this.CPF = (int) CPF ;
		numtel = num;
		numID = (long) id;
		endereco = end;
		email = e;
		senha = s;
		carteira = cart;
	}
	

	public Long getNumID() {
		return numID;
	}

	public void setNumID(Long numID) {
		this.numID = numID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Carteira getCarteira() {
		return carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + nome + ", CPF: " + CPF + ", "
				+ numtel + ", carteira: " + carteira;
	}
}
