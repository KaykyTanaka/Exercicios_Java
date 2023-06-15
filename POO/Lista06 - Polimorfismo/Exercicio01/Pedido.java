/*
 * Pedido.java
 * 
 * 
 */

public class Pedido {
	private Produto produtos[] = new Produto[100];
	private int contador;

	public Pedido() {
		contador = 0;
	}

	public void adicionarProduto(Produto produto) {
		if (contador < 100) {
			produtos[contador] = produto;
			contador++;
		} else {
			System.out.println("Limite de itens no pedido atingido.");
		}
	}

	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for (int i = 0; i < contador; i++) {
			valorTotal += produtos[i].getPreco() * produtos[i].getQuantidade();
		}
		return valorTotal;
	}

	@Override
	public String toString() {
		String detalhes = "";
		for (int i = 0; i < contador; i++) {
			detalhes += "\n" + produtos[i].toString() + "\n";
		}
		return detalhes;
	}
}
