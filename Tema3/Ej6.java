/**
*
*6º ejercicio del tema 3
*
*Autor David Balsas
*/
 
 public class Ej6 {
  public static void main(String[] args) {
        
    System.out.print("Por favor, introduce la base del triángulo en cm: ");
    double base = Double.parseDouble(System.console().readLine());
        
    System.out.print("Por favor, introduce la altura del triángulo en cm: ");
    double altu = Double.parseDouble(System.console().readLine());
    
    
    
    System.out.println("La base del triángulo es = " + base + "cm");
    System.out.println("Y su altura = " + altu + "cm");
    System.out.println("Y por lo tanto su base es = " + ((base * altu) / 2 ) + "cm");
    
  }
}
