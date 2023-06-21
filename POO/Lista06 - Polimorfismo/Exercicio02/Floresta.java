/*
 * Floresta.java
 * 
 * 
 */

public class Floresta {

    private Planta plantas[] = new Planta[100];
    private int contador;

    public Floresta() {
        contador = 0;
    }

    public void criarPlanta(Planta planta) {
        if (contador < plantas.length) {
            plantas[contador] = planta;
            contador++;
        } else {
            System.out.println("Limite de plantas atingido.");
        }
    }

    public void mostrarQuantidadePlantas() {
        System.out.println("Quantidade total de plantas na floresta: " + contador);
        System.out.println();
    }

    public void mostrarQuantidadeTiposPlantas() {
        int quantidadeArvores = 0;
        int quantidadeFlores = 0;
        int quantidadeCarnivoras = 0;

        for (int i = 0; i < contador; i++) {
            if (plantas[i] instanceof Arvore) {
                quantidadeArvores++;
            } else if (plantas[i] instanceof Flor) {
                quantidadeFlores++;
            } else if (plantas[i] instanceof Carnivora) {
                quantidadeCarnivoras++;
            }
        }

        System.out.println("Quantidade de Arvores: " + quantidadeArvores);
        System.out.println("Quantidade de Flores: " + quantidadeFlores);
        System.out.println("Quantidade de Plantas Carnivoras: " + quantidadeCarnivoras);
        System.out.println();
    }

    @Override
    public String toString() {
        String detalhes = "";
        for (int i = 0; i < contador; i++) {
            detalhes += "\n" + plantas[i].toString() + "\n";
        }
        return detalhes;
    }
}
