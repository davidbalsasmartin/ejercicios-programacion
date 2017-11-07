/**
 * Capítulo 5, Ejercicio 29
 *
 * @author David.B.M.
 */


public class Ej29 {
  public static void main (String[] args) {
    System.out.print("Por favor, introduce un número entero grande:");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("introduce un número pequeño: ");
    int numDiv = Integer.parseInt(System.console().readLine());
    
    int contador;
    System.out.print("Los números");
		for (contador = 1; contador <= num; contador++) {
      if ((contador % numDiv) != 0) {
        System.out.print("  " + contador);
      }
    }
    System.out.println();
    System.out.println("no son divisibles entre " + numDiv + ", siendo menores de " + num);
	}
}

