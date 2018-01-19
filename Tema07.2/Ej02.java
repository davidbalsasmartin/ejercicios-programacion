package tema07.pkg1;

import java.util.Scanner;

/**
 * Capítulo 7.2, Ejercicio 2
 *
 * @author David.B.M.
 */
public class Ej02 {

  public static void main(String[] args) {
    
    int suma = 0;
    Scanner s = new Scanner(System.in);
    int x[][] = new int[4][5];
    for (int contador = 0; contador <= 3; contador++) {
      for (int contador2 = 0; contador2 <= 4; contador2++) {
        System.out.println("Por favor introduzca un número y pulse enter repetidas veces.");
        x[contador][contador2] = s.nextInt();
        suma = suma + x[contador][contador2];
      }
    }
    System.out.println("");
    for (int contador = 0; contador <= 3; contador++) {
      System.out.print("Fila " + contador + ": ");
      for (int contador2 = 0; contador2 <= 4; contador2++) {
        System.out.print(x[contador][contador2] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Total: " + suma);
  }
}
