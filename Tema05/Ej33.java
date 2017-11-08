/**
 * Capítulo 5, Ejercicio 33
 *
 * @author David.B.M.
 */


public class Ej33 {
  public static void main (String[] args) {
    int num;
    int contador = 1;
    int contador2;
    int contador3;
    int espacios;
    
    System.out.print("Por favor introduce una altura para la U :");
    do {
      num = Integer.parseInt(System.console().readLine());
      if (num <= 2) {
        System.out.print("Por favor, introduce un número mayor a 2: ");
      }
    } while  (num <= 2);
      espacios = num - 2;
      while (contador < num) {
        contador++;
        System.out.print("*");
        for (contador2 = 1; contador2 <= espacios; contador2++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      System.out.print(" ");
      for (contador3 = 1; contador3 <= espacios; contador3++) {
          System.out.print("*");
      }
	}
}

