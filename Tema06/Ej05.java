/**
 * Capítulo 6, Ejercicio 5
 *
 * @author David.B.M.
 */

public class Ej05{
  public static void main (String[] args) {
    
    int media = 0;
    int max = 0;
    int min = 200;
    
    for (int contador = 1; contador <= 50; contador++) {
      int num = (int)(Math.random()*100 + 100);
      System.out.print(num + "  ");
      media = media + num;
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }
    System.out.println();
    System.out.println("la media es = " + media);
    System.out.println("el máximo es = " + max);
    System.out.println("el mínimo es = " + min);
		
	}
}
