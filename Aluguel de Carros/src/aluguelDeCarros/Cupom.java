package aluguelDeCarros;

public class Cupom {
	private String codigo;
	private String desconto;
	
	public Cupom(String c, String d) {
		codigo = c;
		desconto = d;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String string) {
		this.codigo = string;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String toString() {
		return "Cupom: " + codigo + ", desconto: " + desconto;
	}
	

}
