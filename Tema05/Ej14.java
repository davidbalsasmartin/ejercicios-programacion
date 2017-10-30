/**
 * Capítulo 5, Ejercicio 14
 *
 * @author David.B.M.
 */


public class Ej14 {
	
	public static void main (String[] args) {
    
    System.out.println("Por favor, introduce un número base y pulsa enter");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduce un exponente y pulsa enter");
    int exponente = Integer.parseInt(System.console().readLine());
    int result = ();
      for (int contador = 1; contador >= exponente; contador++) {
        result = base * base ;
      }
    System.out.print("resultado = " + result);
  }
}
