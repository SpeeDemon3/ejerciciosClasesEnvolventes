package ejercicios;
/**
 * 
 * @author speedemon
 *
 *EJERCICIO 6
 *
 *Hacer un método que reciba un float y me devuelva un cadena que es la representación de ese float. 
 *Por ejemplo: recibe 12.78F y devuelve «12.78»
 *
 */
public class Ejercicio6 {

	/**
	 * Metodo para convertir un valor de tipo float a String
	 * @param num -> Valor que se desea convertir a String
	 * @return -> String con el valor decimal introducido por parametro
	 */
	public static String convertFloatToString(float num) {
		// Dentro de un String concateno el valor decimal con una String vacia
		String number = "" + num;
		// Muestro el resultado por consola
		System.out.println(number);
		// Retorno la nueva variable de tipo String
		return number;
		
	}
	
}
