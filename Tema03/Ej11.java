/**
 * Capitulo 3 ej.10
 *
 * @Author David Balsas Martín
 */


public class Ej11 {
	
	public static void main (String[] args) {
    
            System.out.print("Por favor, introduce un número de kb: ");
    double kilos = Double.parseDouble(System.console().readLine());
    
    System.out.print( kilos + "kbs son " + ( kilos / 1024 ) + " mbs");
		
	}
}

