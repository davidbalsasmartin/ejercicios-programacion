/**
 * Capítulo 3, Ejercicio 8
 *
 * @Author David.B.M.
 */

public class Ej8 {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduce las horas semanales trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.println( "Ha trabajado =  " + horas + " horas/semana");
    System.out.println( "Salario semanal =  " + (horas * 12) + "€" );
  }
}
