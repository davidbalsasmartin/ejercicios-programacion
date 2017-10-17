/**
 * Capítulo 3, Ejercicio 2
 *
 * @Author David.B.M.
 */

public class Ej2 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduce una cantidad en euros: ");
    double eur = Double.parseDouble(System.console().readLine());

    int pts = (int)(eur * 166.386);

    System.out.println(eur + " euros son " + pts + " pesetas.");
  }
}
