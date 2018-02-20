package Ex01dbm;

public class Ex01dbm03 {

  /**
   * Ejercicio 3 examen programación 1º DAW
   *
   * Primer turno
   *
   * 20/02/2018
   *
   * @author David Balsas Martín
   */
  public static void main(String[] args) {
    String arrayA[] = {"coche", "moto", "bicicleta", "camion"};
    String arrayB[] = {"coche", "aeropuerto", "bicicleta", "CAMION"};
    String arrayComun[] = palabrasComunes(arrayA, arrayB);
    for (int i = 0; i < arrayComun.length; i++) {
      System.out.print(arrayComun[i] + " ");
    }

  }

  public static String[] palabrasComunes(String[] arrayA, String[] arrayB) {
    int sonComunes = 0;
    for (int i = 0; i < arrayA.length; i++) {
      for (int i2 = 0; i2 < arrayB.length; i2++) {
        if (arrayA[i] == arrayB[i2]) {
          sonComunes++;
        }
      }
    }
    String arrayX[] = new String [sonComunes];
    sonComunes = 0;
    int nuevoArray = 0;
    for (int i = 0; i < arrayA.length; i++) {
      for (int i2 = 0; i2 < arrayB.length; i2++) {
        if (arrayA[i] == arrayB[i2]) {
          arrayX[nuevoArray] = arrayA[i];
          nuevoArray++;
        }
      }
    }
    return arrayX;

  }
}
