package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 14
 *
 * @author David.B.M.
 */
public class Ej14 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String palabra[] = new String[8];
    String palabraAux[] = new String[8];
    String palabraAux2[] = new String[8];
    String colores[] = new String[9];
    int longitud = 0;
    int longitud2 = 0;
    int contador2 = 0;
    int contador = 0;
    System.out.println("Por favor introduce 8 palabras, y alguna sea un color:");
    do {
      palabra[contador] = s.nextLine().toLowerCase();
      contador++;
    } while (contador < 8);
    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";
    for (contador = 0; contador < 8; contador++) {
      int longitud3 = 0;
      for (contador2 = 0; contador2 < 9; contador2++) {
        if (palabra[contador].equals(colores[contador2])) {
          palabraAux[longitud] = palabra[contador];
          longitud++;
          longitud3++;
        }
      }
      if (longitud3 == 0) {
        palabraAux2[longitud2] = palabra[contador];
        longitud2++;
      }
    }
    System.out.println("aqui empieza");
    contador2 = 0;
    for (contador = 0; contador < 8; contador++) {
      if (contador < longitud) {
        palabra[contador] = palabraAux[contador];
        System.out.println(palabra[contador]);
      } else {
        palabra[contador] = palabraAux2[contador2];
        System.out.println(palabra[contador]);
        contador2++;
      }
    }
  }
}
