package Conta_Avancada;

public class Banco {

	private int codigo;
	private String nome;
	private int numeroAgencias;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo > 1)
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 3)
		this.nome = nome;
	}
	public int getNumeroAgencias() {
		return numeroAgencias;
	}
	public void setNumeroAgencias(int numeroAgencias) {
		if(numeroAgencias > 1)
		this.numeroAgencias = numeroAgencias;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", numeroAgencias=");
		builder.append(numeroAgencias);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
