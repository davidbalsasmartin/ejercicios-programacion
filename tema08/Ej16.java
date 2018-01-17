package tema08;

/**
 * Capítulo 8, Ejercicio 16
 *
 * @author David.B.M.
 */
import mates.matematicas;
public class Ej16 {
  public static void main(String[] args) {
    int contador;
    for (contador = 1; contador <= 1999 ; contador++) {
      if (mates.matematicas.esCapicua(contador)) {
      System.out.println(contador + " es capicua.");
      }
    }
  }
  
}
