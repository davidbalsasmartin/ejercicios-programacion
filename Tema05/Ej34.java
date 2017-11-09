/**
 * Capítulo 5, Ejercicio 34
 *
 * @author David.B.M.
 */


public class Ej34 {
  public static void main (String[] args) {
		System.out.print("Por favor introduce un número :");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor introduce otro número :");
    int num2 = Integer.parseInt(System.console().readLine());
    int separar1;
    int separar2;
    int pares = 0;
    int impares = 0;
    int suma2= 0;
    int suma= 0;
    int longitud = 0;
    while (num > 0) {
      int separarNum = num % 10;
      suma = (suma * 10) + (separarNum);
      num = num / 10;
      longitud++;
    }
    while (num2 > 0) {
    int separarNum2 = num2 % 10;
    suma2 = (suma2 * 10) + (separarNum2);
    num2 = num2 / 10;
    }
    for (int contador = 1; contador <= longitud; contador++){
      separar1 = suma % 10;
      suma = suma / 10;
      if ((separar1 % 2) == 0) {
        pares = separar1 + (pares * 10);
      } 
      if ((separar1 % 2) != 0) {
        impares = separar1 + (impares * 10);
      }
      if (suma2 > 0) {
        separar2 = suma2 % 10;
        suma2 = suma2 / 10;
        if ((separar2 % 2) == 0) {
          pares = separar2 + (pares * 10);
      } 
        if ((separar2 % 2) != 0) {
          impares = separar2 + (impares * 10);
        }
      }
    }
      if (pares != 0) {
      System.out.println("pares = " + pares);
      }
      if (impares != 0) {
      System.out.println("impares = " + impares);
      }
    
  }
}

