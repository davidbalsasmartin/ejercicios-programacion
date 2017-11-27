/**
 * Capítulo 6, Ejercicio 24
 *
 * @author David.B.M.
 */

public class Ej24{
  public static void main (String[] args) {
		
    System.out.print("Por favor introduce un número: ");
    long num = Long.parseLong(System.console().readLine());
    int longitud = -1;
    long numAux = (num);
		for (long divisor = num ; divisor > 0; num = num / 10) {
      divisor = num % 10;
      longitud++;
    }
    int numAux2 = (int)(Math.random()*longitud);
    for (int contador = 1 ; contador <= numAux2; contador++) {
      numAux = numAux / 10;
    }
    int num2 = (int)(numAux % 10);
    System.out.println(num2);
	}
}

