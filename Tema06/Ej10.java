/**
 * Capítulo 6, Ejercicio 10
 *
 * @author David.B.M.
 */

public class Ej10{
  public static void main (String[] args) {
  
    int simbol = 0;
    int longitud = 0;
    for (int contador = 1; contador <= 10; contador++){
      simbol = (int)(Math.random() * 6 + 1);
      longitud = (int)(Math.random() * 40 + 1);
      for (int contador2 = 1; contador2 <= longitud; contador2++){
        switch (simbol){
          case 1:
            System.out.print("*");
            break;
          case 2:
            System.out.print(".");
            break;
          case 3:
            System.out.print("@");
            break;
          case 4:
            System.out.print("-");
            break;
          case 5:
            System.out.print("=");
            break;
          case 6:
            System.out.print("|");
            break;
          default:
        }
      }
      System.out.println();
    }
	}
}

