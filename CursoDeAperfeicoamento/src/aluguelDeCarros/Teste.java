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
	static Telefone t;

	public static void main(String[] args) {
		
		Reserva aux;
		
		GregorianCalendar d= new GregorianCalendar();
		Date agora = d.getTime();
		
		
		
	
		Carro car = new Carro("fiat Mobi", "fiat", "Econômico", "Eletrico", 111.76);
		
		//r = new Reserva();
		//r.setCliente(c);
		//r.setCupom(cup);
		
		f = new Funcionario("Ronaldo", agora, 777777, t, "Brasilia", 1000.00 , 77777);
		
		cup = new Cupom("ASDDFSE", "10% de desconto");
		
		cart = new Carteira("pix", "cartao", "pix", "valePresente");
		
		t = new Telefone(61, 993031494);
		
		c = new Cliente("Alisson", agora, 7777777, t, "Brasilia", "alisson252525@hotmail.com", "senha", cart, 3812167);
		
		aux = new Reserva("Aeroporto de Brasilia", agora, "Aeroporto de Brasilia", agora, 111.76, cup, f, c, car);
		aux.reservar();
		
		
		System.out.println(aux.toString());
		System.out.println(f.toString());
		System.out.println(c.toString());
		System.out.println(car.toString());
		
		
		
		
		
		
		

	}

}
