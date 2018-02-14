package Ej02Parte2;
import java.util.Scanner;

/**
 * Capítulo 9, Ejercicio 2
 *
 * @author David.B.M.
 */
public class Ej02 {
  public static void main(String[] args) {
    int km = 0;
    int opcion = 0;
    Scanner s = new Scanner (System.in);
    
    Coche Lambo = new Coche("si");
    Bicicleta biciBH = new Bicicleta("si");
    
    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Derrapa con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      opcion = s.nextInt();
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = s.nextInt();
          biciBH.recorre(km);
          break;
        case 2:
          biciBH.derrapa();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = s.nextInt();
          Lambo.recorre(km);
          break;
        case 4:
          Lambo.derrapa();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(biciBH.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(Lambo.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrostotales() + " Km");
          break;
        case 8:
          System.out.println("FIN");
        default:
      }
    }
  }
}
