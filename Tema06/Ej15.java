/**
 * Capítulo 6, Ejercicio 15
 *
 * @author David.B.M.
 */

public class Ej15{
  public static void main (String[] args) {
		int nota = 0;
    int num = (int)(Math.random()*6 + 1);
    for (int contador = 1; contador <= num; contador++) {
      for (int contador2 = 1; contador2 <= 4; contador2++) {
        nota = (int)(Math.random()*7 + 1);
        switch (nota) {
          case 1:
            System.out.print(" do");
            break;
          case 2:
            System.out.print(" re");
            break;
          case 3:
            System.out.print(" mi");
            break;
          case 4:
            System.out.print(" fa");
            break;
          case 5:
            System.out.print(" sol");
            break;
          case 6:
            System.out.print(" la");
            break;
          case 7:
            System.out.print(" si");
            break;
          default:
        }
      }
      System.out.print("|");
    }
    System.out.print("|");
	}
}

