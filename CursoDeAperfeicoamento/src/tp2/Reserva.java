package tp2;

import java.util.Date;

public class Reserva {
	private String localRetirada;
	private Date horarioRetirada;
	private String localDevolucao;
	private Date horarioDevolucao;
	private Funcionario funcionario;
	private Cupom cupom;
	private Cliente cliente;
	private Carro[] carrosCadastrados = new Carro[20];
	private int numCarrosCadastrados = 0;
	
	
	public Reserva(String lr, Date hr, String ld, Date hd, double v, String cupom, Funcionario fun, String c, Cliente cli) {
		localRetirada = lr;
		horarioRetirada = hr;
		localDevolucao = ld;
		horarioDevolucao = hd;
		funcionario = fun;
		cupom = c;
		cliente = cli;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cupom getCupom() {
		return cupom;
	}

	public void setCupom(Cupom cupom) {
		this.cupom = cupom;
	}

	public int getNumCarrosCadastrados() {
		return numCarrosCadastrados;
	}

	public void setNumCarrosCadastrados(int numCarrosCadastrados) {
		this.numCarrosCadastrados = numCarrosCadastrados;
	}

	public String getLocalRetirada() {
		return localRetirada;
	}
	public void setLocalRetirada(String localRetirada) {
		this.localRetirada = localRetirada;
	}
	public Date getHorarioRetirada() {
		return horarioRetirada;
	}
	public void setHorarioRetirada(Date horarioRetirada) {
		this.horarioRetirada = horarioRetirada;
	}
	public String getLocalDevolucao() {
		return localDevolucao;
	}
	public void setLocalDevolucao(String localDevolucao) {
		this.localDevolucao = localDevolucao;
	}
	public Date getHorarioDevolucao() {
		return horarioDevolucao;
	}
	public void setHorarioDevolucao(Date horarioDevolucao) {
		this.horarioDevolucao = horarioDevolucao;
	}
	public Carro[] getCarrosCadastrados() {
		return carrosCadastrados;
	}
	public void setCarrosCadastrados(Carro[] carrosCadastrados) {
		this.carrosCadastrados = carrosCadastrados;
	}
	
}
