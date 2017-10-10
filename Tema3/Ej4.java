/**
*
*4º ejercicio del tema 3
*
*Autor David Balsas
*/
 
 public class Ej4 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduce un número: ");
    double primerN = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce otro número: ");
    double segundoN = Double.parseDouble(System.console().readLine());

    double suma  = (primerN + segundoN);
    double resta = (primerN - segundoN);
    double mult = (primerN * segundoN);
    double div = (primerN / segundoN);

    System.out.println("El primer número es =" + primerN);
    System.out.println("El segundo número es =" + segundoN);
    System.out.println("La suma es =" + suma);
    System.out.println("La resta del primero menos el segundo es =" + resta);
    System.out.println("La multiplicación es =" + mult);
    System.out.println("La división del primero entre el segundo es =" + div);
  }
}
