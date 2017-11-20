/**
 * Capítulo 6, Ejercicio 2
 *
 * @author David.B.M.
 */


public class Ej02{
  public static void main (String[] args) {
    System.out.println("De forma aleatoria ha salido la carta:");
    int carta = (int)(Math.random()*13) + 1;
    switch (carta){ 
      case 1:
      System.out.print("A");
      break;
      case 2:
      System.out.print("2");
      break;
      case 3:
      System.out.print("3");
      break;
      case 4:
      System.out.print("4");
      break;
      case 5:
      System.out.print("5");
      break;
      case 6:
      System.out.print("6");
      break;
      case 7:
      System.out.print("7");
      break;
      case 8:
      System.out.print("8");
      break;
      case 9:
      System.out.print("9");
      break;
      case 10:
      System.out.print("10");
      break;
      case 11:
      System.out.print("J");
      break;
      case 12:
      System.out.print("Q");
      break;
      case 13:
      System.out.print("K");
      break;
      default:
    }
    System.out.print(" de ");
    int palo = (int)(Math.random()*4) + 1;
    switch (palo){ 
      case 1:
      System.out.println("picas");
      break;
      case 2:
      System.out.println("corazones");
      break;
      case 3:
      System.out.println("diamantes");
      break;
      case 4:
      System.out.println("tréboles");
      break;
      default:
    }
  }
}

