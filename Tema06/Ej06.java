/**
 * Capítulo 6, Ejercicio 6
 *
 * @author David.B.M.
 */

public class Ej06{
  public static void main (String[] args) {
    System.out.println("Por favor, intenta adivinar el número aleatorio entre 0 y 100");
    System.out.println("Hay 5 oportunidades:");
    int numAle = (int)(Math.random()*100 +1);
    int contador = 0;
    int num;
      do {
        if (contador > 0){
          System.out.println("Por favor, inténtelo de nuevo:");
        }
        num = Integer.parseInt(System.console().readLine());
        contador++;
        
        if (num != numAle){
          System.out.print("Has fallado, ");
          if (num <= numAle){
            System.out.println("el número es más grande que el introducido.");
          } else {
            System.out.println("el número es más pequeño que el introducido.");
          }
          System.out.println("Te quedan " + (5 - contador) + " intentos");
        }
      } while ((contador < 5) || (numAle == num));
      if (numAle == num){
        System.out.print("¡Bien hecho, has acertado!");
      } else {
        System.out.print("Lo siento, no hay más intentos.");
      }
	}
}

