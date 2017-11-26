/**
 * Capítulo 6, Ejercicio 19
 *
 * @author David.B.M.
 */

public class Ej19{
  public static void main (String[] args) {
    int num;
    int max = 0;
    int min = 0;
    int suma = 0;
    for (int contador = 1; contador <= 50; contador++) {
      num = (int)(Math.random()*301 - 100);
      System.out.print(num + "  ");
      if (((num % 2 )== 0) && (num > max)) {
        max = num;
      } if (((num % 2 )!= 0) && (num < min)) {
        min = num;
      suma = suma + num;
      }
    }
    System.out.println();
    System.out.println("Número par más grande es = " + max);
    System.out.println("Número impar más pequeño es = " + min);
    System.out.println("La media de todos los nºs es = " + (suma / 50));
    
	}
}

