/*
 * Lampada.java
 * 
 * 1) Criar uma classe para representar uma lâmpada vendida em um supermercado. 
 * Além de marca, modelo e tipo, esta deve conter um atributo que indique 
 * um dos dois possíveis estados da lâmpada (acesa ou apagada).
 * 
 */

public class Lampada {

    private String marca;
    private String modelo;
    private String tipo;
    private boolean estado;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return estado;
    }

}