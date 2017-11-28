/**
 * Capítulo 7, Ejercicio 2
 *
 * @author David.B.M.
 */


public class Ej02{
  public static void main (String[] args) {
		
    char[] caracter = new char[10];
    caracter[0] = 'a';
    caracter[1] = 'x';
    caracter[4] = '@';
    caracter[6] = ' ';
    caracter[7] = '+';
    caracter[8] = 'Q';
    
    for (int contador = 0; contador < 10; contador++) {
				System.out.println(caracter[contador]);
    }
    
	}
}

