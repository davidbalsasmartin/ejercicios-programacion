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
   *
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
   *
   * @param x número que se quiere voltear
   * @return número volteado.
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
    if (x == 1) {
     return false;
    }
    for (int contador = 2; contador < x; contador++) {
      if (((x % contador) == 0)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Muestra el siguiente número primo.
   *
   * @param x número a partir del cual se quiere comprobar
   * @return el próximo nº primo.
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
    }
    return x;
  }

  /**
   * Muestra si el número es capicúa.
   *
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
   *
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
   *
   * @param x número que se desea dividir
   * @return el nº de dígitos.
   */
  public static int digitos(long x) {
    int digitos = 1;
    while (x < 9) {
      x /= 10;
      digitos++;
    }
    return digitos;
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
    return (int) x % 10;
  }

  /**
   * Devuelve el dígito que está en una posición determinada de un número.
   *
   * @param x número
   * @param n posición del número a comprobar
   * @return dígito que está en la posición del número
   */
  public static int digitoN(int x, int n) {
    return digitoN((long) x, n);
  }

  /**
   * Da la posición del dígito de un número que coincida con la busqueda.
   *
   * @param x número
   * @param digit dígito a buscar
   * @return posición de la primera coincidencia del dígito dentro del número
   */
  public static int posicionDeDigito(long x, int digit) {
    int contador;
    for (contador = 0; (contador < digitos(x)) && (digitoN(x, contador) != digit); contador++) {
    }
    if (contador == digitos(x)) {
      return -1;
    } else {
      return contador;
    }
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
   * Le quita a un número <code>n</code> dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la derecha
   */
  public static int quitaPorDetras(int x, int n) {

    return (int)quitaPorDetras((long) x, n);
  }
  /**
   * Le quita a un número <code>n</code> dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  /**
   * Le quita a un número <code>n</code> dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial <code>x</code> con <code>n</code> dígitos menos
   *          quitados de la izquierda
   */
  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }

  /**
   * Añade un dígito a un número por detrás (por la derecha).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
   *          por la derecha
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  /**
   * Añade un dígito a un número por detrás (por la derecha).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return  número inicial <code>x</code> con el dígito <code>d</code> pegado
   *          por la derecha
   */
  public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
  }
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * <p>
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * <p>
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
  }

  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }

  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
    /**
   * Pone un número delantre de otro, formando uno solo.
   *
   * @param x número
   * @param num dígito que se va a pegar a la izquierda
   * @return número final
   */
  public static long pegaPorDelante(long x, int num) {
    long xAux = x;
    int longitud = 0;
    for (longitud = 0; xAux > 0; xAux /= 10) {
      longitud++;
    }
    do {
      num *= 10;
      longitud--;
    } while (longitud > 0);
    x = x + num;
    return x;
  }
  /**
   * Pone un número delantre de otro, formando uno solo.
   *
   * @param x número
   * @param num dígito que se va a pegar a la izquierda
   * @return número final
   */
  public static int pegaPorDelante(int x, int num) {
    return (int) pegaPorDelante((long) x, num);
  }
}
