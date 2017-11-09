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
    int contar = 1;
    System.out.print(arriba);
    if ((num < 5) || ((num % 2) == 0)) {
      System.out.print("Es menor a 5 o par");
    } else {
      while (contar <= arriba) {
        for (int contador = 0; contador <= espaciosAntesArriba; contador++) 
          System.out.print("*");
        }
        System.out.println();
        espaciosAntesArriba++;
        contar++;
      }
  }
}
