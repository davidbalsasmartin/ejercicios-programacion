package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 5
 *
 * @author David.B.M.
 */
public class Ej05 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int num[] = new int[10];
    int contador = 0;
    int max = -500;
    int min = 500;
    do {
      System.out.println("Por favor, introduce un número");
      num[contador] = s.nextInt();
      if (num[contador] > max) {
        max = num[contador];
      }
      if (num[contador] < min) {
        min = num[contador];
      }
      contador++;
    } while (contador <= 9);
    for (contador = 0; contador <= 9; contador++) {
      if (num[contador] == max) {
        System.out.println(num[contador] + "máximo");
      }
      if (num[contador] == min) {
        System.out.println(num[contador] + "mínimo");
      } else {
        System.out.println(num[contador]);
      }
    }
  }
}
