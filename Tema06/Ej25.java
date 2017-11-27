/**
 * Capítulo 6, Ejercicio 25
 *
 * @author David.B.M.
 */

public class Ej25{
  public static void main (String[] args) {
    
    for (int contador = 1; contador <= 100; contador++) {
      int num = (int)(Math.random()*191 + 10);
      int primo = 0;
      for (int contador2 = 2; contador2 < num; contador2++){
        if ((num % contador2) == 0){
          primo++;
        }
      }
      if (primo == 0) {
        System.out.print("#" + num + "# ");
      } if ((num % 5) == 0) {
        System.out.print("[" + num + "] ");
      } else {
        System.out.print(num + " ");
      }
    }
    
  }
}
