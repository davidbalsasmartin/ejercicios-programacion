/**
 * Capítulo 4, Ejercicio 17
 *
 * @author David.B.M.
 */

public class Ej17 {
  public static void main(String[] args) {
    System.out.println("Indica un número entero para indicar su úlltima cifra:");
    int cifraCompleta = Integer.parseInt(System.console().readLine());
    
    System.out.println(cifraCompleta % 10);
  }
}
