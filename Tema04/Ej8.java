/**
 * Capítulo 4, Ejercicio 8
 *
 * @author David.B.M.
 */

public class Ej8 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la media y la nota final");
    System.out.print("Por favor, introduzca la primera nota: ");
    double primeraN = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota: ");
    double segundaN = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota: ");
    double terceraN = Double.parseDouble(System.console().readLine());
    
    double media = ((primeraN + segundaN + terceraN) / 3);
    System.out.printf("La media es = %.2f %n", media);

    //else niega un if
    
    //else if niega todos 

    if ((media > -0.000000001) && (media <= 4.999999998)) {
    System.out.println("Suspenso");
    } else if (media <= 5.999999998) {
    System.out.println("Suficiente");
    } else if (media <= 6.999999998) {
    System.out.println("Bien");
    } else if (media <= 8.999999998) {
    System.out.println("Notable");
    } else if (media <= 10.00000001) {
    System.out.println("Sobresaliente");
    } else {
    System.out.println( "Esa nota no es posible" );
    }
  }
}
