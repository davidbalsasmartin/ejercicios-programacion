package Ej04Parte2;

/**
 * Capítulo 9, Ejercicio 4
 *
 * @author David.B.M.
 */
public class Ej04 {

  public static void main(String[] args) {
   Fraccion ea = new Fraccion(1, 2); 
   System.out.println(ea + " invertida es " + ea.invierte());
   System.out.println(ea + " multiplicado por 2/3 = " + ea.multiplica(2,3));
   System.out.println(ea + " dividido entre 3/4 = " + ea.divide(3, 4));
  }
}