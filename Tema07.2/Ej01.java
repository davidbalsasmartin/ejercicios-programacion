package tema07.pkg1;

import java.util.Scanner;

/**
 * Capítulo 7.2, Ejercicio 1
 *
 * @author David.B.M.
 */
public class Ej01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x[][] = new int[3][6];

    x[0][0] = 0;
    x[0][1] = 30;
    x[0][2] = 2;
    x[0][5] = 7;
    x[1][0] = 75;
    x[1][4] = 0;
    x[2][2] = -2;
    x[2][3] = 9;
    x[2][5] = 11;

    for (int contador = 0; contador <= 2; contador++) {
      System.out.print("Fila " + contador + ": ");
      for (int contador2 = 0; contador2 <= 5; contador2++) {
        System.out.print(x[contador][contador2] + " ");
      }
      System.out.println();
    }
  }
}
