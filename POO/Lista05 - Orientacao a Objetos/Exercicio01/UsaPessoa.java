/* 
 * UsaPessoa.java
 * 
 * 1) Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em
 * formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos
 * métodos assessores de cada característica, temos um método que recebe como parâmetro de
 * entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse
 * método deve ser chamado por fazAniversario, não havendo retorno. Siga o diagrama abaixo para
 * implementar a classe Pessoa. Após crie uma classe para testar. Observe os sinais de mais e de
 * menos antes dos nomes dos atributos e métodos. Respeite-os! 
 * 
 * 
 */
import java.util.Scanner;

public class UsaPessoa {

    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leiaStr.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = leia.nextDouble();

        Pessoa p2 = new Pessoa(nome, idade, altura);
        System.out.println(p2);

        System.out.println("\nTestando faz aniversario: ");
        p2.fazAniversario(true);
        System.out.println(p2);
    }
}
