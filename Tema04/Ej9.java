/**
 * Capítulo 4, Ejercicio 9
 *
 * @Author David.B.M.
 */

public class Ej9 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula una ecuación de segundo grado");
    System.out.print("Por favor, introduzca a: ");
    double valorA = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca b: ");
    double valorB = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca c: ");
    double valorC = Double.parseDouble(System.console().readLine());
    
    double operaDentroRaiz = ((valorB * valorB) - ((4 * valorA) * valorC));
    double raizCuad = Math.sqrt(operaDentroRaiz);
    double resultadoMas = ((-valorB + raizCuad) / (2 * valorA));
    double resultadoMenos = ((-valorB - raizCuad) / (2 * valorA));
    
    if (((valorA == 0) && (valorB == 0) && (valorC == 0)) || ((valorA == 0) && (valorB == 0) &&(valorC != 0))) {
    System.out.println("La ecuación tiene infinitas soluciones o no tiene ninguna");
    } else
    if ((valorA != 0) && (valorB == 0) && (valorC == 0)) {
    System.out.println("x = 0");
    } else
    if ((valorA == 0) && (valorB != 0) && (valorC == 0)) {
    System.out.println("x = 0");
    } else
    if ((valorA != 0) && (valorB != 0) && (valorC == 0)) {
    System.out.println("x = 0");
    System.out.println("x = " + (-valorB / valorA));
    } else
    if ((valorA == 0) && (valorB != 0) && (valorC != 0)) {
    System.out.println("x1 y x2 = " + (-valorC / valorB));
    } else
    if (operaDentroRaiz < 0) {
    System.out.println("No es posible averiguar el resultado");
    } else
    if (resultadoMas == resultadoMenos) {
    System.out.printf("x = ± %.2f %n", resultadoMas);
    } else {
    System.out.printf("x = %.2f %n", resultadoMas);
    System.out.printf("x = %.2f %n", resultadoMenos);
    }
  }
}
