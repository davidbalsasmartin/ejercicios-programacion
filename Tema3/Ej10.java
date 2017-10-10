/**
 * Capitulo 3 ej.10
 *
 * Autor David Balsas Martín
 */


public class Ej10 {
	
	public static void main (String[] args) {
    
        System.out.print("Por favor, introduce un número de mb: ");
    double megas = Double.parseDouble(System.console().readLine());
    
    System.out.print( megas + "mbs son " + ( megas * 1024 ) + " kbs");
		
	}
}

