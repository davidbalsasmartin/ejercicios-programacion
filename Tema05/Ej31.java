/**
 * Capítulo 5, Ejercicio 31
 *
 * @author David.B.M.
 */


public class Ej31 {
  public static void main (String[] args) {
    System.out.println("Por favor introduce una altura para la L :");
    int altura = Integer.parseInt(System.console().readLine());
    int contador;
    
    for (contador = 1; contador < altura; contador++) {
      System.out.println("*");
    }
    for (contador = 1; contador <= altura - 2; contador++) {
      System.out.print("* ");
    }
  }
}
