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
    while (!esPrimo(++x)) {
    };
    return x;
  }

  /**
   * Muestra si el número es capicúa.
   * <p>
   * @param x número que se quiere comprobar
   * @return verdadero si x es capicúa.
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  /**
   * Muestra si el número es capicúa.
   * <p>
   * @param x número que se quiere comprobar
   * @return verdadero si x es capicúa.
   */
  public static boolean esCapicua(int x) {
    return esCapicua((long) x);
  }

  /**
   * Muestra un número elevado a cierta potencia.
   * <p>
   * @param x número base
   * @param exponente número al que se debe elevar
   * @return el nº elevado a la potencia.
   */
  public static int potencia(int x, int exponente) {
    int elevado = x;
    if (exponente > 1) {
      for (int contador = 2; contador <= exponente; contador++) {
        elevado = elevado * x;
      }
    }
    return elevado;
  }

  /**
   * Muestra el número de dígitos de un nº.
   * <p>
   * @param x número que se desea dividir
   * @return el nº de dígitos.
   */
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }
    if (x == 0) {
      return 1;
    } else {
      int contador = 0;
      while (x > 0) {
        x = x / 10;
        contador++;
      }
      return contador;
    }
  }
  /**
   * Muestra el número de dígitos de un nº.
   * <p>
   * @param x número que se desea dividir
   * @return el nº de dígitos.
   */
  public static int digitos(int x) {
    return (int) digitos((long) x);
  }
  /**
   * Devuelve el dígito que está en una posición determinada de un número.
   *
   * @param x número
   * @param n posición del número a comprobar
   * @return dígito que está en la posición del número
   */
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }
    return (int)x % 10;
  }
  /**
   * Devuelve el dígito que está en una posición determinada de un número.
   *
   * @param x número
   * @param n posición del número a comprobar
   * @return dígito que está en la posición del número
   */
  public static int digitoN(int x, int n) {
    return digitoN((long)x, n);
  }
  /**
   * Da la posición del dígito de un número que coincida con la busqueda.
   *
   * @param x número
   * @param digit dígito a buscar
   * @return  posición de la primera coincidencia del dígito dentro del número
   */
  public static int posicionDeDigito(long x, int digit) {
    int contador;
    for (contador = 0; (contador < digitos(x)) && (digitoN(x, contador) != digit); contador++) {};
    if (contador == digitos(x)) {
      return -1;
    } else {
      return contador;
    }
  }
  /**
   * Da la posición del dígito de un número que coincida con la busqueda.
   *
   * @param x número
   * @param digit dígito a buscar
   * @return  posición de la primera coincidencia del dígito dentro del número
   */
  public static int posicionDeDigito(int x, int digit) {
    return posicionDeDigito((long)x, digit);
  }
  /**
   * Le quita a un número <code>n</code> dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la derecha
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
    /**
   * Le quita a un número dígitos por la derecha. 
   *
   * @param x número
   * @param num número de dígitos que se le van a quitar
   * @return  número con dígitos restados
   */
  public static int quitaPorDetras(int x, int num) {
    return (int)quitaPorDetras((long) x, num);
  }
  /**
   * Pone un número delantre de otro, formando uno solo.
   *
   * @param x número
   * @param num dígito que se va a pegar a la izquierda
   * @return  número final
   */
  public static int pegaPorDelante(long x, int num) {
    long xAux = x;
    int longitud;
      for (longitud = 0; xAux > 0; xAux/=10) {
        longitud++;
      }
      do {
        num*= 10;
        longitud--;
      }while (longitud < 0);
    return 0;
  }
}
