/**
 * Capítulo 5, Ejercicio 25
 *
 * @author David.B.M.
 */


public class Ej25 {
  public static void main (String[] args) {
    System.out.println("Por favor, introduce un número para darle la vuelta:");
    int num = Integer.parseInt(System.console().readLine());
    int suma= 0;
    while (num > 0) {
    int separarNum = num % 10;
    suma = (suma * 10) + (separarNum);
    num = num / 10;
    }
    System.out.println(suma);
	}
}

