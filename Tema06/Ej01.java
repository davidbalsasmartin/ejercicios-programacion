/**
 * Capítulo 6, Ejercicio 1
 *
 * @author David.B.M.
 */


public class Ej01{
  public static void main (String[] args) {
    int suma = 0;
		for (int contador = 1; contador <=3; contador++){
    int dado = (int)(Math.random()*6) + 1;
    System.out.println("Dado " + contador + " = " + dado);
    suma = suma + dado;
    }
    System.out.println("Y la suma de los 3 es = " + suma);
	}
}

