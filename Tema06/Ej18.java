/**
 * Capítulo 6, Ejercicio 18
 *
 * @author David.B.M.
 */

public class Ej18{
  public static void main (String[] args) {
    int color;
    int color2;
    int color3;
		do {
      color = (int)(Math.random()*6 + 1);
      color2 = (int)(Math.random()*6 + 1);
      color3 = (int)(Math.random()*6 + 1);
    } while ((color == color2) || (color2 == color3) || (color3 == color));

    switch (color) {
      case 1:
        System.out.println("Rojo");
        break;
      case 2:
        System.out.println("Azul");
        break;
      case 3:
        System.out.println("Verde");
        break;
      case 4:
        System.out.println("Amarillo");
        break;
      case 5:
        System.out.println("Violeta");
        break;
      case 6:
        System.out.println("Naranja");
        break;
    default:
    }
    switch (color2) {
      case 1:
        System.out.println("Rojo");
        break;
      case 2:
        System.out.println("Azul");
        break;
      case 3:
        System.out.println("Verde");
        break;
      case 4:
        System.out.println("Amarillo");
        break;
      case 5:
        System.out.println("Violeta");
        break;
      case 6:
        System.out.println("Naranja");
        break;
    default:
    }
    switch (color3) {
      case 1:
        System.out.println("Rojo");
        break;
      case 2:
        System.out.println("Azul");
        break;
      case 3:
        System.out.println("Verde");
        break;
      case 4:
        System.out.println("Amarillo");
        break;
      case 5:
        System.out.println("Violeta");
        break;
      case 6:
        System.out.println("Naranja");
        break;
    default:
    }
	}
}

