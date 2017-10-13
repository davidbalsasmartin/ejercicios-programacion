/**
 *
 * 12º ejercicio del tema 3
 *
 * @Author David Balsas
 */
 
 public class Ej12 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce la primera nota: ");
    double primEx = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la nota del trimestre deseada: ");
    double deseo= Double.parseDouble(System.console().readLine());
    
    double result =(((deseo * 1) - (primEx * 0.40)) / 0.60);
    
    System.out.println(" La primera nota es =" + primEx);
    System.out.println(" Y se desea obtener " + deseo + " de media");
    System.out.println("Por lo tanto, la nota del segundo examen sería =" + result);
    
    
  }
}
