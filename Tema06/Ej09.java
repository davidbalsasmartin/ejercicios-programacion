/**
 * Capítulo 6, Ejercicio 9
 *
 * @author David.B.M.
 */

public class Ej09{
  public static void main (String[] args) {
    int contador = 0;
    int num;
    do {
      num = ((int)(Math.random()*51)*2);
      contador++;
    } while (num != 24);
    System.out.println("Ya ha salido el nº24 tras " + contador + " intentos");
  }
}
