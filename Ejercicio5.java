package ejercicios;
/**
 * 
 * @author speedemon
 *
 *EJERCICIO 5
 *
 *Hacer un método que reciba un carácter y me devuelva un String que contiene ese carácter, es decir, recibe ‘a’ y devuelve «a»
 *
 */
public class Ejercicio5 {

	/**
	 * Metodo para convertir un caracter a String
	 * @param a -> Caracter a convertir
	 * @return -> String del caracter convertido
	 */
	public static String convertCharacterToString(char a) {
		// Dentro de un String concateno el caracter con una String vacia
		String character = "" + a;
		// Muestro el resultado por consola
		System.out.println(character);
		// Retorno la nueva variable de tipo String
		return character;
		
	}
	
}
