package tema07.pkg1;

/**
 * Capítulo 7.2, Ejercicio 5
 *
 * @author David.B.M.
 */
public class Ej05 {

  public static void main(String[] args) {
    int max = -1;
    int min = 501;
    int filaMax = -1;
    int columMax = -1;
    int filaMin = -1;
    int columMin = -1;
    int x[][] = new int[4][5];
    System.out.println("");
    for (int contador = 0; contador <= 3; contador++) {
      System.out.print("Fila " + contador + ": ");
      for (int contador2 = 0; contador2 <= 4; contador2++) {
        x[contador][contador2] = ((int) (Math.random() * 1001));
        System.out.print(x[contador][contador2] + " ");
        if (x[contador][contador2] > max) {
          max = x[contador][contador2];
          columMax = contador2;
          filaMax = contador;
        }
        if (x[contador][contador2] < min) {
          min = x[contador][contador2];
          columMin = contador2;
          filaMin = contador;
        }
      }
      System.out.println();
    }
    
    System.out.println();
    System.out.println("Mínimo: " + min + " en la columna " + columMin + " y en la fila " + filaMin);
    System.out.println("Máximo: " + max + " en la columna " + columMax + " y en la fila " + filaMax);
  }
  
}
