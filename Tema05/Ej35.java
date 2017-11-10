/**
 * Capítulo 5, Ejercicio 35
 *
 * @author David.B.M.
 */


public class Ej35 {
  public static void main (String[] args) {
    System.out.println("Por favor introduce una altura para la X");
    System.out.print("Debe ser un número entero, impar y mayor que 4: ");
    int num = Integer.parseInt(System.console().readLine());
    int espaciosAntesArriba = 0;
    int arriba = num / 2;
    int espaciosDentroArriba = num - 2;
    int espaciosAntesAbajo = arriba;
    int contar = 1;
    int espaciosDentroAbajo = 1;
    if ((num < 5) || ((num % 2) == 0)) {
      System.out.print("Es menor a 5 o par");
    } else {
      while (contar <= arriba) {
        for (int contador = 1; contador <= espaciosAntesArriba; contador++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int contador = 1; contador <= espaciosDentroArriba; contador++) {
          System.out.print(" ");
        }
        System.out.println("*");
        espaciosAntesArriba++;
        espaciosDentroArriba = espaciosDentroArriba - 2;
        contar++;
      }
      for (int contador = 1; contador <= arriba; contador++) {
          System.out.print(" ");
      }
      System.out.println("*");
      while (contar < num) {
        for (int contador = 1; contador < espaciosAntesAbajo; contador++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int contador = 1; contador <= espaciosDentroAbajo; contador++) {
          System.out.print(" ");
        }
        System.out.println("*");
        contar++;
        espaciosAntesAbajo--;
        espaciosDentroAbajo = espaciosDentroAbajo + 2;
      }
    }
  }
}
