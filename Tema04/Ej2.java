/**
 * Capítulo 4, Ejercicio 2
 *
 * @author David.B.M.
 */

public class Ej2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzce una hora sin minutos: ");
    int horaDelDia = Integer.parseInt(System.console().readLine());
    
    if ((horaDelDia >= 6) && (horaDelDia <= 12)) {
      System.out.println("¡Buenos días!");
    }
    if ((horaDelDia >= 13) && (horaDelDia <= 20)) {
      System.out.println("¡Buenas tardes!");
    }
    if ((horaDelDia >= 21) && (horaDelDia <= 23) || (horaDelDia >= 0) && (horaDelDia <= 5)) {
      System.out.println("¡Buenas noches!");
    }
    if ((horaDelDia > 23) || (horaDelDia < 0)) {
      System.out.println("Lo siento, esa hora no existe.");
    }
  }
}


