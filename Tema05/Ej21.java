/**
 * Capítulo 5, Ejercicio 21
 *
 * @author David.B.M.
 */


public class Ej21 {
  public static void main (String[] args) {
    int num;
    int suma = 0;
    int cuentaNumeros = 0;
    int mayorN = 0;
    do {
      System.out.println("Introduce un número y pulsa enter");
      System.out.print("Para parar, introduce un número negativo: ");
      num = Integer.parseInt(System.console().readLine());
      if (num >= 0) {
        suma = suma + num;
        cuentaNumeros++;
        if (num % 2 == 0) {
          if (num > mayorN) {
            mayorN = num;
          }
        }
      }
    } while (num >= 0); {
      System.out.println("Hay " + cuentaNumeros + " números en total");
      System.out.println("La media es: " + (suma / cuentaNumeros));
      System.out.println("El número par más grande es " + mayorN);
    }
  }
}

