/**
 * Capitulo 2 ej.6
 *
 * @autor David.B.M.
 */

public class Ejercicio26 {
  public static void main(String[] args) {
    double base = 800 ;
    double iva = 0.21 ;
    System.out.println( "base imponible =  " + base + " €");
    System.out.println( "IVA            =  " + iva + " €" );
    System.out.println( "Total factura  =  " + (base + (base * iva)) + " €");
  }
}
