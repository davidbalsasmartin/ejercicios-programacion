/**
 * Capítulo 5, Ejercicio 30
 *
 * @author David.B.M.
 */


public class Ej30 {
  public static void main (String[] args) {
    System.out.println("Por favor introduce un número día de la semana en nº 1-7:");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.println("introduce una hora exacta en nº 0-23");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor introduce otro número día de la semana:");
    int dia2 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce otra hora exacta");
    int hora2 = Integer.parseInt(System.console().readLine());
    
    int contador;
    int transformaHoras = (((dia - 1) * 24) + (hora));
    int transformaHoras2 = (((dia2 - 1) * 24) + (hora2));
    System.out.println("Hay " + (transformaHoras2 - transformaHoras) + (" horas de diferencia."));
  }
}
