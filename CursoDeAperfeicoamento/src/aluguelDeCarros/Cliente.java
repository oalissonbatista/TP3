package aluguelDeCarros;

import java.util.Date;

public class Cliente extends Pessoa {

	protected String email;
	protected String senha;
	protected Carteira carteira;
	
	public Cliente(String n, Date dn, long CPF, Telefone num, String end, 
			String e, String s, Carteira cart, long id) {
		nome = n;
		dataNasc = dn;
		CPF =  (long) CPF ;
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

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(Long cPF) {
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
		return "Cliente: " + nome + ", ID: " + numID + ", data de Nasc: " + dataNasc + ", CPF: " + CPF + ", telefone: "
				+ numtel + ", endereço: " + endereco + ", email: " + email + ", carteira: " + carteira;
	}
}
