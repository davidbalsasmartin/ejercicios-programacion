/**
 * Ejercicio 4 examen programación 1º DAW
 * 
 * Primer turno
 * 
 * 14/11/2017
 *
 * @author David Balsas Martín
 */


public class Ex01dbm4 {
  public static void main (String[] args) {
    System.out.println("Por favor, introduce un número para saber si es donut:");
    int num = Integer.parseInt(System.console().readLine());
    
    int numAux = num;
    int longitud = 0;
    int positivo = 0;
    int numAux2= num;
    
    do { // comprobamos la longitud
      numAux2 /= 10;
      longitud++;
    } while (numAux2 > 0);
    
    if ((longitud % 2) == 0) { // si es par
      int contar = 0;
      while (numAux > 0) { // lo dividimos
        int separarNum = numAux % 10;
        numAux = numAux / 10;
        contar++;
        if ((longitud / 2) == contar) { // si un 0 central es cierto
          if (separarNum == 0) {
            positivo++;
          } else;
        } else if (((longitud / 2) + 1) == contar) { // si el otro es cierto
          if (separarNum == 0) {
            positivo++;
          }
        }
      }
      if (positivo > 1) { // si es donut
        System.out.println("El número " + num + " es un número donut.");
      } else { // si no es donut
        System.out.println("El número " + num + " no es un número donut.");
      }
    } else { // si es impar
      int contar = 0;
      while (numAux > 0) { // lo dividimos
        int separarNum = numAux % 10;
        numAux = numAux / 10;
        contar++;
        if (((longitud / 2) + 1) == contar) { //posicion central
          if (separarNum == 0) { // si es cierto el 0 central
            positivo++;
          }
        }
      }
      if (positivo > 0) { // si es verdadero
        System.out.println("El número " + num + " es un número donut.");
      } else { // si n es verdarero
        System.out.println("El número " + num + " no es un número donut.");
      }
    }
	}
}
