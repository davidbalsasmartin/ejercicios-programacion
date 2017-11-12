/**
 * Capítulo 5, Ejercicio 39
 *
 * @author David.B.M.
 */


public class Ej39{
  public static void main (String[] args) {
		System.out.println("Por favor, introduce un número para calcular su factorial:");
    int num = Integer.parseInt(System.console().readLine());
    
    for (int contador = 1; contador <= num; contador++) {
      int mult = 1;
      for (int contador2 = 1; contador2 <= contador; contador2++) {
        mult = mult * contador2;
      }
    System.out.println(contador + "! = " + mult);
    }
	}
}

