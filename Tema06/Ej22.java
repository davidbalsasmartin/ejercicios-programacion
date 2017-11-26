/**
 * Capítulo 6, Ejercicio 22
 *
 * @author David.B.M.
 */

public class Ej22{
  public static void main (String[] args) {
		System.out.print("Por favor introduzca la longitud de la serpiente: ");
    int longitud =Integer.parseInt(System.console().readLine());
    int serpentear = 12;
    for (int contador = 1; contador <= longitud; contador++) {
      for (int contador2 = 1; contador2 <= serpentear; contador2++) {
        System.out.print(" ");
      }
      if (contador == 1) {
        System.out.println("@");
      } else {
        System.out.println("*");
      }
      int num = (int)(Math.random()*3 + 1);
      switch (num) {
        case 1:
          serpentear = serpentear - 1;
          break;
        case 2:
          serpentear = serpentear;
          break;
        case 3:
          serpentear = serpentear + 1;
          break;
        default:
      }
    }
	}
}

