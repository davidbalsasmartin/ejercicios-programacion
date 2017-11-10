/**
 * Capítulo 5, Ejercicio 37
 *
 * @author David.B.M.
 */


public class Ej37 {
  public static void main (String[] args) {
    System.out.println("Por favor, introduce un número para convertirlo");
    System.out.print("A sistema palotes: ");
    int num = Integer.parseInt(System.console().readLine());
    int suma= 0;
    int suma2 = 0;
    while (num > 0) {
      int separarNum = num % 10;
      suma = (suma * 10) + (separarNum);
      num = num / 10;
    }
		while (suma > 0) {
      int separarNum2 = suma % 10;
      suma = suma / 10;
      for (int contador = 1; contador <= separarNum2; contador++) {
        System.out.print("|");
      }
      if (suma > 0) {
      System.out.print("-");
    } 
    }
	}
}

