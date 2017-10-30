/**
 * Capítulo 5, Ejercicio 16
 *
 * @author David.B.M.
 */


public class Ej16 {
	
	public static void main (String[] args) {
    boolean primo = true;
    do {
      System.out.print("Mete un número entero al azar y pulsa enter para saber si es primo o no: ");
      int num = Integer.parseInt(System.console().readLine());
      if (num == 1) {
        System.out.println("El número uno no es primo");
        primo = true;
      } else if ((num == 2) || (num == 3) || (num == 5)) {
        System.out.println("El número es primo");
        primo = false;
      } else if (((num % 2) == 0) || ((num % 3) == 0) || ((num % 5) == 0)) {
        System.out.println("El número no es primo");
        primo = true;
      } else {
        System.out.println("El número es primo");
        primo = true;
      }
    } while (primo = true);
  }
}
