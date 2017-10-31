/**
 * Capítulo 5, Ejercicio 18
 *
 * @author David.B.M.
 */


public class Ej18 {
	
	public static void main (String[] args) {
    boolean iguales = false;
    do {
      System.out.print("Por favor introduce un número e introduce enter : ");
      int num1 = Integer.parseInt(System.console().readLine());
      System.out.print("Por favor introduce otro número e introduce enter : ");
      int num2 = Integer.parseInt(System.console().readLine());
      if (num1 == num2) {
        System.out.println("Deben ser números diferentes");
      } else if (num1 < num2) {
        for (num1 = num1; num1 <= num2; num1 = num1 + 7 ) {
        System.out.println(num1);
        }
      iguales = true;
      } else if (num1 > num2) {
        for (num2 = num2; num2 <= num1; num2 = num2 + 7 ) {
        System.out.println(num2);
      
        }
      iguales = true;
      }
    }
    while (iguales == false);
  }
}
