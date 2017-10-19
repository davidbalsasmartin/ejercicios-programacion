/**
 * Capítulo 4, Ejercicio 5
 *
 * @author David.B.M.
 */

public class Ej5 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca a para resolver ax+b=0: ");
    double variableA = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca b para resolver ax+b=0: ");
    double variableB = Double.parseDouble(System.console().readLine());
    
    if (variableA == 0) {
      System.out.println("No se puede resolver, puesto que x es 0");
    } else {
      System.out.printf("x = %.2f\n", (-variableB/variableA));
    }
  }
}
