package tema07.pkg1;

/**
 * Capítulo 7.2, Ejercicio 4
 *
 * @author David.B.M.
 */
public class Ej04 {

  public static void main(String[] args) throws InterruptedException {
    
    int suma = 0;
    int x[][] = new int[4][5];
    System.out.println("");
    for (int contador = 0; contador <= 3; contador++) {
      System.out.print("Fila " + contador + ": ");
      for (int contador2 = 0; contador2 <= 4; contador2++) {
        Thread.sleep(500);
        x[contador][contador2] = ((int) (Math.random() * 899) + 101);
        System.out.print(x[contador][contador2] + " ");
        suma = suma + x[contador][contador2];
      }
      System.out.println();
    }
    System.out.println();
    Thread.sleep(500);
    System.out.println("Total: " + suma);
  }
}
