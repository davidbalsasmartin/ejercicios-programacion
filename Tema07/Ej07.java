package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 7
 *
 * @author David.B.M.
 */
public class Ej07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num[] = new int[100];
    int buscar;
    int sustituir;
    int contador;
    for (contador = 0; contador < 100; contador++) {
      int aleatorio = (int) (Math.random() * 21);
      num[contador] = aleatorio;
      System.out.print(num[contador] + " ");
    }
    System.out.println();
    System.out.print("Por favor, introduce el número a buscar: ");
    buscar = s.nextInt();
    System.out.print("Por favor, introduce el número por el que cambiar: ");
    sustituir = s.nextInt();
    for (contador = 0; contador < 100; contador++) {
      if (num[contador] == buscar) {
        num[contador] = sustituir;
        System.out.print("`" + num[contador] + "´" + " ");
      } else {
        System.out.print(num[contador] + " ");
      }
    }
  }
}
