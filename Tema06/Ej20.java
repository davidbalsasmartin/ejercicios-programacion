/**
 * Capítulo 6, Ejercicio 20
 *
 * @author David.B.M.
 */

public class Ej20{
  public static void main (String[] args) {
    System.out.print("Por favor introduzca la capacidad de litros: ");
    int capacidad =Integer.parseInt(System.console().readLine());
    int litros = (int)(Math.random()*capacidad);
    for (int contadorReves = capacidad; contadorReves >= 1; contadorReves--) {
      System.out.print("*");
      for (int contador = 1; contador <= 4; contador++) {
        if (contadorReves <= litros) {
            System.out.print("-");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("*");
    }
		System.out.print("******");
    System.out.println("La cuba tiene " + capacidad + " litros de capacidad");
    System.out.println("Y de esos litros, " + litros + " están ocupados");
	}
}

