/**
 * Ejercicio 3 examen programación 1º DAW
 * 
 * Primer turno
 * 
 * 14/11/2017
 *
 * @author David Balsas Martín
 */


public class Ex01dbm3 {
  public static void main (String[] args) {
    System.out.print("Por favor, introduzca  el lado del cuadrado: ");
    int lado = Integer.parseInt(System.console().readLine());
    
    if (lado < 5) { // comprobamos que sea mayor a 4
      System.out.println("Lo siento, los datos introducidos no son correctos,");
      System.out.println("el valor mínimo para el lado es 5.");

    } else {
      for (int contador1= 1; contador1 <= 2; contador1++) { // primeras dos columnas
        for (int contador = 1; contador <= lado; contador++) { // sus asteriscos
          System.out.print("* ");
        }
        System.out.println();
      }
      for (int contador1 = 1; contador1 <= lado - 4; contador1++) { // parte central
        System.out.print("* * ");
        for (int contador = 1; contador <= lado - 4; contador++) { // los espacios
          System.out.print("  ");
        }
        System.out.println("* *");
      }
      for (int contador1= 1; contador1 <= 2; contador1++) { // últimas columnas
        for (int contador = 1; contador <= lado; contador++) { //asteriscos finales
          System.out.print("* ");
        }
        System.out.println();
      }
    }
	}
}
