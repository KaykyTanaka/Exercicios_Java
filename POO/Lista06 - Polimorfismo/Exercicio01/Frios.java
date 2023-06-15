/*
 * Frios.java
 * 
 * 
 */

class Frios extends Produto {
    public Frios(double preco, int quantidade) {
        super(preco, quantidade);
    }

    @Override
    public String toString() {
        return "#Frios: \n>Quantidade: " + getQuantidade() + "\n>Preco: R$ " + getPreco();
    }
}
