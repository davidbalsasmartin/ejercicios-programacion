/**
 * Capítulo 5, Ejercicio 14
 *
 * @author David.B.M.
 */


public class Ej14 {
	
	public static void main (String[] args) {
    
    System.out.println("Por favor, introduce un número base positivo y pulsa enter");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduce un exponente positivo y pulsa enter");
    int exponente = Integer.parseInt(System.console().readLine());
    int n = base;
      for (int contador = 2; contador <= exponente; contador++) {
      base = base * n;
      }
    System.out.print("resultado = " + base);
  }
}
