package HomeTheater;

public class SistemaDeVideo extends EquipamentoEletronico {

	private String marca;
	private String modelo;
	private String resolucao;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length() > 0)
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length() > 0)
		this.modelo = modelo;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		if(resolucao.length() > 0)
		this.resolucao = resolucao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length() > 0)
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
