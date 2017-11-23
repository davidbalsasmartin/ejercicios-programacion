/**
 * Capítulo 6, Ejercicio 13
 *
 * @author David.B.M.
 */

public class Ej13{
  public static void main (String[] args) {
    int dado1;
    int dado2;
    int contador = 1;
		do {
      System.out.println("Tirada " + contador + " = ");
      dado1 = (int)(Math.random()*6) + 1;
      System.out.println("Dado 1: " + dado1);
      dado2 = (int)(Math.random()*6) + 1;
      System.out.println("Dado 2: " + dado2);
      System.out.println();
      contador++;
    } while (dado1 != dado2);
    System.out.println("FIN");
	}
}

