/**
 * Capítulo 5, Ejercicio 32
 *
 * @author David.B.M.
 */


public class Ej32 {
  public static void main (String[] args) {
    System.out.println("Por favor introduce un número grande :");
    long num = Long.parseLong(System.console().readLine());
    
    System.out.println("Los números pares son : ");
    int suma = 0;
    long divisor;
		for (divisor = num ; divisor >= 0; divisor = num % 10) {
      num = num / 10;
      if ((divisor % 2) == 0) {
        suma = (int)(suma + divisor);
        System.out.print("  " + divisor);
      }
    }
      System.out.println();
      System.out.println("y su suma es = " + suma);
	}
}

