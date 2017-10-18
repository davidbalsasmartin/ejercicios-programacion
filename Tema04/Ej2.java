/**
 * Capítulo 4, Ejercicio 2
 *
 * @Author David.B.M.
 */

public class Ej2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzce una hora sin minutos: ");
    int horaDelDía = Integer.parseInt(System.console().readLine());
    
    if ((horaDelDía >= 6) && (horaDelDía <= 12)) {
      System.out.println("¡Buenos días!");
    }
    if ((horaDelDía >= 13) && (horaDelDía <= 20)) {
      System.out.println("¡Buenas tardes!");
    }
    if ((horaDelDía >= 21) && (horaDelDía <= 24) || (horaDelDía >= 0) && (horaDelDía <= 5)) {
      System.out.println("¡Buenas noches!");
    }
    if ((horaDelDía > 24) || (horaDelDía < 0)) {
      System.out.println("Lo siento, esa hora no existe.");
    }
  }
}


