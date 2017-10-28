/**
 * Capítulo 5, Ejercicio 13
 *
 * @author David.B.M.
 */


public class Ej13 {
	
	public static void main (String[] args) {
    
    int positivo = 0;
    int negativo = 0;
    
      for (int contador = 1; contador <= 10; contador++) {
        System.out.println("Por favor, introduce un número y pulsa enter");
        double num = Double.parseDouble(System.console().readLine());
        if (num >= 0) {
          positivo++ ;
        } else {
          negativo++ ;
        }
      }
      System.out.println("Son " + positivo + " números positivos");
      System.out.print("Y " + negativo + " números negativos");
  }
}
