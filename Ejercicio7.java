package ejercicios;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio7 {

	/*
	 * EJERCICIO CONSULTA API
	 * Crear la cadena de texto: “Bienvenidos al curso de Java”
	 * 
	 * Mostrar la cadena toda en mayúsculas • Mostrar la cadena en minúsculas
	 * Mostrar solo la palabra Bienvenidos • Mostrar solo la palabra Java
	 * Mostrar la palabra curso
	 * Mostrar la posición de la letra c
	 * Devolver la longitud de la cadena
	 * Modificar las e minúsculas por E mayúsculas
	 * Concatenar la frase anterior con “con fecha 14 de Septiembre”
	 * 
	 */
	
	public static void main(String[] args) {

		// Crear la cadena de texto: “Bienvenidos al curso de Java”
		String cadena = "Bienvenidos al curso de Java";
		
		// Mostrar la cadena toda en mayúsculas • Mostrar la cadena en minúsculas
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());

		// Mostrar solo la palabra Bienvenidos • Mostrar solo la palabra Java
		System.out.println(cadena.substring(0, 11));
		System.out.println(cadena.substring(24, 28));
		
		// Mostrar la palabra curso
		System.out.println(cadena.substring(15, 20));
		
		// Mostrar la posición de la letra c
		System.out.println(cadena.indexOf('c'));

		// Devolver la longitud de la cadena
		System.out.println(cadena.length());
		
		// Modificar las e minúsculas por E mayúsculas
		System.out.println(cadena.replace('e', 'E'));
		
		// Concatenar la frase anterior con “con fecha 14 de Septiembre”
		System.out.println(cadena + " con fecha 14 de Septiembre");
	}

}
