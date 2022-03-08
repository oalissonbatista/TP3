package aluguelDeCarros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Reserva {
	private String localRetirada;
	private Date dataRetirada;
	private String localDevolucao;
	private Date dataDevolucao;
	private static Carro carro;
	private static Cupom cupom;
	private static Funcionario funcionario;
	private static Cliente cliente;
	
	public Reserva(String lr, String dataRetirada, String ld, String dataDevolucao, double v, Cupom c, Funcionario fun, Cliente cli, Carro car) {
		localRetirada = lr;
		
		try {
			this.dataRetirada = new SimpleDateFormat("dd/MM/yyy HH:mm").parse(dataRetirada);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		localDevolucao = ld;
		try {
			this.dataDevolucao = new SimpleDateFormat("dd/MM/yyy HH:mm").parse(dataDevolucao);
		} catch (ParseException e) {
			e.printStackTrace();
		};
		funcionario = fun;
		cupom = c;
		cliente = cli;
		carro = car;
	}
    
	public static void reservar() {
    	System.out.println("------ Carros Reservados------");
    	System.out.println(cliente);
    	System.out.println(carro);
    	System.out.println(cupom);
    	System.out.println(funcionario);
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

	public String getLocalRetirada() {
		return localRetirada;
	}
	public void setLocalRetirada(String localRetirada) {
		this.localRetirada = localRetirada;
	}
	
	public String getLocalDevolucao() {
		return localDevolucao;
	}
	public void setLocalDevolucao(String localDevolucao) {
		this.localDevolucao = localDevolucao;
	}
	
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String toString() {
		return "local de retirada: " + localRetirada + ", data de retirada: "+ dataRetirada + "\n"+ "local de devolucao: "
				+ localDevolucao + ", data de devolução:" + dataDevolucao ;
	}

}
