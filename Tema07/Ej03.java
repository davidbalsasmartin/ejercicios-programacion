package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 3
 *
 * @author David.B.M.
 */

public class Ej03{
  public static void main (String[] args) {
  
    Scanner s = new Scanner (System.in);
    int numFinal[] = new int [10];
    int contador = 9;
    int contador2 = 0;
    do {
      System.out.println("Por favor, introduce un número");
      int num = s.nextInt();
      numFinal[contador] = num;
      contador--;
    } while (contador >= 0);
    for (contador = 1; contador<= 10; contador++) {
    System.out.println(numFinal[contador2]);
    contador2++;
    }
  }
}
