/**
 * Capítulo 5, Ejercicio 15
 *
 * @author David.B.M.
 */


public class Ej15 {

  public static void main(String[] args) {
    
    System.out.println("Por favor mete una base y pulsa enter");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor mete un exponente y pulsa enter");
    int exp = Integer.parseInt(System.console().readLine());
    int contador;
    int base2 = 1;
    for (contador = 1; contador <= exp; contador++ ) {
      base2 =  base2 * base;
      System.out.println(base + "()" + contador + " = " + base2);
    }
  }
}
