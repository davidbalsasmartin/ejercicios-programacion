package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 12
 *
 * @author David.B.M.
 */
public class Ej12 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int num[] = new int[10];
    int movido[] = new int[10];
    int contador = 0;
    System.out.println("Introduce 10 números por teclado y pulsa enter:");
    do {
      num[contador] = s.nextInt();
      contador++;
    } while (contador < 10);
    System.out.println("Que posicion deseas mover a otra: ()0-9");
    int moverDesde = s.nextInt();
    System.out.println("A que posicion deseas moverla: ()0-9");
    int moverHasta = s.nextInt();
    if ((moverDesde >= 0) && (moverHasta <= 9)) {
      System.out.println("Ordenados:");
      for (contador = 0; contador < 10; contador++) {
        if (contador == 0) {
          movido[0] = num[9];
        } else if ((contador < moverDesde + 1) || (contador > moverHasta)) {
          movido[contador] = num[contador - 1];
        } else if (contador == moverHasta) {
          movido[moverHasta] = num[moverDesde];
        } else {
          movido[contador] = num[contador];
        }
      }
      for (contador = 0; contador < 10; contador++) {
        num[contador] = movido[contador];
        System.out.println(num[contador]);
      }
    } else {
      System.out.println("Los datos son incorrectos");
    }
  }
}
