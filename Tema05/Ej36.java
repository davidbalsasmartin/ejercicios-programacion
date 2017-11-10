/**
 * Capítulo 5, Ejercicio 36
 *
 * @author David.B.M.
 */


public class Ej36 {
  public static void main (String[] args) {
    System.out.print("Por favor, introduce un número entero positivo :");
    long num = Long.parseLong(System.console().readLine());
		long suma= 0;
    long numAux = num;
    while (numAux > 0) {
      long separarNum = numAux % 10;
      suma = (suma * 10) + (separarNum);
      numAux = numAux / 10;
    }
    if (suma == num) {
      System.out.print("El número " + num + " es capicúa");
    } else {
      System.out.print("El número " + num + " no es capicúa");
    }
	}
}

