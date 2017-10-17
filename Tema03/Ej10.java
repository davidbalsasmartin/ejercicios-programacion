/**
 * Capítulo 3, Ejercicio 10
 *
 * @Author David.B.M.
 */

public class Ej10 {
	
	public static void main (String[] args) {
    
    System.out.print("Por favor, introduce un número de mb: ");
    double megas = Double.parseDouble(System.console().readLine());
    
    System.out.print( megas + "mbs son " + ( megas * 1024 ) + " kbs");
		
	}
}
