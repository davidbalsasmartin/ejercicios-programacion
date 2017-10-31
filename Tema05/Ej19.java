/**
 * Capítulo 5, Ejercicio 19
 *
 * @author David.B.M.
 */


public class Ej19 {
  public static void main (String[] args) {
    System.out.print("Introduce una altura para la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int alturaAux = 1;
    int contador = 0;
    int espacios = altura - 1;
    
    while (alturaAux <= altura) {
      for (contador = 1; contador <= espacios; contador++) {
        System.out.print(" ");
      }
      for (contador = 1; contador < alturaAux * 2; contador++) {
        System.out.print("*");
      }
      System.out.println();
      alturaAux++;
      espacios--;
    }
  }
}

