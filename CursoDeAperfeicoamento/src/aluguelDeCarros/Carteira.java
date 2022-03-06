package aluguelDeCarros;

public class Carteira {
	private String cartao;
	private String valePresente;
	private String pix;
	public Carteira(String c, String vP, String p) {
		cartao = c;
		valePresente = vP;
		pix = p;
		
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

}
