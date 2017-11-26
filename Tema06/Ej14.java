/**
 * Capítulo 6, Ejercicio 14
 *
 * @author David.B.M.
 */

public class Ej14{
  public static void main (String[] args) {
    int cont = 1;
    int acertar = 0;
    int valormax = 101;
    int valormin = 0;
    int valorAux = 0;
		while ((cont <= 5) && (acertar <= 0)) {
      int intento = (int)(Math.random()*valormax + valormin);
      
      System.out.println(intento);
      System.out.println("¿Es ese el número? 1 = si, 2 = no");
      int num = Integer.parseInt(System.console().readLine());
      if (num == 1) {
        acertar++;
      } else if (num == 2) {
        System.out.println("¿Es mayor o menor? 1 = menor; 2 = mayor");
        int valor = Integer.parseInt(System.console().readLine());
        if (valor == 1){
          valormax = valormax - intento - 1;
        } if (valor == 2){
          valormin = intento + 1;
          valormax = valormax - (intento + 1);
        }
      }
      cont++;
    }
	}
}

