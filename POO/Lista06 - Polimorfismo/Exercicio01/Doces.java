/*
 * Doces.java
 * 
 * 
 */

class Doces extends Produto {
    public Doces(double preco, int quantidade) {
        super(preco, quantidade);
    }

    @Override
    public String toString() {
        return "#Doces: \n>Quantidade: " + getQuantidade() + "\n>Preco: R$ " + getPreco();
    }
}
