/*
 * TestaTiposPrimitivos.java.
 * 
 * 9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que 
 * declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser 
 * inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.
 * 
 */


public class TestaTiposPrimitivos {
	
	public static void main (String[] args) {
		
		byte tipoByte = 125;
		short tipoShort = 31987;
		int tipoInt = 2100483647;
		long tipoLong = 899337203685475807L;
		float tipoFloat = 3.14f;
		double tipoDouble = 421.568;
		char tipoChar = 'K';
		boolean tipoBoolean = true;
		
		System.out.printf("Byte: \nShort: \nInt: \nlong: \nfloat: \ndouble: %2f \nchar: \nboolean: ");
	}
}

