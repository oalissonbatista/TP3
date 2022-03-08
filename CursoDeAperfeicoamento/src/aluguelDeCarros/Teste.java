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
		
		GregorianCalendar d= new GregorianCalendar();
		Date agora = d.getTime();
		
		Carro car1 = new Carro("fiat Mobi", "fiat", "Econômico", "Eletrico", 111.76);
		Carro car2 = new Carro("Honda Civic", "Honda", "intermediario", "Automático", 200.20);
		
	    Telefone tf = new Telefone(61, 99999999);
		f = new Funcionario("Ronaldo", agora, 777777, tf, "Brasilia", 1000.00 , 77777);
		
		cup = new Cupom("ASDDFSE", "10% de desconto");
		
		cart = new Carteira("pix", "cartao", "pix", "valePresente");
		
		Telefone tc = new Telefone(61, 993031494);
		
		c = new Cliente("Alisson", agora, 733098421, tc, "Brasilia", "alisson252525@hotmail.com", "senha", cart, 3812167);
		
		aux = new Reserva("Aeroporto de Brasilia", agora, "Aeroporto de Brasilia", agora, 111.76, cup, f, c, car1);
		aux.reservar();
		
		System.out.println(aux.toString());
		System.out.println(cup.toString());
		System.out.println(c.toString());
		System.out.println(f.toString());
	
	}

}
