/**
 * Capítulo 5, Ejercicio 22
 *
 * @author David.B.M.
 */


public class Ej22 {
  public static void main (String[] args) {
    int contar;
    for (int num = 2; num <= 100; num++) {
      int numPrim = 0;
      for (contar = 2; contar < num; contar++) {
        if (num % contar == 0) {
          numPrim++;
        }
      }
      if (numPrim == 0) {
        System.out.print(" " + num + " ");
      }
    }
  }
}
