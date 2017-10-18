/**
 * Capítulo 4, Ejercicio 3
 *
 * @Author David.B.M.
 */

public class Ej3 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número de día de la semana: ");
    int numSemana = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSem;
    
    switch (numSemana) {
      case 1:
        diaDeLaSem = "Lunes";
        break;
      case 2:
        diaDeLaSem = "Martes";
        break;
      case 3:
        diaDeLaSem = "Miércoles";
        break;
      case 4:
        diaDeLaSem = "Jueves";
        break;
      case 5:
        diaDeLaSem = "Viernes";
        break;
      case 6:
        diaDeLaSem = "Sábado";
        break;
      case 7:
        diaDeLaSem = "Domingo";
        break;

      default:
        diaDeLaSem = "No existe ese día";
    }

    System.out.println("Número " + numSemana + ": Día " + diaDeLaSem);
  }
}
