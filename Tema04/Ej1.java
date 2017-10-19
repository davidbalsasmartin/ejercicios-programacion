/**
 * Capítulo 4, Ejercicio 1
 *
 * @author David.B.M.
 */

public class Ej1 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un día de la semana: ");
    String diaDeSem = System.console().readLine().toLowerCase();
    
    String primHora;
    
    switch (diaDeSem) {
      case "lunes":
        primHora = "Sistemas";
        break;
      case "martes":
        primHora = "Programación";
        break;
      case "miércoles":
      case "miercoles":
        primHora = "Sistemas";
        break;
      case "jueves":
        primHora = "Programación";
        break;
      case "viernes":
        primHora = "Programación";
        break;
      case "sábado":
      case "sabado":
        primHora = "No hay clase";
        break;
      case "domingo":
        primHora = "No hay clase";
        break;

      default:
        primHora = "No existe ese día";
    }

    System.out.println("Día " + diaDeSem + ": " + primHora);
  }
}
