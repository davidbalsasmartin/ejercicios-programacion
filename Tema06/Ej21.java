/**
 * Capítulo 6, Ejercicio 21
 *
 * @author David.B.M.
 */

public class Ej21{
  public static void main (String[] args) {
    int contador = 1;
		do {
      int num = (int)(Math.random()*8 + 1);
      switch (num) {
        case 1:
          System.out.print("1 céntimo");
          break;
        case 2:
          System.out.print("2 céntimos");
          break;
        case 3:
          System.out.print("5 céntimos");
          break;
        case 4:
          System.out.print("10 céntimos");
          break;
        case 5:
          System.out.print("20 céntimos");
          break;
        case 6:
          System.out.print("50 céntimos");
          break;
        case 7:
          System.out.print("1 euro");
          break;
        case 8:
          System.out.print("2 euros");
          break;
        default:
      }
      int caraOCruz = (int)(Math.random()*2 + 1);
      switch (caraOCruz) {
        case 1:
          System.out.println(" Cruz");
          break;
        case 2:
          System.out.println(" Cara");
          break;
        default:
      }
      contador++;
    } while (contador <= 5);
	}
}

