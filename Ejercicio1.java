package ejercicios;
/**
 * 
 * @author speedemon
 *
 *EJERCICIO 1
 *
 *Hacer un método que reciba una cadena y me devuelva un array de caracteres que contiene todos los caracteres 
 *de la cadena que recibe.
 *
 */
public class Ejercicio1 {

	/**
	 * Metodo para obtener una array de caracteres de un String
	 * @param cadena -> String que sera guardado dentro del array de tipo char
	 * @return -> array de tipo char
	 */
	public static char[] getCharArray (String cadena) {
		
		// Obtengo y guardo el numero de caracteres que tiene la cadena
		int numberCharacters = cadena.length();
		
		// Creo el array de tipo char, asignandole la longitud de elementos que contendra
		char[] characters = new char[numberCharacters];
		
		// Con un bucle for relleno el array
		for (int i = 0; i < numberCharacters; i++) {
			// Guardo en cada posicion el caracter correspondiente
			characters[i] = cadena.charAt(i);
		}
		
		// Con un bucle for each imprimo todos los caracteres que se han añadido en el array
		for (char index : characters) {
			System.out.println(index);
		}
		
		// Retorno el array relleno de caracteres
		return characters;
		
	}
	
	
}
