package tema07.pkg1;

/**
 * Capítulo 7.2, Ejercicio 3
 *
 * @author David.B.M.
 */
public class Ej03 {

  public static void main(String[] args) {
    
    int suma = 0;
    int x[][] = new int[4][5];
    System.out.println("");
    for (int contador = 0; contador <= 3; contador++) {
      System.out.print("Fila " + contador + ": ");
      for (int contador2 = 0; contador2 <= 4; contador2++) {
        x[contador][contador2] = ((int) (Math.random() * 899) + 101);
        System.out.print(x[contador][contador2] + " ");
        suma = suma + x[contador][contador2];
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Total: " + suma);
  }
}
