/**
 * Capítulo 5, Ejercicio 17
 *
 * @author David.B.M.
 */


public class Ej17 {
	
	public static void main (String[] args) {
    System.out.print("Por favor, introduce un número entero positivo y pulsa enter: ");
    int num = Integer.parseInt(System.console().readLine());
    if (num > 0) {
      int mas = num + 100;
      while (num <= mas) {
      System.out.println(num + 1);
      num++;
      }
    } else {
      System.out.print("El número debía ser positivo.");
    }
  }
}
      
    
