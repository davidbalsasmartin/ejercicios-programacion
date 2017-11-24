/**
 * Capítulo 6, Ejercicio 16
 *
 * @author David.B.M.
 */

public class Ej16{
  public static void main (String[] args) {
    int contador = 0;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    for (contador = 1; contador <= 3 ; contador++) {
      int result = (int)(Math.random()*5+1);
      switch (result) {
        case 1:
          System.out.print("corazón ");
          break;
        case 2:
          System.out.print("diamante ");
          break;
        case 3:
          System.out.print("herradura ");
          break;
        case 4:
            System.out.print("campana ");
            break;
        case 5:
          System.out.print("limón ");
          break;
        default:
      }
      if (contador == 1) {
        num1 = result;
      } else if (contador == 2) {
        num2 = result;
      } else if (contador == 3) {
        num3 = result;
      }
    }
    System.out.println();
    if ((num1 == num2) && (num2 == num3)) {
      System.out.println("Enhorabuena, ha ganado 3 monedas");
    } else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
    System.out.println("Lo siento, ha perdido");
    }
	}
}

