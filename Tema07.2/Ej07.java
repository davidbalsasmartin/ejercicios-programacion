package tema07.pkg1;

import java.util.Scanner;

/**
 * Capítulo 7.2, Ejercicio 1
 *
 * @author David.B.M.
 */
public class Ej07 {

  public static void main(String[] args) {
    boolean noRepet = false;
    boolean acierto = false;
    boolean error = false;
    do {
      int xMina = ((int) (Math.random() * 8) + 1);
      int yMina = ((int) (Math.random() * 8) + 1);
      int xPremio = ((int) (Math.random() * 8) + 1);
      int yPremio = ((int) (Math.random() * 8) + 1);
      if ((xMina != xPremio) || (xPremio != yPremio)) {
        noRepet = true;
      }
    } while (noRepet == false);
    do {
      for (int contador = 0; contador <= 8; contador++) {
        System.out.print(contador + " : ");
        for (int contador2 = 0; contador <= 8; contador++) {
          System.out.print(contador + "  ");
        }
      }
      System.out.print("   a  b  c  d  e  f  g  h");
    } while ((error == false) && (acierto == false));
  } 
}
