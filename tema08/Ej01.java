package tema08;

/**
 * Capítulo 7, Ejercicio 3
 *
 * @author David.B.M.
 */
import mates.matematicas;

public class Ej01 {

  public static void main(String[] args) {
    //volteado
    System.out.println("El número 15 volteado es: " + mates.matematicas.voltea(15));
    System.out.println("El número 2752941 volteado es: " + mates.matematicas.voltea(2752941));
    System.out.println("El número -23 volteado es: " + mates.matematicas.voltea(-23));
    //primo
    if (mates.matematicas.esPrimo(7)) {
      System.out.println("El número 7 es primo");
    } else {
      System.out.println("El número 7 no es primo");
    }
    if (mates.matematicas.esPrimo(15)) {
      System.out.println("El número 15 es primo");
    } else {
      System.out.println("El número 15 no es primo");
    }
    //siguientePrimo
    System.out.println("El número primo siguiente a 30 es: " + mates.matematicas.siguientePrimo(30));
    System.out.println("El número primo siguiente a 36 es: " + mates.matematicas.siguientePrimo(37));
  }
}
