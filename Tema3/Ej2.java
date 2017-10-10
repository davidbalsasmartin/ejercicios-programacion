/**
*
*2º ejercicio del tema 3
*
*Autor David Balsas
*/

public class Ej2 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduce una cantidad en euros: ");
    double eur = Double.parseDouble(System.console().readLine());

    double total = (eur * 166.386);

    System.out.println(eur + " euros son " + total + " pesetas.");
  }
}
