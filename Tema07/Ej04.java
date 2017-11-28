package tema07;

import java.util.Scanner;

/**
 * Capítulo 7, Ejercicio 4
 *
 * @author David.B.M.
 */

public class Ej04{
  public static void main (String[] args) {
  
    Scanner s = new Scanner (System.in);
    int numero[] = new int [20];
    int cubo[] = new int [20];
    int cuadrado[] = new int [20];
    for (int contador = 0; contador < 20; contador++) {
      numero[contador] = ((int)(Math.random()*100)+ 1);
      cuadrado [contador] = numero[contador] * numero[contador];
      cubo [contador] = numero [contador] * numero [contador] * numero [contador];
    }
    for (int contador = 0; contador < 20; contador++) {
      System.out.printf("%8d %8d %8d \n", numero[contador], cuadrado[contador], cubo[contador]);
    }
  }
}
