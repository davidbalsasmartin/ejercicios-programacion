/**
 *
 *5º ejercicio del tema 3
 *
 * @aAuthor David Balsas
 */
 
 public class Ej5 {
  public static void main(String[] args) {
        
    System.out.print("Por favor, introduce la base del rectángulo en cm: ");
    double base = Double.parseDouble(System.console().readLine());
        
    System.out.print("Por favor, introduce la altura del rectángulo en cm: ");
    double altu = Double.parseDouble(System.console().readLine());
    
    System.out.println("La base del rectángulo es = " + base + "cm");
    System.out.println("Y su altura = " + altu + "cm");
    System.out.println("Y por lo tanto su base es = " + (base*altu) + "cm");
    
  }
}
