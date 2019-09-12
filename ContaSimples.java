package Conta_Avancada;

public class ContaSimples extends ContaBancaria {

	private double poupanca;

	public double getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(double poupanca) {
		this.poupanca = poupanca;
	}

	public boolean DepositoPoupanca(double valor) {
		if (poupanca > valor) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Saque(double valor) {
		if (valor < poupanca) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [poupanca=");
		builder.append(poupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
