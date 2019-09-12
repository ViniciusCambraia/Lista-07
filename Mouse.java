package Computador;

public class Mouse {

    private String marca, tipo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.length() > 3);
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.length() > 3);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mouse [marca=");
        builder.append(marca);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append("]");
        return builder.toString();
    }

}

