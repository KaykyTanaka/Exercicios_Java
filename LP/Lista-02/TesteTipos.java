/*
 * TesteTipos.java
 * 
 * 7 – Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo. 
 * 
 * a. "Bom dia"
 * b. 3
 * c. 235.13
 * d. true
 * e. -135
 * f. 256.23F
 * g. 'A'
 * h. 6463275245745L
 * Obs: faça os testes necessários com um programa escrito em Java para identificar os tipos.
 * 
 */


public class TesteTipos {
	
	public static void main (String[] args) {
		
		String a = "Bom dia";
        byte b = 3;
        double c = 235.13;
        boolean d = true;
        short e = -135;
        float f = 256.23F;
        char g = 'A';
        long h = 6463275245745L;
		
		System.out.println(a + " -> String\n" + b + " -> byte\n" + c + " -> double\n" + d + " -> boolean\n" + e + " -> short\n" + f + " -> float\n" + g + " -> char\n" + h + " -> long\n");
	}
}

