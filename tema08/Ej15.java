package tema08;

/**
 * Capítulo 8, Ejercicio 15
 *
 * @author David.B.M.
 */
import mates.matematicas;
public class Ej15 {
  public static void main(String[] args) {
    int contador;
    for (contador = 1; contador <= 1000 ; contador++) {
      if (mates.matematicas.esPrimo(contador)) {
      System.out.println(contador + " es primo. ");
      }
    }
  }
  
}
