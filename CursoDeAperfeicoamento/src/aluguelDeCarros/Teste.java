package aluguelDeCarros;

import java.util.Date;
import java.util.GregorianCalendar;

public class Teste {

	static Carro car;
	static Carteira cart;	
	static Cliente c;
	static Cupom cup;
	static Funcionario f;
	static Reserva r;
	
	public static void main(String[] args) {
		
		Reserva aux;
		
		Carro carro = new Carro("fiat Mobi", "fiat", "Econômico", "Eletrico", 530.76);
		
		Telefone telefoneFuncionario = new Telefone(61, 998378898);
		f = new Funcionario("Ronaldo","18/05/1970", 777777777, telefoneFuncionario, "Brasilia", 1000.00 , 77777);
		
		cup = new Cupom("ASDDFSE", "10% de desconto");
		
		cart = new Carteira("pix", "cartao", "pix", "valePresente");
		
		Telefone telefoneCliente = new Telefone(38, 993031494);
		c = new Cliente("Alisson","15/02/1981", 733098421, telefoneCliente, 
				         "Brasilia", "alisson252525@hotmail.com", "senha", cart, 3812167);
		
		aux = new Reserva("Aeroporto de Brasilia", "21/03/2022 10:00", "Aeroporto de Brasilia", 
				          "27/03/2022 10:00", 700.00, cup, f, c, carro);
		aux.reservar();
		
		System.out.println(aux.toString());
	}

}
