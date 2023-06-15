/*
 * Produto.java
 * 
 * 
 */

public class Produto {

	private double preco;
	private int quantidade;

	public Produto() {
		setPreco(2.0);
		setQuantidade(1);
	}

	public Produto(double preco, int quantidade) {
		setPreco(preco);
		setQuantidade(quantidade);
	}

	public void setPreco(double preco) {
		if (preco > 0.0) {
			this.preco = preco;
		} else {
			System.out.println("Insira um preco valido!");
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		} else {
			System.out.println("Insira uma quantidade valida!");
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

}
