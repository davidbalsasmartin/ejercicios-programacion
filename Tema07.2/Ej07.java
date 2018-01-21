package tema07.pkg1;

import java.util.Scanner;

/**
 * Capítulo 7.2, Ejercicio 1
 *
 * @author David.B.M.
 */
public class Ej07 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int marcar[][] = new int[7][7];
    boolean noRepet = false;
    boolean acierto = false;
    boolean error = false;
      int xMina;
      int yMina;
      int xPremio;
      int yPremio;
    do {
      xMina = ((int) (Math.random() * 8) + 1);
      yMina = ((int) (Math.random() * 8) + 1);
      xPremio = ((int) (Math.random() * 8) + 1);
      yPremio = ((int) (Math.random() * 8) + 1);
      if ((xMina != xPremio) || (yPremio != yPremio)) {
        noRepet = true;
      }
    } while (noRepet == false);
    do {
      System.out.print("Por favor, introduce el eje x (1-8): ");
      int x = s.nextInt();
      System.out.print("Por favor, introduce el eje y (1-8): ");
      int y = s.nextInt();
      for (int contador = 0; contador < 8; contador++) {
        System.out.print(contador + " | ");
        for (int contador2 = 0; contador2 < 8; contador2++) {
          if (((x == xMina) && (y == yMina) && (contador == x) && (contador2 == y))) {
            error = true;
            System.out.print(" :( ");
          } else if (((x == xPremio) && (y == yPremio) && (contador == x) && (contador2 == y))) {
            acierto = true;
            System.out.print(" :) ");
          } else if ((x == contador) && (y == contador2)) { 
            marcar[x][y] = 1;
            System.out.print("  x ");
          } else if (marcar[contador][contador2] > 0) {
            System.out.print("  x ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println("");
      }
      System.out.println("   ----------------------------------");
      System.out.println("      1   2   3   4   5   6   7   8");
      if (error == true) {
            System.out.println("Lo siento, has perdido");
      } else if (acierto == true) {
            System.out.println("Enhorabuena, has encontrado el tesoro");
      }
    } while ((error == false) && (acierto == false));
  }
}
