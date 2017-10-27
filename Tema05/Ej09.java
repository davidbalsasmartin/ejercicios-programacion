/**
 * Capítulo 5, Ejercicio 9
 *
 * @author David.B.M.
 */


public class Ej09 {
	
	public static void main (String[] args) {
    int digitos = 1, n;
    System.out.print("Por favor, introduce un número por teclado: ");
    int nIntro = Integer.parseInt(System.console().readLine());
    n = nIntro ;
    while (n > 10) {
      n /= 10;
      digitos++;
    }
    System.out.print("EL número " + nIntro + " tiene " + digitos + " dígito/s.");
	}
}
