package aluguelDeCarros;

import java.util.Date;

public class Cliente {
	
	protected String nome;
	protected int numID;
	protected Date dataNasc;
	protected int CPF;
	protected Telefone numtel;
	protected String endereco;
	protected String email;
	protected String senha;
	protected Carteira carteira;
	
	
	public Cliente(String n, Date dn, int CPF, Telefone num, String end, 
			String e, String s, Carteira cart, int id) {
		nome = n;
		dataNasc = dn;
		this.CPF = CPF;
		this.numtel = num;
		this.numID =id;
		endereco = end;
		email = e;
		senha = s;
		carteira = cart;
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
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
	
	
}
