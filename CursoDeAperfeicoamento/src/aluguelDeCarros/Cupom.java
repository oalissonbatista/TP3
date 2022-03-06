package aluguelDeCarros;

public class Cupom {
	private int codigo;
	private int desconto;
	
	public Cupom(int c, int d) {
		codigo = d;
		desconto = d;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

}
