/**
 * Capítulo 4, Ejercicio 4
 *
 * @author David.B.M.
 */

public class Ej4 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca las horas semanales trabajadas: ");
    double horasDeSem = Double.parseDouble(System.console().readLine());
    
    if (horasDeSem > 40) {
      double horasExtra = (horasDeSem - 40);
      System.out.println("Sueldo semanal: " + ((40 * 12) + (horasExtra * 16)) + " euros");
    }
    if (horasDeSem <= 40) {
      System.out.println("Sueldo semanal: " + (horasDeSem * 12) + " euros");
    }
  }
}
