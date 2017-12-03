package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 13
 *
 * @author David.B.M.
 */
public class Ej13 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int num[] = new int[100];
    int contador = 0;
    int max = -1;
    int min = 501;
    do {
      num[contador] = (int)(Math.random()* 500);
      if (num[contador] > max) {
        max = num[contador];
      }
      if (num[contador] < min) {
        min = num[contador];
      }
      System.out.print(num[contador] + " ");
      contador++;
    } while (contador <= 99);
    System.out.println();
    System.out.println("Quieres que se muestre el maximo 1 o minimo 2?");
    int finalm = s.nextInt();
    for (contador = 0; contador <= 99; contador++) {
      if ((num[contador] == max) && (finalm == 1)) {
        System.out.print("`" + num[contador] + "´ ");
      }
      if ((num[contador] == min) && (finalm == 2)) {
        System.out.print("`" + num[contador] + "´ ");
      } else {
        System.out.print(num[contador] + " ");
      }
    }
  }
}
