package ExDawTurno1;

/**
 * Capítulo 7, Ejercicio 8
 *
 * @author David.B.M.
 */
public class Ej3 {

  public static void main(String[] args) {
    int v;
    int s;
    int o = 0;
    do {
      v = (int) (Math.random() * 5 + 1);
      s = (int) (Math.random() * 5 + 1);
    } while ((v == s) || ((v - s) == -1) || ((v - s) == +1));
    if (v > s) {
      o = (int) -(Math.random() * (s - v)) + 1;
    } else if (s > v) {
      o = (int) -(Math.random() * (v - s)) + 1;
    }
    System.out.println("* * * * * * *");
    System.out.println("*           *");
    System.out.println("*           *");
    System.out.print("*");
    for (int contador = 1; contador <= 5; contador++) {
      if (v > s) {
        if (contador == s) {
          System.out.print(" S");
        } else if (contador == (s + o)) {
          System.out.print(" o");
        } if (contador == v) {
          System.out.print(" V");
        } else {
          System.out.print(" ");
        }
      } if (s > v) {
        if (contador == v) {
          System.out.print(" V");
        } else if (contador == (v + o)) {
          System.out.print(" o");
        } else if (contador == s) {
          System.out.print(" S");
        } else {
          System.out.print("  ");
        }
      }
    }
    System.out.println(" *");
  }
}
