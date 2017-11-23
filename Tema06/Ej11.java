/**
 * Capítulo 6, Ejercicio 11
 *
 * @author David.B.M.
 */

public class Ej11{
  public static void main (String[] args) {
    int nota = 0;
    int notaSus = 0;
    int notaSuf = 0;
    int notaBien = 0;
    int notaNot = 0;
    int notaSob = 0;
    for (int contador = 1; contador <= 20; contador++) {
      nota = (int)(Math.random() * 5 + 1);
      switch (nota) {
        case 1:
          System.out.println("Nota " + contador + ": Suspenso");
          notaSus++;
          break;
        case 2:
          System.out.println("Nota " + contador + ": Suficiente");
          notaSuf++;
          break;
        case 3:
          System.out.println("Nota " + contador + ": Bien");
          notaBien++;
          break;
        case 4:
          System.out.println("Nota " + contador + ": Notable");
          notaNot++;
          break;
        case 5:
          System.out.println("Nota " + contador + ": Sobresaliente");
          notaSob++;
          break;
        default:
      }
    }
    System.out.println(notaSus + ": Suspensos");
    System.out.println(notaBien + " : Suficientes");
    System.out.println(notaSuf + ": Bien");
    System.out.println(notaNot + ": NOtables");
    System.out.println(notaSob + ": Sobresaliente");
    
	}
}

