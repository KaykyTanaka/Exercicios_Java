/*
 * Arvore.java
 * 
 * 
 */

public class Arvore extends Planta {
  private boolean frutifera;

  public Arvore(String nome, String especie, boolean frutifera) {
    super(nome, especie);
    this.frutifera = frutifera;
  }

  public boolean isFrutifera() {
    return frutifera;
  }

  @Override
  public String toString() {
    return "=Arvore=\n" +
        "Nome: " + getNome() + "\n" +
        "Especie: " + getEspecie() + "\n" +
        "Frutifera: " + (frutifera ? "Sim" : "Nao") + "\n";
  }
}
