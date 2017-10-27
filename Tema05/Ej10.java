/**
 * Capítulo 5, Ejercicio 10
 *
 * @author David.B.M.
 */


public class Ej10 {
	
	public static void main (String[] args) {
    
      System.out.println("Por favor, introduce un número positivo y pulsa enter");
      System.out.println("Para parar, introduce un número negativo y pulsa enter");
      double suma = 0;
      int contador = 0;
      double numeroIntro = 0;
    while (numeroIntro >= 0) {
      numeroIntro = Double.parseDouble(System.console().readLine());
      suma = numeroIntro + suma;
      contador++ ;
    }
    System.out.println("La media es " + ((suma - numeroIntro) / (contador - 1)));
	}
}
