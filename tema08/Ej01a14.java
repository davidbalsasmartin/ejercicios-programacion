package tema08;

/**
 * Capítulo 8, Ejercicios 1 - 14
 *
 * @author David.B.M.
 */
import mates.matematicas;

public class Ej01a14 {

  public static void main(String[] args) {
    //voltea
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
    //esCapicua
    if (mates.matematicas.esCapicua(7456)) {
      System.out.println("El número 7456 es capicúa");
    } else {
      System.out.println("El número 7456 no es capicúa");
    }
    if (mates.matematicas.esCapicua(766667)) {
      System.out.println("El número 766667 es capicúa");
    } else {
      System.out.println("El número 766667 no es capicúa");
    }
    //potencia
    System.out.println("El número 2 elevado a 3 es: " + mates.matematicas.potencia(2, 3));
    System.out.println("El número 4 elevado a 5 es: " + mates.matematicas.potencia(4, 5));
    //digitos
    System.out.println("El número 2345 tiene: " + mates.matematicas.digitos(2345) + " cifras");
    System.out.println("El número -23 tiene: " + mates.matematicas.digitos(-23) + " cifras");
    // posicionDeDigito
    System.out.println("En el 385232, el dígito 3 está en la posición " + mates.matematicas.posicionDeDigito(385232, 3));
    System.out.println("En el 78321, el dígito 5 está en la posición " + mates.matematicas.posicionDeDigito(78321, 5));
    System.out.println("En el 7821, el dígito 1 está en la posición " + mates.matematicas.posicionDeDigito(7821, 1));
    // quitaPorDetras
    System.out.println("Si al 123456789 se le quitan por detrás 4 dígitos, se queda como " + mates.matematicas.quitaPorDetras(123456789, 4));
    System.out.println("Si al 12344321 se le quita por detrás 1 dígito, se queda como " + mates.matematicas.quitaPorDetras(12344321, 1));
    // pegaPorDelante
    System.out.println("Si al 123 se le pega el nº 67, se queda como " + mates.matematicas.pegaPorDelante(123, 67));
    System.out.println("Si al 456789 se le pega el nº 89, se queda como " + mates.matematicas.pegaPorDelante(456789, 89));
    // digitoN
    System.out.println("En la posición 4 del 123456789 está el " + mates.matematicas.digitoN(123456789, 4));
    System.out.println("En la posición 1 del 12344321 está el " + mates.matematicas.digitoN(12344321, 1));
    
    //MIRAR


    // posicionDeDigito ////////////////////////////////////////////

    System.out.println("En el 3452, el dígito 4 está en la posición " + mates.matematicas.posicionDeDigito(3452, 4));
    System.out.println("En el 78604321, el dígito 1 está en la posición " + mates.matematicas.posicionDeDigito(78604321, 1));

    // quitaPorDetras //////////////////////////////////////////////

    System.out.println("Si al 78604321 se le quitan por detrás 4 dígitos, se queda como " + mates.matematicas.quitaPorDetras(78604321, 4));
    System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda como " + mates.matematicas.quitaPorDetras(1000, 1));

    // quitaPorDelante /////////////////////////////////////////////

    System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + mates.matematicas.quitaPorDelante(78604321, 4));
    System.out.println("Si al 78604000 se le quitan por delante 2 dígitos, se queda como " + mates.matematicas.quitaPorDelante(78604000, 2));

    // pegaPorDetras ///////////////////////////////////////////////

    System.out.println("Si al 567 se le pega por detrás el 1 da el " + mates.matematicas.pegaPorDetras(567, 1));
    System.out.println("Si al 33 se le pega por detrás el 0 da el " + mates.matematicas.pegaPorDetras(33, 0));

    // pegaPorDelante //////////////////////////////////////////////

    System.out.println("Si al 567 se le pega por delate el 1 da el " + mates.matematicas.pegaPorDelante(567, 1));
    System.out.println("Si al 33 se le pega por delante el 0 da el " + mates.matematicas.pegaPorDelante(33, 0));

    // trozoDeNumero ///////////////////////////////////////////////

    System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + mates.matematicas.trozoDeNumero(78604000, 0, 3));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: " + mates.matematicas.trozoDeNumero(78604000, 4, 6));

    // juntaNumeros ////////////////////////////////////////////////

    System.out.println("Juntando el 21 y el 40 da el " + mates.matematicas.juntaNumeros(21, 40));
    System.out.println("Juntando el 789 y el 250 da el " + mates.matematicas.juntaNumeros(789, 250));

  }
}
