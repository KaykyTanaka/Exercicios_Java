/*
 * Planta.java
 * 
 * 
 */

public class Planta {

	private String nome;
	private String especie;

	public Planta() {
		setNome("Nome");
		setEspecie("Especie");
	}

	public Planta(String nome, String especie) {
		setNome(nome);
		setEspecie(especie);
	}

	public void setNome(String nome) {
		if (nome == null) {
			System.out.println("Digite um nome valido!");
		} else {
			this.nome = nome;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setEspecie(String especie) {
		if (especie == null) {
			System.out.println("Digite uma especie valida!");
		} else {
			this.especie = especie;
		}

	}

	public String getEspecie() {
		return especie;
	}
}
