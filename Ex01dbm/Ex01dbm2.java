/**
 * Ejercicio 2 examen programación 1º DAW
 * 
 * Primer turno
 * 
 * 14/11/2017
 *
 * @author David Balsas Martín
 */


public class Ex01dbm2 {
  public static void main (String[] args) {
    System.out.println("Por favor, introduce 10 números");
    System.out.println("pulsando enter detrás de cada uno.");
    int contador = 1;
    double suma = 0;
    int contadorPrimos = 0;
    do { // repetir bucle
      int num = Integer.parseInt(System.console().readLine());
      contador++;
      int noPrimo = 0;

      int contador2;
      if (num > 1) { // comprobamos si es o no primo, exluyendo el 1
        for (contador2 = 2; contador2 < num; contador2++) {
          if (num % contador2 == 0) {
            noPrimo = 1 ;
          }
        }
        if (noPrimo == 0) {
          suma = suma + num;
          contadorPrimos++;
        } else;
        
      }
    } while (contador <= 10); //hasta 10 números
    if (contadorPrimos > 0) { // si es primo
      double media = suma / contadorPrimos;
      System.out.println("La media de números primos es " + media);
    } else { // si no es primo
      System.out.println("No ha introducido ningún número primo,");
      System.out.println("no puedo calcular la media");
    }
	}
}
