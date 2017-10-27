/**
 * Capítulo 5, Ejercicio 8
 *
 * @author David.B.M.
 */


public class Ej08 {
	
	public static void main (String[] args) {
    System.out.print("Por favor, introduce un número por teclado: ");
    int n = Integer.parseInt(System.console().readLine());
    for (int i = 1; i < 11; i++) {
      System.out.println(i * n);
    }
	}
}
