/**
 * Capítulo 5, Ejercicio 27
 *
 * @author David.B.M.
 */


public class Ej27 {
  public static void main (String[] args) {
		System.out.println("Por favor, introduce un número para contar");
		System.out.print("los múltiplos de 3 que contiene: ");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 1;
    int suma = 0;
    System.out.println("los múltiplos de 3 que contiene son: ");
    for (int mult = 1; mult < (num - 3); contador++) {
      mult = (contador * 3);
      suma = suma + mult;
      System.out.println(" 3 x " + contador + " = " + mult);
      if ((mult == num) || (mult == (num - 1)) || (mult == (num - 1))) {
        System.out.println("Y el total es = " + suma);
      }
    }
    
	}
}

