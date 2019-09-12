package Carro_Motor_Pessoa;

public class Carro {

	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	protected Pessoa pesoa;
	protected Motor motor;
	
	
	public Carro() {
		pesoa = new Pessoa();
		motor = new Motor();	
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		if(fabricante.length() > 3)
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		if(modelo.length() > 3)
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		if(cor.length() > 3)
		this.cor = cor;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		if(ano > 1)
		this.ano = ano;
	}


	public Pessoa getPesoa() {
		return pesoa;
	}


	public void setPesoa(Pessoa pesoa) {
		this.pesoa = pesoa;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", pesoa=");
		builder.append(pesoa);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}


}

