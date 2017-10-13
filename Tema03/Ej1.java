/**
 *
 *1º ejercicio del tema 3
 *
 * @Author David Balsas
 */
public class Ej1 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce un número entero: ");
    int primerN = Integer.parseInt(System.console().readLine());

    System.out.print("introduce otro, por favor: ");
    int segundoN = Integer.parseInt(System.console().readLine());

    int total = (primerN * segundoN);

    System.out.print("El primer número introducido es " + primerN);
    System.out.println(" y el segundo es " + segundoN);
    System.out.print("Su producto es " + total); 
  } 
}
