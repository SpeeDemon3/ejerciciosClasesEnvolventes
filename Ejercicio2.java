package ejercicios;
/**
 * 
 * @author speedemon
 *
 *EJERCICIO 2
 *
 *Hacer un método que reciba un número y me devuelva un String que es la representación en binario del número que recibe.
 *
 */
public class Ejercicio2 {

	/**
	 * Metodo para obtener la representacion binaria de un numero
	 * @param num -> Valor numerico 
	 * @return -> Representacion binaria 
	 */
	public static String binaryRepresentation(Integer num) {
		// Utilizando el metodo da la Clase Integer toBinaryString() obtengo un String con la representacion en binario del 
		// numero pasado por parametro en el metodo
		String binary = Integer.toBinaryString(num);
		
		// Muestro por consola el resultado
		System.out.println(num + " se representa en binario: " + binary);
		
		// Retorno la representacion en binario en forma de String
		return binary;
		
		
	}
	
	
}
