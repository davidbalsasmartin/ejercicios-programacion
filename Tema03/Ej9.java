/**
 * Capítulo 3, Ejercicio 9
 *
 * @Author David.B.M.
 */

 public class Ej9 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce el radio del cono en cm: ");
    double radio = Double.parseDouble(System.console().readLine());
        System.out.print("Por favor, introduce la altura del cono en cm: ");
    double altu= Double.parseDouble(System.console().readLine());
    
    double volum =(((0.33) * 3.141592) * (radio * radio) * altu);
  
    System.out.println("El radio del cono es =" + radio + " cm");
    System.out.println("Y su altura =" + altu + " cm");
    
    System.out.printf("Por lo tanto, su volumen es =  %.2f cm cúbicos.\n", volum);
    
  }
}
