package Conta_Avancada;

public class ContaBancaria {

	protected Banco bank;
	protected Pessoa pesoa;
	private int agencia;
	private int numerodaconta;
	private double saldo;

	public ContaBancaria() {
		bank = new Banco();
		pesoa = new Pessoa();
	}

	public Banco getBank() {
		return bank;
	}

	public void setBank(Banco bank) {
		this.bank = bank;
	}

	public Pessoa getPesoa() {
		return pesoa;
	}

	public void setPesoa(Pessoa pesoa) {
		this.pesoa = pesoa;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 1)
			this.agencia = agencia;
	}

	public int getNumerodaconta() {
		return numerodaconta;
	}

	public void setNumerodaconta(int numerodaconta) {
		if (numerodaconta > 1)
			this.numerodaconta = numerodaconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 1)
			this.saldo = saldo;
	}

	public boolean Deposito(double valor) {
		if (saldo > valor) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Saque(double valor) {
		if (valor < saldo) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [bank=");
		builder.append(bank);
		builder.append(", pesoa=");
		builder.append(pesoa);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numerodaconta=");
		builder.append(numerodaconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		
		return builder.toString();
	}

	
}
