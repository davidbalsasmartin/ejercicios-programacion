/**
 * Capítulo 4, Ejercicio 14
 *
 * @author David.B.M.
 */

public class Ej14 {
  public static void main(String[] args) {
    System.out.println("Por favor, indica un número entero para saber");
    System.out.println("si es par y/o divisible entre 5: ");
    int numeroDado = Integer.parseInt(System.console().readLine());
    
    if ((numeroDado % 2 == 0) && (numeroDado % 5 == 0)) {
    System.out.println("Es par y divisible entre 5: ");
    } else if ((numeroDado % 2 == 0) && (numeroDado % 5 != 0)) {
    System.out.println("Es par e indivisible entre 5: ");
    } else if ((numeroDado % 2 != 0) && (numeroDado % 5 == 0)) {
    System.out.println("No es par, y es divisible entre 5: ");
    } else if ((numeroDado % 2 != 0) && (numeroDado % 5 != 0)) {
    System.out.println("No es par, ni divisible entre 5: "); 
    }
	}
}

