/**
 * Capítulo 5, Ejercicio 20
 *
 * @author David.B.M.
 */


public class Ej20 {
  public static void main (String[] args) {
    System.out.print("Introduce una altura para la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int alturaAux = 1;
    int espaciosAntes = altura ;
    int espaciosDentro = 0;
		while (alturaAux < altura) {
      for (int contador = 1; contador < espaciosAntes; contador++ ) {/*Espacios antes de la pirámide*/
        System.out.print(" ");
      }
      if (alturaAux == 1) { /*Primer espacio y asterisco*/
        System.out.println("*");
      }
      if ((alturaAux > 1) && (alturaAux < altura)) { /*Asteriscos intermedios*/
        System.out.print("*");
      }
      if (alturaAux == 2) {/*Si estás en la segunda*/
        System.out.print(" ");
      }
      if (alturaAux == 3) {/*Si estás en la tercera*/
        System.out.print("   ");
      }
      if ((alturaAux > 3) && (alturaAux < altura)) { /*Si estás entre la cuarta y la penúltima fila*/
        for (int contador = 1; contador < espaciosDentro; contador++) { /*Meter espacios dentro*/
          System.out.print(" ");
        }
      }
      if ((alturaAux > 1) && (alturaAux < altura)) {/*Si estás entre la segunda y la penúltima fila*/
        System.out.println("*"); /*Últimos asteriscos*/
      }
    espaciosDentro+=2;
    alturaAux++;
    espaciosAntes--;
    }
    for (int contador = 1; contador < altura * 2; contador++) { /*Pintar la última fila*/
      System.out.print("*");
    }
	}
}

