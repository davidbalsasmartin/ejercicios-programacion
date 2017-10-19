/**
 * Capítulo 4, Ejercicio 19
 *
 * @author David.B.M.
 */

public class Ej19 {
  public static void main(String[] args) {
    System.out.println("Indica un número entero de hasta 5 cifras:");
    int cifraCompleta = Integer.parseInt(System.console().readLine());

    if ((cifraCompleta > -10) && (cifraCompleta < 10)) {
    System.out.println("Tiene una cifra");
    } else if (((cifraCompleta <= -10) && (cifraCompleta > -100)) || ((cifraCompleta >= 10) && (cifraCompleta < 100))) {
    System.out.println("Tiene dos cifras");
    }
    if (((cifraCompleta <= -100) && (cifraCompleta > -1000)) || ((cifraCompleta >= 100) && (cifraCompleta < 1000))) {
    System.out.println("Tiene tres cifras");
    }
    if (((cifraCompleta <= -1000) && (cifraCompleta > -10000)) || ((cifraCompleta >= 1000) && (cifraCompleta < 10000))) {
    System.out.println("Tiene cuatro cifras");
    }
    if (((cifraCompleta <= -10000) && (cifraCompleta > -100000)) || ((cifraCompleta >= 10000) && (cifraCompleta < 100000))) {
    System.out.println("Tiene cinco cifras");
    }
    if (((cifraCompleta <= -100000) || (cifraCompleta >= 100000))) {
    System.out.println("Inválido");
    }
  }
}
