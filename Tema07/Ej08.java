package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 8
 *
 * @author David.B.M.
 */
public class Ej08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num[] = new int[12];
    int contador = 0;
    System.out.println("Introduce la temperatura media de los 12");
    System.out.println("meses de 2016 de uno en uno: ");
    do {
      num[contador] = s.nextInt();
      contador++;
    } while (contador < 12);
    System.out.println("Gráfico de todos los meses: ");
    for (contador = 0; contador < 12; contador++) {
      for (int contador2 = 1; contador2 <= num[contador]; contador2++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
