package Carro_Motor_Pessoa;

public class PessoaC {

	private String nome;
	private String endereço;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 3)
		this.nome = nome;
	}
	public String getEnderço() {
		return endereço;
	}
	public void setEnderço(String endereço) {
		if(endereço.length() > 3)
		this.endereço = endereço;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append("]");
		return builder.toString();
	}

	
}
