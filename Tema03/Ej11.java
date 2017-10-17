/**
 * Capítulo 3, Ejercicio 11
 *
 * @Author David.B.M.
 */

public class Ej11 {
	
	public static void main (String[] args) {
    
            System.out.print("Por favor, introduce un número de kb: ");
    double kilos = Double.parseDouble(System.console().readLine());
    
    System.out.print( kilos + "kbs son " + ( kilos / 1024 ) + " mbs");
		
	}
}

