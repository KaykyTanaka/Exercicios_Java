/*
 * Paozinho.java
 * 
 * 
 */

class Paozinho extends Produto {
    public Paozinho(double preco, int quantidade) {
        super(preco, quantidade);
    }

    @Override
    public String toString() {
        return "#Paozinho: \n>Quantidade: " + getQuantidade() + "\n>Preco: R$ " + getPreco();
    }
}
