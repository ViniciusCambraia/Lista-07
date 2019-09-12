package Conta_Avancada;

public class Cartao {

	private int numero;
	private String operadora;
	private double limite;
	private String tipodecartao;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero > 1)
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		if(operadora.length() > 3)
		this.operadora = operadora;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(limite > 1)
		this.limite = limite;
	}
	public String getTipodecartao() {
		return tipodecartao;
	}
	public void setTipodecartao(String tipodecartao) {
		if(tipodecartao.length() > 3)
		this.tipodecartao = tipodecartao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cartao [numero=");
		builder.append(numero);
		builder.append(", operadora=");
		builder.append(operadora);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", tipodecartao=");
		builder.append(tipodecartao);
		builder.append("]");
		return builder.toString();
	}
	
	
}
