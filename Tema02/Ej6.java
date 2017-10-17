/**
 * Capítulo 2, Ejercicio 6
 *
 * @Author David.B.M.
 */

public class Ej6 {
  public static void main(String[] args) {
    double base = 800 ;
    double iva = 0.21 ;
    System.out.println( "base imponible =  " + base + " €");
    System.out.println( "IVA            =  " + iva + " €" );
    System.out.println( "Total factura  =  " + (base + (base * iva)) + " €");
  }
}
