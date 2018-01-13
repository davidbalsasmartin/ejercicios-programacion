/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mates;

/**
 *
 * @author David
 */
public class matematicas {

  /**
   * Le da la vuelta a un número largo.
   * <p>
   * @param x número que se quiere voltear
   * @return número volteado.
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }
    long volteado = 0;

    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }
  /**
   * Le da la vuelta a un número y lo convierte en int.
   * <p>
   */
  public static int voltea(int x) {
    return (int) voltea((long) x);
  }
  /**
   * Analiza si un número es primo.
   * <p>
   * @param x número que se quiere comprobar
   * @return true si es primo, false si no lo es.
   */
  public static boolean esPrimo(int x) {
    for (int contador = 2; contador < x; contador++) {
      if ((x % contador) == 0) {
        return false;
      }
    }
    return true;
  }
  /**
   * Muestra el siguiente número primo.
   * <p>
   * @param x número a partir del cual se quiere comprobar
   * @return el próximo nº primo.
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};
    return x;
  }
}
