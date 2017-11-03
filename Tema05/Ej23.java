/**
 * Capítulo 5, Ejercicio 23
 *
 * @author David.B.M.
 */


public class Ej23 {
  public static void main (String[] args) {
    int suma = 0;
    int contador = 0;
    do {
      System.out.println("Por favor, introduce un número entero y pulsa enter repetidas veces");
      int num = Integer.parseInt(System.console().readLine());
      suma = suma + num;
      contador++;
    } while (suma < 1000);
    System.out.println("suma = " + suma + " ,números = " + contador + " ,media = " + (suma / contador));
	}
}

