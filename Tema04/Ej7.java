/**
 * Capítulo 4, Ejercicio 7
 *
 * @author David.B.M.
 */

public class Ej7 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la primera nota: ");
    double primeraN = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota: ");
    double segundaN = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota: ");
    double terceraN = Double.parseDouble(System.console().readLine());
    
    if ((primeraN < 0) || (segundaN < 0)  || (terceraN < 0) || ((primeraN > 10) || (segundaN > 10)  || (terceraN > 10))) {
    System.out.println("esta nota media no es posible");
    } else {
    System.out.printf("La media es = %.2f", + ((primeraN + segundaN + terceraN) / 3));
    }
  }
}
