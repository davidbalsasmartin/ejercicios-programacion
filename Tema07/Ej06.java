package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 6
 *
 * @author David.B.M.
 */
public class Ej06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int contador = 0;
    int num[] = new int[15];
    int numAux[] = new int[15];
    System.out.println("Por favor, introduzca 15 números enteros pulsando enter");
    System.out.println("Tras cada uno:");
    do {
      num[contador] = s.nextInt();
      numAux[contador] = num[contador];
      contador++;
    } while (contador < 15);
    System.out.println("Aquí empieza:");
    for (contador = 0; contador < 15; contador++) {
      if (contador == 0) {
        num[0] = numAux[14];
      } else {
        num[contador] = numAux[contador - 1];
      }
      System.out.println(num[contador]);
    }
  }
}
