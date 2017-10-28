/**
 * Capítulo 5, Ejercicio 11
 *
 * @author David.B.M.
 */


public class Ej11 {
	
	public static void main (String[] args) {
    
      System.out.print("Por favor, introduce un número entero y pulsa enter :");
      int num = Integer.parseInt(System.console().readLine());

    for (int contador = 1; contador < 6; contador++) {
      int numero = num + contador;
      int cuadrado = numero * numero;
      int cubo = numero * numero * numero;
      System.out.printf("%10d      %10d      %10d\n", numero, cuadrado, cubo);
    }
	}
}
