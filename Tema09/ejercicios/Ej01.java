package tema09;

/**
 * Capítulo 9, Ejercicio 1
 *
 * @author David.B.M.
 */

public class Ej01 {

  public static void main(String[] args) {

    Caballo c1 = new Caballo("blanco", "pura", 600.50, 195, 50);
    Caballo c2 = new Caballo("negro", "mestiza", 780, 215, 65);
    Caballo c3 = new Caballo("marron", "pony", 922.50, 189, 43);

    int tirada = (int) (Math.random() * 3) + 1;

    switch (tirada) {
      case 1:
        System.out.println(c1);
        break;
      case 2:
        System.out.println(c2);
        break;
      case 3:
        System.out.println(c3);
        break;
      default:
    }
    tirada = (int) (Math.random() * 2) + 1;
    if (tirada == 1) {
      c1.relincha();
    } else if (tirada == 2) {
      c2.cabalga();
    }
  }

}
