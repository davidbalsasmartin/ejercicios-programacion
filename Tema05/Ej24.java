/**
 * Capítulo 5, Ejercicio 24
 *
 * @author David.B.M.
 */


public class Ej24 {
  public static void main (String[] args) {
		System.out.println("Por favor, introduce un número de comienzo");
    int num =Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduce una altura");
    int altura =Integer.parseInt(System.console().readLine());
    
    int alturaAux = 1;
    int espacios = altura - 1;
    int numIzq = num;
    
    while (alturaAux <= altura) {
      for (int contador = 1; contador <= espacios; contador++) {
      System.out.print(" ");
      }
      for (int incremento = num; incremento <= numIzq; incremento++) {
      System.out.print(incremento);
      }
      if (num <= 1) {
        for (int decremento = alturaAux - 1; decremento >= num; decremento--) {
        System.out.print(decremento);
        }
      } else {
        for (int decremento = alturaAux; decremento >= num; decremento--) {
        System.out.print(decremento);
        }
      }
      System.out.println();
      espacios--;
      alturaAux++;
      numIzq++;
    }
	}
}

