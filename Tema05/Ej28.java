/**
 * Capítulo 5, Ejercicio 28
 *
 * @author David.B.M.
 */


public class Ej28 {
  public static void main (String[] args) {
    System.out.println("Por favor, introduce un número para calcular su factorial:");
    int num = Integer.parseInt(System.console().readLine());
    int mult = 1;
		for (int contador = 1; contador <= num; contador++) {
      mult = mult * contador;
    }
    System.out.println(num + "! = " + mult);
	}
}

