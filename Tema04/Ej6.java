/**
 * Capítulo 4, Ejercicio 6
 *
 * @Author David.B.M.
 */

public class Ej6 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca una altura en metros");
    System.out.println("para calcular el tiempo que tardará en caer un objeto");
    double variableH = Double.parseDouble(System.console().readLine());
    
    double dividido = ((2 * variableH) / 9.81);
    
    if (dividido < 0) {
      System.out.println("No se puede resolver, puesto que no existe la raiz de 0");
    } else {
      System.out.printf("tardará = %.2f segundos", Math.sqrt(dividido));
    }
  }
}
