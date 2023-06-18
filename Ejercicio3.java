package ejercicios;
/**
 * 
 * @author speedemon
 *
 *EJERCICIO 3
 *Hacer un método que reciba un cadena y me devuelva otra que sea la misma cadena en minúsculas
 *
 */
public class Ejercicio3 {

	/**
	 * Metodo para convertir una cadena a minusculas
	 * @param cadena -> Valor de tipo String para convertir a minusculas
	 * @return -> Nueva variable con el valor de tipo String convertido a minusculas
	 */
	public static String lowercaseString(String cadena) {
		// Guardo en una nueva cadena, la cadena introducida convertida a minusculas gracias al metodo toLowerCase()
		String lowercaseString = cadena.toLowerCase();
		// Muestro el resultado por consola
		System.out.println(lowercaseString);
		// Retorno el valor
		return lowercaseString;
		
	}
	
}
