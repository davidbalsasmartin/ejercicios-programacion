/**
 * Capítulo 6, Ejercicio 3
 *
 * @author David.B.M.
 */


public class Ej03{
  public static void main (String[] args) {
    System.out.println("De forma aleatoria ha salido la carta:");
    int carta = (int)(Math.random()*10) + 1;
    switch (carta){ 
      case 1:
        System.out.print("As");
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
        System.out.print("Sota");
      break;
      case 9:
        System.out.print("Caballo");
      break;
      case 10:
        System.out.print("Rey");
      break;
      default:
    }
    System.out.print(" de ");
    int palo = (int)(Math.random()*4) + 1;
    switch (palo){ 
      case 1:
        System.out.println("oro");
      break;
      case 2:
        System.out.println("bastos");
      break;
      case 3:
        System.out.println("espadas");
      break;
      case 4:
        System.out.println("copas");
      break;
      default:
    }
  }
}


