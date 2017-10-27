/**
 * Capítulo 5, Ejercicio 7
 *
 * @author David.B.M.
 */


public class Ej07 {
	
	public static void main (String[] args) {
    int comb = 2346;
    int intentos = 1;
    boolean acertar = false;
      do {
       System.out.println("Por favor, intenta averiguar la clave de 4 cifras positiva:");
       int valor = Integer.parseInt(System.console().readLine());
       intentos++ ;
       if (valor == comb) {
         System.out.println("Correcto");
         acertar = true;
        } else {
        System.out.println("Incorrecto");
        }
      }
      while ((intentos <= 4) && (acertar == false));
    } 
  }

