/**
 * Capítulo 3, Ejercicio 7
 *
 * @Author David.B.M.
 */

public class Ej7 {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduce la base imponible en euros: ");
    double base = Double.parseDouble(System.console().readLine());
    
    double iva = 0.21 ;
    System.out.println( "base imponible =  " + base + " €");
    System.out.println( "IVA            =  " + iva + " %" );
    System.out.println( "---------------------------");
    System.out.println( "Total factura  =  " + (base + (base * iva)) + " €");
  }
}
