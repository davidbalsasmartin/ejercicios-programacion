package tema07;

/**
 * Capítulo 7, Ejercicio 10
 *
 * @author David.B.M.
 */
public class Ej10 {

  public static void main(String[] args) {
    int num[] = new int[20];
    int contador = 0;
    int contador2 = 0;
    int contador3 = 0;
    int par[] = new int[20];
    int impar[] = new int[20];
    do {
      num[contador] = (int) (Math.random() * 100);
      System.out.print(num[contador] + " ");
      contador++;
    } while (contador < 20);
    for (contador = 0; contador < 20; contador++) {
      if ((num[contador] % 2) == 0) {
        par[contador2] = num[contador];
        contador2++;
      } else {
        impar[contador3] = num[contador];
        contador3++;
      }
    }
    System.out.println();
    contador3 = 0;
    for (contador = 0; contador < 20; contador++) {
      if (contador < contador2) {
        num[contador] = par[contador];
      } else {
        num[contador] = impar[contador3];
        contador3++;
      }
      System.out.print(num[contador] + " ");
    }
  }
}
