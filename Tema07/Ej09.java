package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 9
 *
 * @author David.B.M.
 */
public class Ej09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num[] = new int[12];
    int contador = 0;
    System.out.println("Introduce 8 números, pulsando enter tras cada uno:");
    do {
      num[contador] = s.nextInt();
      contador++;
    } while (contador < 8);
    for (contador = 0; contador < 8; contador++) {
      if ((num [contador] % 2)== 0) {
        System.out.println(num[contador] + "PAR ");
      } else {
        System.out.println(num[contador] + "IMPAR ");
      }
    }
  }
}
