/**
 * Capítulo 4, Ejercicio 18
 *
 * @author David.B.M.
 */

public class Ej18 {
  public static void main(String[] args) {
    System.out.println("Indica un número entero de hasta 5 cifras:");
    int cifraCompleta = Integer.parseInt(System.console().readLine());

    if (cifraCompleta <= 99999) {
    System.out.println("Su última cifra es : " + (cifraCompleta % 10));
  } else {
    System.out.println("Dato erróneo");
  }
  }
}
