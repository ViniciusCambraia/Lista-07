package Conta_Avancada;

public class ContaEspecial extends ContaBancaria {

	private int diassemjuros;
	private double limite;
	protected Cartao cartao;
	
	
	public void Cartao() {
		cartao = new Cartao();
	}
	
	public int getDiassemjuros() {
		return diassemjuros;
	}
	public void setDiassemjuros(int diassemjuros) {
		if(diassemjuros > 1)
		this.diassemjuros = diassemjuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(limite > 1)
		this.limite = limite;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diassemjuros=");
		builder.append(diassemjuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
