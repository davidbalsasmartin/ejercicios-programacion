/**
 * Capítulo 5, Ejercicio 16
 *
 * @author David.B.M.
 */


public class Ej16 {
	
	public static void main (String[] args) {
      System.out.print("Mete un número entero al azar y pulsa enter para saber si es primo o no: ");
      int num = Integer.parseInt(System.console().readLine());
       int primo = 0;
      for (int contador = 2; contador < num; contador++) {
        if (num % contador == 0) {
          primo = 1 ;
        }
      }
      if (primo > 0) {
        System.out.println("El número no es primo");
      } else if (primo == 0) {
      System.out.println("El número es primo");
    }
  }
}

