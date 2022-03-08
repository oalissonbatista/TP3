package aluguelDeCarros;

public class Carteira {
	private String tipo;
	private String cartao;
	private String valePresente;
	private String pix;
	public Carteira(String t, String c, String vP, String p ) {
		cartao = c;
		valePresente = vP;
		pix = p;
		tipo = t;
		
	}
	public Carteira(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public String getValePresente() {
		return valePresente;
	}
	public void setValePresente(String valePresente) {
		this.valePresente = valePresente;
	}
	public String getPix() {
		return pix;
	}
	public void setPix(String pix) {
		this.pix = pix;
	}
	@Override
	public String toString() {
		return "Pagamento via: " + tipo;
	}
	
}
