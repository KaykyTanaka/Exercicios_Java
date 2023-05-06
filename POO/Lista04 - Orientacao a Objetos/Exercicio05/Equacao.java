/* 
 * Equacao.java
 * 
 * 5) Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e
 * c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz
 * ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo
 * grau.
 * 
 */

public class Equacao {
    private double a, b, c;
    private double delta;
    private double x1, x2;

    public void calcularDelta(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Nao e uma equacao do segundo grau!");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public void mostrarRaizes() {
        if (this.a == 0) {
            return;
        }

        if (this.delta < 0) {
            System.out.println("A equacao nao possui raizes!");
        } else if (this.delta == 0) {
            this.x1 = (-this.b) / (2 * this.a);
            System.out.println("A equacao possui uma raiz: " + this.x1);
        } else {
            this.x1 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
            this.x2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
            System.out.println("A equacao possui duas raizes:");
            System.out.println("x1 = " + this.x1);
            System.out.println("x2 = " + this.x2);
        }
    }
}