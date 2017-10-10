/**
 * Capitulo 3 ej.8
 *
 * Autor David Balsas Martín
 */

public class Ej8 {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduce las horas semanales trabajadas: ");
    double horas = Double.parseDouble(System.console().readLine());
    
    System.out.println( "Ha trabajado =  " + horas + " horas/semana");
    System.out.println( "Salario semanal =  " + (horas * 12) + "€" );
  }
}
