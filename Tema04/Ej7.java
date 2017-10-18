/**
 * Capítulo 4, Ejercicio 7
 *
 * @Author David.B.M.
 */

public class Ej7 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la primera nota: ");
    double primeraN = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota: ");
    double segundaN = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota: ");
    double terceraN = Double.parseDouble(System.console().readLine());
    
    System.out.println("La media es = " + ((primeraN + segundaN + terceraN) / 3));
  }
}
