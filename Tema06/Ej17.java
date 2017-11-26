/**
 * Capítulo 6, Ejercicio 17
 *
 * @author David.B.M.
 */

public class Ej17{
  public static void main (String[] args) {
		System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int x = ((int)(Math.random()*altura - 2) + 2);
    int y = ((int)(Math.random()*anchura - 2) + 2);
    for (int contador = 1; contador <= altura; contador++) {
      for (int contador2 = 1; contador2 <= anchura; contador2++) {
        if ((contador == 1) || (contador2 == 1) || (contador == altura) || (contador2 == anchura)) {
          System.out.print("* ");
        } else if ((contador == x) && (contador2 == y)) {
          System.out.print("& ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
	}
}

