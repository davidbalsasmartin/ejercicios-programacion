/**
 * Capítulo 4, Ejercicio 15
 *
 * @author David.B.M.
 */

public class Ej15 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una pirámide");
    System.out.println("Introduce el símbolo con el que construirla: ");
    String valor = System.console().readLine();
    System.out.println("Introduce hacia donde construirla:1"); 
    System.out.println("1: arri. 2: aba. 3: izq. 4: der. ");
    int haciaDonde = Integer.parseInt(System.console().readLine());
    
    switch (haciaDonde) {
      case 1:
      System.out.println("   " + valor);
      System.out.println("  " + valor + valor + valor);
      System.out.println(" " + valor + valor + valor + valor + valor);
      break;
      case 2:
      System.out.println(" " + valor + valor + valor + valor + valor);
      System.out.println("  " + valor + valor + valor);
      System.out.println("   " + valor);
      break;
      case 3:
      System.out.println(valor);
      System.out.println(valor + valor);
      System.out.println(valor + valor + valor);
      System.out.println(valor + valor);
      System.out.println(valor);
      break;
      case 4:
      System.out.println("   " + valor);
      System.out.println("  " + valor + valor);
      System.out.println(valor + valor + valor);
      System.out.println("  " + valor + valor);
      System.out.println("   " + valor);
      break;
    }
	}
}

