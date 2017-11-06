/**
 * Capítulo 5, Ejercicio 26
 *
 * @author David.B.M.
 */


public class Ej26 {
  public static void main (String[] args) {
    System.out.println("Por favor, introduce un número:");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduce un dígito:");
    int digit = Integer.parseInt(System.console().readLine());
    
    System.out.println("El dígito " + digit + " se repite en " + num + " en = ");
    int contador = 1;
    int suma= 0;
    while (num > 0) {
      int separarNum = num % 10;
      suma = (suma * 10) + (separarNum);
      num = num / 10;
    }
    
    while (suma > 0) {
      if ((suma % 10) == digit) {
        System.out.println(" " + contador);
      }
      suma = suma / 10;
      contador++;
    }
	}
}
