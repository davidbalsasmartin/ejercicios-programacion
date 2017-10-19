/**
 * Capítulo 4, Ejercicio 13
 *
 * @author David.B.M.
 */

public class Ej13 {
  public static void main(String[] args) {
    System.out.println("Este programa ordena 3 números de menor a mayor");
    System.out.print("Por favor, indica un número entero: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, indica otro: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, indica otro: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if ((num1 > num2) && (num2 > num3)) {
    System.out.println(num1 + " > " + num2 + " > " + num3);
    }
    else if ((num1 > num3) && (num3 > num2)) {
    System.out.println(num1 + " > " + num3 + " > " + num2);
    }
    else if ((num2 > num1) && (num1 > num3)) {
    System.out.println(num2 + " > " + num1 + " > " + num3);
    }
    else if ((num2 > num3) && (num3 > num1)) {
    System.out.println(num2 + " > " + num3 + " > " + num1);
    }
    else if ((num3 > num1) && (num1 > num2)) {
    System.out.println(num3 + " > " + num1 + " > " + num2);
    }
    else if ((num3 > num2) && (num2 > num1)) {
    System.out.println(num3 + " > " + num2 + " > " + num1);
    }
  }
}
