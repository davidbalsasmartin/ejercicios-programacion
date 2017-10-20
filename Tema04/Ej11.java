/**
 * Capítulo 4, Ejercicio 11
 *
 * @author David.B.M.
 */
 
public class Ej11 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el tiempo en segundos que falta para medianoche");
    System.out.println("Por favor, indica la hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, indica los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int calculoSegundos = ((horas * 3600) +(minutos * 60));
    
    if ((horas > 23) || (horas < 0) || (minutos < 0) || (minutos > 59)) {
    System.out.println("Esa hora exacta es inválida");
    } else {
    System.out.println("Si son las " + horas + "hs. y " + minutos + (" min."));
    System.out.println("Faltan " + (86400 - calculoSegundos) + " s. para medianoche.");
    }
	}
}
