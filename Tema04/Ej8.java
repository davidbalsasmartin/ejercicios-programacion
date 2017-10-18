/**
 * Capítulo 4, Ejercicio 8
 *
 * @Author David.B.M.
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

    if ((media >= -0.000000001) && (media <= 4.999999998)) {
    System.out.println("Suspenso");
    }
    if ((media >= 4.999999999) && (media <= 5.999999998)) {
    System.out.println("Suficiente");
    }
    if ((media >= 5.999999999) && (media <= 6.999999998)) {
    System.out.println("Bien");
    }
    if ((media >= 6.999999999) && (media <= 8.999999998)) {
    System.out.println("Notable");
    }
    if ((media >= 9.999999999) && (media <= 10.00000001)) {
    System.out.println("Sobresaliente");
    }
    if ((media < -0.000000001) || (media > 10.00000001)) {
    }
  }
}
