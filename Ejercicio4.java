package ejercicios;
/**
 * 
 * @author speedemon
 *
 *EJERCICIO 4
 *
 *Hacer un método que reciba un cadena y me devuelva otra que sea la misma cadena en mayúsculas
 *
 */
public class Ejercicio4 {

	/**
	 * Metodo para convertir una cadena a mayusculas
	 * @param cadena -> Valor de tipo String para convertir a mayusculas
	 * @return -> Nueva variable con el valor de tipo String convertido a mayusculas
	 */
	public static String uppercaseString(String cadena) {
		// Guardo en una variable la cadena introducida por parametro, convertida a mayusculas gracias al metodo toUpperCase()
		String uppercaseString = cadena.toUpperCase();
		// Muestro el resultado por consola
		System.out.println(uppercaseString);
		// Retorno la nueva variable
		return uppercaseString;
		
	}
	
}
