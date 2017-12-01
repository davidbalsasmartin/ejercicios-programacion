package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 10
 *
 * @author David.B.M.
 */
public class Ej11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num[] = new int[10];
    int contador = 0;
    int contadorEsp = 0;
    int contadorPrim = 0;
    int contadorNoPrim = 0;
    int prim[] = new int[10];
    int noPrim[] = new int[10];
    System.out.println("Por favor, introduce 10 números: ");
    do {
      num[contador] = s.nextInt();
      contador++;
    } while (contador < 10);
    for (contador = 0; contador < 10; contador++) {
      contadorPrim = 0;
      for (int contador2 = 2; contador2 < num[contador]; contador2++) {
        if ((num[contador] % contador2) == 0) {
          contadorPrim++;
        }
      }
      if (contadorPrim == 0) {
        prim[contadorEsp] = num[contador];
        contadorEsp++;
      }
      if (contadorPrim != 0) {
        noPrim[contadorNoPrim] = num[contador];
        contadorNoPrim++;
      }
    }
    System.out.println();
    int contador3 = 0;
    for (contador = 0; contador < 10; contador++) {
      if (contador < contadorEsp) {
        num[contador] = prim[contador];
      } else {
        num[contador] = noPrim[contador3];
        contador3++;
      }
      System.out.print(num[contador] + " ");
    }
  }
}
