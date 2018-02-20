package Ex01dbm;

/**
 * Ejercicio 3 examen programación 1º DAW
 *
 * Primer turno
 *
 * 20/02/2018
 *
 * @author David Balsas Martín
 */
public class Ex01dbm04 {

  public static void main(String[] args) {
    int[][] nuevoArray = generaArrayBiInt(4, 4);
    int[][] centro = nucleo(nuevoArray);
    for (int f = 0; f < nuevoArray.length; f++) {
      for (int c = 0; c < nuevoArray[0].length; c++) {
        if (nuevoArray[f][c] < 10) {
          System.out.printf(nuevoArray[f][c] + "  ");
        } else {
          System.out.printf(nuevoArray[f][c] + " ");
        }
      }
      System.out.println();
    }
    System.out.println("Resultado: ");
    for (int f = 0; f < centro.length; f++) {
      for (int c = 0; c < centro[0].length; c++) {
        if (centro[f][c] < 10) {
          System.out.printf(centro[f][c] + "  ");
        } else {
          System.out.printf(centro[f][c] + " ");
        }
      }
      System.out.println();
    }

  }

  public static int[][] generaArrayBiInt(int filas, int columnas) {
    int[][] x = new int[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        x[i][j] = (int) (Math.random() * 100 + 1);
      }
    }
    return x;

  }

  public static int[][] nucleo(int[][] n) {
    int[][] centroAux = {{-1, -1}, {-1, -1}};
    int contador1 = (n.length / 2) - 1;
    int contador2 = (n.length / 2);
    if ((n.length == n[0].length) && ((n.length % 2) == 0) && (n.length >= 4)) {
      for (int i = 0; i < n.length; i++) {
        for (int j = 0; j < n[0].length; j++) {
          if ((n[i][j] == n[contador1][contador1])) {
            centroAux[0][0] = n[i][j];
          } else if ((n[i][j] == n[contador1][contador2])) {
            centroAux[0][1] = n[i][j];
          } else if ((n[i][j] == n[contador2][contador1])) {
            centroAux[1][0] = n[i][j];
          } else if ((n[i][j] == n[contador2][contador2])) {
            centroAux[1][1] = n[i][j];
          } else;
        }
      }
    } else {

    }
    return centroAux;
  }
}
