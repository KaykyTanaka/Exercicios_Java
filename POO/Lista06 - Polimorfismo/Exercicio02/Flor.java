/*
 * Flor.java
 * 
 * 
 */

public class Flor extends Planta {
	private String cor;

	public Flor(String nome, String especie, String cor) {
		super(nome, especie);
		setCor(cor);
	}

	public void setCor(String cor) {
		if (cor == null) {
			System.out.println("Digite uma cor valida!");
		} else {
			this.cor = cor;
		}
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "=Flor=\n" +
				"Nome: " + getNome() + "\n" +
				"Especie: " + getEspecie() + "\n" +
				"Cor: " + getCor() + "\n";
	}
}
