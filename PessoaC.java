package Carro_Motor_Pessoa;

public class PessoaC {

	private String nome;
	private String endere�o;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 3)
		this.nome = nome;
	}
	public String getEnder�o() {
		return endere�o;
	}
	public void setEnder�o(String endere�o) {
		if(endere�o.length() > 3)
		this.endere�o = endere�o;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endere�o=");
		builder.append(endere�o);
		builder.append("]");
		return builder.toString();
	}

	
}
