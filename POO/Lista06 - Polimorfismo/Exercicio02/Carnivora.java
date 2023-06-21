/*
 * Carnivora.java
 * 
 * 
 */

public class Carnivora extends Planta {
  private boolean venenosa;

  public Carnivora(String nome, String especie, boolean venenosa) {
    super(nome, especie);
    this.venenosa = venenosa;
  }

  public boolean isVenenosa() {
    return venenosa;
  }

  @Override
  public String toString() {
    return "=Carnivora=\n" +
        "Nome: " + getNome() + "\n" +
        "Especie: " + getEspecie() + "\n" +
        "Venenosa: " + (venenosa ? "Sim" : "Nao") + "\n";
  }
}
