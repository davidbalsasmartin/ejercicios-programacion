/**
 * Capítulo 6, Ejercicio 12
 *
 * @author David.B.M.
 */

public class Ej12{
  public static void main (String[] args) {
    System.out.print("\033[32m");
    for (int contador = 0; contador <= 1; contador = contador) {
      System.out.print((int)(Math.random() * 12));
    }
		
	}
}

