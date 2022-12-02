/*  
 * 4 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
 * em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
 * Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. Defina os nomes que
 * achar mais apropriado para essas variáveis. Por fim, exiba os valores dessas variáveis na saída
 * padrão.
 * 
 */

public class ExibeValores {
    public static void main(String[] args) {
        byte a = 19;
        short b = 1571;
        int c = 100000;
        long d = 2147483648l;
        float e = 3.14f;
        double f = 3.141592653589793;
        boolean g = true;
        char h = 'K';

        System.out.printf("byte: %s\nshort: %s\nint: %s\nlong: %s\nfloat: %s\ndouble: %s\nboolean: %s\nchar: %s", a,b,c,d,e,f,g,h);
    }
}
