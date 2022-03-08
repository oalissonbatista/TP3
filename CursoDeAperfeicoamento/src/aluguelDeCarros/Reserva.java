package aluguelDeCarros;

import java.util.Arrays;
import java.util.Date;

public class Reserva {
	private String localRetirada;
	private Date horarioRetirada;
	private String localDevolucao;
	private Date horarioDevolucao;
	private Funcionario funcionario;
	private Cupom cupom;
	private Cliente cliente;
	private Carro carro;
	
	public Reserva(String lr, Date hr, String ld, Date hd, double v, Cupom c, Funcionario fun, Cliente cli, Carro car) {
		localRetirada = lr;
		horarioRetirada = hr;
		localDevolucao = ld;
		horarioDevolucao = hd;
		funcionario = fun;
		cupom = c;
		cliente = cli;
		carro = car;
	}
	
	//public void reservar() 
		//Cliente cli = this.getCliente();
		//Carro car = this.getCarro();
		
		
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
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	@Override
	public String toString() {
		return "local de retirada: " + localRetirada + ", horario de retirada: " + horarioRetirada + ", local de devolucao: "
				+ localDevolucao + ", horario de devolucao: " + horarioDevolucao;
	}

	public void reservar() {
		// TODO Auto-generated method stub
		
	}
	
}
