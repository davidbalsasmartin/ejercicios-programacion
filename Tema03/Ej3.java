/**
 * Capítulo 3, Ejercicio 3
 *
 * @Author David.B.M.
 */

 public class Ej3 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduce una cantidad en pesetas: ");
    int pes = Integer.parseInt(System.console().readLine());

    double total = ((double) pes / 166.386);
    
    System.out.println(pes + " pesetas son " + total + " euros.");
  }
}
